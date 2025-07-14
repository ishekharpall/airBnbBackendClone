package com.shekhar.projects.airBnbProject.service;


import com.shekhar.projects.airBnbProject.Dto.*;
import com.shekhar.projects.airBnbProject.Entity.*;
import org.springframework.data.domain.Page;

import java.util.List;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteAllInventories(Room room);

    Page<HotelPriceResponseDto> searchHotels(HotelSearchRequest hotelSearchRequest);

    List<InventoryDto> getAllInventoryByRoom(Long roomId);

    void updateInventory(Long roomId, UpdateInventoryRequestDto updateInventoryRequestDto);
}
