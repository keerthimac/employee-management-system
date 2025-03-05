package com.mac.ems.service.custom.impl;

import com.mac.ems.repository.RoleRepo;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl {

    RoleRepo repository;

    public RoleServiceImpl(RoleRepo repository) {
        this.repository = repository;
    }
}
