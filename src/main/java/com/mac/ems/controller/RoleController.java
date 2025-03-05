package com.mac.ems.controller;

import com.mac.ems.service.custom.impl.RoleServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/role")
public class RoleController {

    RoleServiceImpl service;

    public RoleController(RoleServiceImpl service){
        this.service = service;
    }
}
