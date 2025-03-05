package com.mac.ems.repository;

import com.mac.ems.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Integer> {
}
