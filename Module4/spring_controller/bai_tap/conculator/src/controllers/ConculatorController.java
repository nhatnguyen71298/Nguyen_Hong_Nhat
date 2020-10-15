package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConculatorController {
    @GetMapping("/")
    public String home(){
        return "conculator";
    }

    @GetMapping("/conculator")
    public String conculator(@RequestParam double num1, @RequestParam double num2,@RequestParam String conculator, Model model){
        double result=0;
        switch (conculator){
            case "Additon(+)":
                result=num1+num2;
                break;
            case "Subtraction(-)":
                result=num1-num2;
                break;
            case "Multiplication(X)":
                result=num1*num2;
                break;
            case "Division(/)":
                result=num1/num2;
                break;
        }
        model.addAttribute("result",result);
        return "conculator";
    }
}
