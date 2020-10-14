package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import services.DirectoryService;

@Controller
public class DictionaryController {

    @Autowired
    private DirectoryService directoryService;

    @GetMapping("/")
    public String goToView(){
        return "view_dictionary";
    }

    @GetMapping("/result")
    public String goToResult(@RequestParam String engMean, Model model){
        String result= this.directoryService.vietnamMean(engMean);
        model.addAttribute("result",result);
        model.addAttribute("engMean",engMean);
        return "result";
    }
}
