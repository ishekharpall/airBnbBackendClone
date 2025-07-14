package com.shekhar.projects.airBnbProject.Dto;


import com.shekhar.projects.airBnbProject.Entity.enums.Gender;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ProfileUpdateRequestDto {
    private String name;
    private LocalDate dateOfBirth;
    private Gender gender;
}
