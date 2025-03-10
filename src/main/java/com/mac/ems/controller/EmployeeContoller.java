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
@CrossOrigin
public class EmployeeContoller {

    final EmployeeServiceImpl service;


    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addEmployee(@RequestBody EmployeeDto employeeDto) {
        service.addEmployee(employeeDto);

    }

    @GetMapping("get-all")
    public ResponseEntity<?> getEmployees(){
        List<EmployeeDto> allEmployees = service.getAllEmployees();
        return ResponseEntity.ok().body(allEmployees);
    }

    @GetMapping("get/{id}")
    public ResponseEntity<?> getEmployee(@PathVariable("id") int id){
        EmployeeDto employee = service.getEmployee(id);
        return ResponseEntity.ok().body(employee);
    }

    @GetMapping("get-by-first-name/{firstName}")
    public ResponseEntity<?> findByFirstName(@PathVariable("firstName") String firstName){
        List<EmployeeDto> employeeDtoList = service.findByFirstName(firstName);
        return ResponseEntity.ok().body(employeeDtoList);
    }

    @PutMapping("update")
    public ResponseEntity<?> updateEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto updatedEmployee = service.updateEmployee(employeeDto);
        if(updatedEmployee == null) return new ResponseEntity<>("Employee Not Found",HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(updatedEmployee,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") int id){
        boolean isDeleted = service.deleteEmployee(id);
        if(isDeleted) return new ResponseEntity<>("Employee Deleted",HttpStatus.OK);
        return new ResponseEntity<>("Employee Not Found",HttpStatus.NOT_FOUND);
    }


}
