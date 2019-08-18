package com.zs.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping(value = "/hello")
    public Object hello(Model model) {
        model.addAttribute("hello","hello");
        return "freemarker/index";
    }
}
