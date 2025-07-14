package com.shekhar.projects.airBnbProject.repository;


import com.shekhar.projects.airBnbProject.Entity.Booking;
import com.shekhar.projects.airBnbProject.Entity.Hotel;
import com.shekhar.projects.airBnbProject.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    Optional<Booking> findByPaymentSessionId(String sessionId);

    List<Booking> findByHotel(Hotel hotel);

    List<Booking> findByHotelAndCreatedAtBetween(Hotel hotel, LocalDateTime startDateTime, LocalDateTime endDateTime);

    List<Booking> findByUser(User user);
}
