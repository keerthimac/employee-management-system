package com.mac.ems.service.custom.impl;

import com.mac.ems.repository.DepartmentRepo;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl {

    DepartmentRepo repository;

    public DepartmentServiceImpl(DepartmentRepo repository) {
        this.repository = repository;
    }
}
