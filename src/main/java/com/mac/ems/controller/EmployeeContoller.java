package com.mac.ems.controller;


import com.mac.ems.dto.EmployeeDto;
import com.mac.ems.service.custom.impl.EmployeeServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeContoller {

    final EmployeeServiceImpl service;


    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addEmployee(@RequestBody EmployeeDto employeeDto) {
        service.addEmployee(employeeDto);

    }

    @GetMapping("get-all")
    public ResponseEntity getEmployees(){
        List<EmployeeDto> allEmployees = service.getAllEmployees();
        return ResponseEntity.ok().body(allEmployees);
    }

    @GetMapping("get/{id}")
    public ResponseEntity getEmployee(@PathVariable("id") int id){
        EmployeeDto employee = service.getEmployee(id);
        return ResponseEntity.ok().body(employee);
    }

    @PutMapping("update")
    public ResponseEntity updateEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto updatedEmployee = service.updateEmployee(employeeDto);
        return ResponseEntity.accepted().body(updatedEmployee);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteEmployee(@PathVariable("id") int id){
        boolean isDeleted = service.deleteEmployee(id);
        if(isDeleted) return ResponseEntity.ok("Employee Deleted");
        return ResponseEntity.badRequest().body("Employee Not Deleted");
    }


}
