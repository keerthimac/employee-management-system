package com.mac.ems.service.custom.impl;

import com.mac.ems.repository.UserRepo;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {

    UserRepo repository;

    public UserServiceImpl(UserRepo repository) {
        this.repository = repository;
    }
}
