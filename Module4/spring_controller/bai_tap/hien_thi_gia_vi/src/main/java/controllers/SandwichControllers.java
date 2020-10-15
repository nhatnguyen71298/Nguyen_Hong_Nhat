package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichControllers {
    @GetMapping("/")
    public String homeView(){
        return "home";
    }
    @GetMapping("/sandwich")
    public String result(@RequestParam("sandwich") String[] sandwich, Model model){
        String result="";
        for (int i=0;i<sandwich.length;i++){
            result += sandwich[i]+ "<br>";
        }
        model.addAttribute("result",result);
        return "result";
    }
}
