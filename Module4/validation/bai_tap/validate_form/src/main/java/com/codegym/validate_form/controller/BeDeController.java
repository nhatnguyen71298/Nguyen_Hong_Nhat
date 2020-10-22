package com.codegym.validate_form.controller;

import com.codegym.validate_form.entity.BeDe;
import com.codegym.validate_form.services.BeDeServies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BeDeController {

    @Autowired
    private BeDeServies beDeServies;

    @GetMapping("/")
    public String goHomeiew(Model model){
        model.addAttribute("newBeDe",new BeDe());
        return "form";
    }
    @PostMapping("/create")
    public String saveBeDe(@Validated @ModelAttribute("newBeDe") BeDe newBeDe, BindingResult bindingResult, Model model){
            if (bindingResult.hasFieldErrors()){
                model.addAttribute("newBeDe",newBeDe);
                return "form";
            }
            this.beDeServies.saveBeDe(newBeDe);
            return "result";
        }
    @GetMapping("/list")
    public String listBeDe(Model model, @PageableDefault(size = 3) Pageable pageable){
        model.addAttribute("listBeDe",this.beDeServies.fillAllBeDe(pageable));
        return "list";
    }
}
