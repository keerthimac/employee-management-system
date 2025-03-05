package com.mac.ems.repository;

import com.mac.ems.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Integer> {
   List<EmployeeEntity> findByFirstName(String firstName);

}
