package org.launchcode.Tour.controllers;


import org.launchcode.Tour.data.SiteRepository;
import org.launchcode.Tour.models.Site;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("")
public class SiteController {

    @Autowired
    private SiteRepository siteRepository;

    @GetMapping("user")
    public String displayAllSites(Model model){
        model.addAttribute("title", "All Sites");
        model.addAttribute("sites", siteRepository.findAll());
        return "user";
    }

    @GetMapping(value = "admin")
    public String displayAddSiteForm(Model model, HttpServletRequest request) {
        model.addAttribute("title", "Add Site Information");
        model.addAttribute("site", new Site());
//        model.addAttribute("types", SiteType.values());
        return "admin";
    }

    @PostMapping("admin")
    public String processAddSiteForm (@Valid @ModelAttribute Site newSite, Errors errors, Model model){
        if(errors.hasErrors()){
            model.addAttribute("title", "Add Site");
            return "admin";
        }

        siteRepository.save(newSite);
        return "redirect:/admin";
    }
}
