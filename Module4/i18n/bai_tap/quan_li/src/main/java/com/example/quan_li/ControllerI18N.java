package com.example.quan_li;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerI18N {
    @GetMapping()
    public String view(){
        return "view";
    }
}
