package com.mac.ems.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDto {
    int id;
    String userName;
    String password;
    boolean isAdmin;
    boolean isHr;
}
