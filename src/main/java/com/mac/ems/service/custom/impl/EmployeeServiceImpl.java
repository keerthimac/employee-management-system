package com.mac.ems.service.custom.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mac.ems.dto.EmployeeDto;
import com.mac.ems.entity.EmployeeEntity;
import com.mac.ems.repository.EmployeeRepo;
import com.mac.ems.service.custom.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    EmployeeRepo repository;

    public EmployeeServiceImpl(EmployeeRepo repository) {
        this.repository = repository;
    }

    public EmployeeDto addEmployee(EmployeeDto employeeDto) {
        employeeDto.setId(0);
        EmployeeEntity employeeEntity = new ObjectMapper().convertValue(employeeDto, EmployeeEntity.class);
//        EmployeeEntity employeeEntity = new EmployeeEntity();
//        employeeEntity.setFirstName(employeeDto.getFirstName());
//        employeeEntity.setLastName(employeeDto.getLastName());
//        employeeEntity.setEmail(employeeDto.getEmail());
//        employeeEntity.setRoleId(employeeDto.getRoleId());
//        employeeEntity.setDepartmentId(employeeDto.getDepartmentId());
        EmployeeEntity save = repository.save(employeeEntity);
        return new ObjectMapper().convertValue(save,EmployeeDto.class);
    }

    @Override
    public List<EmployeeDto> getAllEmployees() {
        List<EmployeeEntity> all = repository.findAll();
        List<EmployeeDto> employeeDtoList= new ArrayList<EmployeeDto>();
        all.forEach(entity -> {
            employeeDtoList.add(new ObjectMapper().convertValue(entity,EmployeeDto.class));
        });
        return employeeDtoList;
    }

    @Override
    public EmployeeDto getEmployee(int id) {
        Optional<EmployeeEntity> byId = repository.findById(id);
        if(byId.isPresent()){
           return new ObjectMapper().convertValue(byId.get(),EmployeeDto.class);
        }
        return null;
    }

    @Override
    public EmployeeDto updateEmployee(EmployeeDto employeeDto) {
        Optional<EmployeeEntity> byId = repository.findById(employeeDto.getId());
        if(byId.isPresent()){
            EmployeeEntity employeeEntity = byId.get();
            if(employeeDto.getFirstName()!=null){
                employeeEntity.setFirstName(employeeDto.getFirstName());
            }
            if(employeeDto.getLastName()!=null){
                employeeEntity.setLastName(employeeDto.getLastName());
            }
            if(employeeDto.getEmail()!=null){
                employeeEntity.setEmail(employeeDto.getEmail());
            }
            if(employeeDto.getDepartmentId()!=0){
                employeeEntity.setDepartmentId(employeeDto.getDepartmentId());
            }
            if(employeeDto.getRoleId()!=0){
                employeeEntity.setRoleId(employeeDto.getRoleId());
            }
            EmployeeEntity save = repository.save(employeeEntity);
            return new ObjectMapper().convertValue(save,EmployeeDto.class);
        }
        return null;
    }

    @Override
    public boolean deleteEmployee(int id) {
        if(repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }


}
