package com.mac.ems.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String firstName;
    String lastName;
    String email;
    int roleId;
    int departmentId;
}
