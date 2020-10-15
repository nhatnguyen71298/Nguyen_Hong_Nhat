package hom_dien_tu.controllers;


import hom_dien_tu.entity.Lettter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControllerKhanhBeDe {
    @GetMapping("/")
    public String homeView(Model model){
        model.addAttribute("letter",new Lettter());
        return "home";
    }
    @PostMapping("/showInfo")
    public String inforMation(@ModelAttribute Lettter letter,Model model){
        if (letter.getSpamFilter()==null){
            letter.setSpamFilter("Unchecked");
        }
        model.addAttribute("newLetter", letter);
        model.addAttribute("updateLetter", new Lettter());
        return "showInfo";
    }
    @PostMapping("/update")
    public String update(){

        return "home";
    }


}
