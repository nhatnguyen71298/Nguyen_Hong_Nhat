package com.codegym.blog.controller;

import com.codegym.blog.entity.AppRole;
import com.codegym.blog.entity.AppUser;
import com.codegym.blog.services.impl.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class LoginController {

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @Autowired
    private PasswordEncoder passwordEncoder;



    @GetMapping("/")
    public String loginView(){
        return "login";
    }

    @GetMapping("/register")
    public String registerForm(Model model){
        model.addAttribute("newUser",new AppUser());
        return "register";
    }

    @PostMapping("/register")
    public String saveUser(@RequestParam("appRole")  Long[] appRole,@ModelAttribute("newUser") AppUser newUser,Model model ){

        boolean checkError=false;
        List<AppUser> appUsers=this.userDetailsService.allUser();
        for (AppUser appUser:appUsers){
            if (newUser.getUserName().equals(appUser.getUserName())){
                checkError=true;
                break;
            }
        }

        if (checkError){
            model.addAttribute("message","Username already exists !");
            return "register";
        } else {
            newUser.setEncrytedPassword(passwordEncoder.encode(newUser.getEncrytedPassword()));
            for (int i=0;i<appRole.length;i++){
                this.userDetailsService.saveAppUser(newUser,appRole[i]);
            }
        }
        return "redirect:/";
    }
}
