package com.zs.demo.controller;

import com.zs.demo.common.ServerResponse;
import com.zs.demo.dao.UserRepository;
import com.zs.demo.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    @Resource
    private UserRepository userRepository;

    @GetMapping("/findAll")
    public List findAll(){
        List<User> users = userRepository.findAll();
        ServerResponse<List<User>> response = ServerResponse.createBySuccess(users);
        int i = 1/0;
        List<User> data = response.getData();
        return data;
    }
}
