package com.zs.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping(value = "/hello")
    @ResponseBody
    public Object hello(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("hello","hello");
        modelAndView.setViewName("freemarker/index");
        return modelAndView;
    }
}
