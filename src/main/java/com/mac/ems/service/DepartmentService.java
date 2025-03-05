package com.mac.ems.service;

import com.mac.ems.repository.DepartmentRepo;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    DepartmentRepo repository;

    public DepartmentService(DepartmentRepo repository) {
        this.repository = repository;
    }
}
