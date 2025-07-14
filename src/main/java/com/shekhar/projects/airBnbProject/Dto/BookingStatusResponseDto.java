package com.shekhar.projects.airBnbProject.Dto;


import com.shekhar.projects.airBnbProject.Entity.enums.BookingStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingStatusResponseDto {
    private BookingStatus bookingStatus;
}
