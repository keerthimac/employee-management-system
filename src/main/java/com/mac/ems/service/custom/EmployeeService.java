package com.mac.ems.service.custom;

import com.mac.ems.dto.EmployeeDto;
import com.mac.ems.service.Services;

import java.util.List;

public interface EmployeeService extends Services {
    EmployeeDto addEmployee(EmployeeDto employeeDto);
    List<EmployeeDto> getAllEmployees();
    EmployeeDto getEmployee(int id);
    EmployeeDto updateEmployee(EmployeeDto employeeDto);
    boolean deleteEmployee(int id);
}
