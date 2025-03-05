package com.mac.ems.controller;

import com.mac.ems.service.custom.impl.DepartmentServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    DepartmentServiceImpl service;

    public DepartmentController(DepartmentServiceImpl service){
        this.service = service;
    }
}
