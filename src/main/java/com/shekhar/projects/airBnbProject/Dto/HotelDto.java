package com.shekhar.projects.airBnbProject.Dto;


import com.shekhar.projects.airBnbProject.Entity.HotelContactInfo;
import lombok.Data;

@Data
public class HotelDto {
    private Long id;
    private String name;
    private String city;
    private String[] photos;
    private String[] amenities;
    private HotelContactInfo contactInfo;
    private Boolean active;
}
