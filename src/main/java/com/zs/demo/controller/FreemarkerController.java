package com.zs.demo.controller;

import com.zs.demo.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/ftl")
public class FreemarkerController {

    @RequestMapping(value = "/index")
    public String index(ModelMap map) {
        User user = new User();
        user.setUsername("周晟");
        user.setPassword("");
        user.setEmail("zhousheng1993@outlook.com");
        map.addAttribute("user", user);
//        model.addAttribute("user",user);
        return "freemarker/index";
    }
}
