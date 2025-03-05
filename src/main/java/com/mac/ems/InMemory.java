package com.mac.ems;

import com.mac.ems.dto.EmployeeDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InMemory {

    public List<EmployeeDto> employeeDtoList = new ArrayList<>();

    public boolean save(EmployeeDto employeeDto){
        return employeeDtoList.add(employeeDto);
    }

    public List<EmployeeDto> getAll(){
        return employeeDtoList;
    }
}
