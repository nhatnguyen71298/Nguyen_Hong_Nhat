package com.gym.case_study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping({"/","/login"})
    public String homeView(){
        return "login";
    }
    @GetMapping("/403")
    public String errorView(){
        return "403";
    }
}
