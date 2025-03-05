package com.mac.ems.service;

import com.mac.ems.repository.RoleRepo;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    RoleRepo repository;

    public RoleService(RoleRepo repository) {
        this.repository = repository;
    }
}
