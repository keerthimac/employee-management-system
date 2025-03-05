package com.mac.ems.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmployeeDto {
    String firstName;
    String lastName;
    String email;
    int roleId;
    int departmentId;
}
