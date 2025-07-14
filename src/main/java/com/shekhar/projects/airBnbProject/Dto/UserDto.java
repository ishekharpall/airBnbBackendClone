package com.shekhar.projects.airBnbProject.Dto;


import com.shekhar.projects.airBnbProject.Entity.enums.Gender;
import lombok.Data;

import java.time.LocalDate;

@Data
public class UserDto {
    private Long id;
    private String email;
    private String name;
    private Gender gender;
    private LocalDate dateOfBirth;
}
