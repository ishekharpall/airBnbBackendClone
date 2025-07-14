package com.shekhar.projects.airBnbProject.service;



import com.shekhar.projects.airBnbProject.Dto.HotelDto;
import com.shekhar.projects.airBnbProject.Dto.HotelInfoDto;
import com.shekhar.projects.airBnbProject.Dto.HotelInfoRequestDto;

import java.util.List;


public interface HotelService {

    HotelDto createNewHotel(HotelDto hotelDto);

    HotelDto getHotelById(Long id);

    HotelDto updateHotelById(Long id, HotelDto hotelDto);

    void deleteHotelById(Long id);

    void activateHotel(Long hotelId);

    HotelInfoDto getHotelInfoById(Long hotelId, HotelInfoRequestDto hotelInfoRequestDto);

    List<HotelDto> getAllHotels();
}
