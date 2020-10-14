package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChangeMoneyController {
    @GetMapping("/")
    public String view(){
        return "view_change_money";
    }
    @GetMapping("/result")
    public String changeMoney(@RequestParam String vnd, Model model){
        double dolar= Double.parseDouble(vnd)/23000;
        model.addAttribute("result",dolar);
        return "result";
    }
}
