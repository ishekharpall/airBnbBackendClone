package com.shekhar.projects.airBnbProject.Dto;


import com.shekhar.projects.airBnbProject.Entity.Room;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoomPriceDto {
    private Room room;
    private Double price;
}
