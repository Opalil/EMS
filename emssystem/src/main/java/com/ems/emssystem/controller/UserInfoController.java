package com.ems.emssystem.controller;

import com.ems.emssystem.model.UserInfo;
import com.ems.emssystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserInfoController {

    UserInfo userInfo = new UserInfo();

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<UserInfo> getAll(){
        return userService.findAll();
    }

}
