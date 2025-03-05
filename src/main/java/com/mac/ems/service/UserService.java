package com.mac.ems.service;

import com.mac.ems.repository.UserRepo;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    UserRepo repository;

    public UserService(UserRepo repository) {
        this.repository = repository;
    }
}
