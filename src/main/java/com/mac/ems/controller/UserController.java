package com.mac.ems.controller;

import com.mac.ems.service.custom.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    UserServiceImpl service;

    public UserController(UserServiceImpl service){
        this.service = service;
    }
}
