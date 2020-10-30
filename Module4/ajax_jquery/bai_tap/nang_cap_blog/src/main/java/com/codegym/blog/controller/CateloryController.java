package com.codegym.blog.controller;

import com.codegym.blog.services.BlogServices;
import com.codegym.blog.services.impl.CateloryServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CateloryController {
    @Autowired
    private CateloryServicesImpl cateloryServices;

    @Autowired
    private BlogServices blogServices;

    @GetMapping("/catelory_form")
    public String goCateloryView(Model model, @PageableDefault(size = 2) Pageable pageable){
        model.addAttribute("allCatelory",this.cateloryServices.findAllCatelory(pageable));
        return "catelory/list";
    }
    @GetMapping("/search_blog_by_catelory")
    public String goLisblogSearchByCateloryID(Model model, @RequestParam Integer idCatelory, @PageableDefault(size = 2) Pageable pageable){
        model.addAttribute("allBlog",this.blogServices.findAllByCateloryBlogId(pageable,idCatelory));
        model.addAttribute("idCatelory",idCatelory);
        return "catelory/list_blog_by_catelory_id";
    }
}
