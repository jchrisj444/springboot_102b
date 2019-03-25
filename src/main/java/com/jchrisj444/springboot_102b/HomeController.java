package com.jchrisj444.springboot_102b;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homePage(Model model1, Model model2) {
        model1.addAttribute("myvar1", "Hello.");
        model2.addAttribute("myvar2", "My name is Chris.");
        return "hometemplate";
    }
}
