package com.mac.ems.controller;


import com.mac.ems.dto.EmployeeDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeContoller {


    @PostMapping("/add")
    public ResponseEntity addEmployee(@RequestBody EmployeeDto employeeDto) {
        System.out.println(employeeDto);
        return ResponseEntity.ok(employeeDto);
    }
}
