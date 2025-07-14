package com.shekhar.projects.airBnbProject.service;


import com.shekhar.projects.airBnbProject.Dto.BookingDto;
import com.shekhar.projects.airBnbProject.Dto.BookingRequest;
import com.shekhar.projects.airBnbProject.Dto.HotelReportDto;
import com.shekhar.projects.airBnbProject.Entity.enums.BookingStatus;
import com.stripe.model.Event;

import java.time.LocalDate;
import java.util.List;

public interface BookingService {

    BookingDto initialiseBooking(BookingRequest bookingRequest);

    BookingDto addGuests(Long bookingId, List<Long> guestIdList);

    String initiatePayments(Long bookingId);

    void capturePayment(Event event);

    void cancelBooking(Long bookingId);

    BookingStatus getBookingStatus(Long bookingId);

    List<BookingDto> getAllBookingsByHotelId(Long hotelId);

    HotelReportDto getHotelReport(Long hotelId, LocalDate startDate, LocalDate endDate);

    List<BookingDto> getMyBookings();
}
