package com.mac.ems.repository;

import com.mac.ems.entity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<DepartmentEntity,Integer> {
}
