package com.shekhar.projects.airBnbProject.service;


import com.shekhar.projects.airBnbProject.Entity.Booking;

public interface CheckoutService {

    String getCheckoutSession(Booking booking, String successUrl, String failureUrl);

}
