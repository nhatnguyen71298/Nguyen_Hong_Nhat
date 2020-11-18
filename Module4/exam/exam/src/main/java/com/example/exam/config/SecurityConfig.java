package com.gym.case_study.config;


import com.gym.case_study.services.impl.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder;
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        // Sét đặt dịch vụ để tìm kiếm User trong Database.
        // Và sét đặt PasswordEncoder.
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // csrf
        http.csrf().disable();

        // login
        http.formLogin()
                .loginProcessingUrl("/checkLogin")
                .loginPage("/login")
                // login successful
                .defaultSuccessUrl("/home")
                // login failed
                .failureUrl("/?error=true")
                // setting username, password
                .usernameParameter("username")
                .passwordParameter("password")
                // logout
                .and().logout().logoutUrl("/logout")
                // logout successful
                .logoutSuccessUrl("/");

        // Authorization
        http.authorizeRequests().antMatchers("/","/logout").permitAll();
//        user
        http.authorizeRequests().antMatchers("/home","/service",
                "/contract","/employee",
                "/contract_detail").hasAnyRole("ADMIN","USER");
//       admin
        http.authorizeRequests().antMatchers("/create_customer","/update_customer",
                "/delete_customer","/create_employee","/update_employee","/delete_employee",
                "/create_contract","/create_contract_detail","/create_service").hasRole("ADMIN");
//        no permission
        http.exceptionHandling().accessDeniedPage("/403");
//        remember me
        http.rememberMe()
                .rememberMeParameter("rememberMe")
                .rememberMeCookieName("remember")
                .tokenValiditySeconds(60);

    }
}
