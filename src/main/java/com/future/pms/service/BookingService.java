package com.future.pms.service;

import org.springframework.http.ResponseEntity;

import java.security.Principal;

public interface BookingService {
    ResponseEntity loadAll(String filter, Integer page);

    ResponseEntity findBookingCustomer(Principal principal, Integer page);

    ResponseEntity findOngoingBookingParkingZone(Principal principal, Integer page);

    ResponseEntity findPastBookingParkingZone(Principal principal, Integer page);

    ResponseEntity findOngoingBookingCustomer(Principal principal);

    ResponseEntity createBooking(Principal principal, String idSlot);

    ResponseEntity bookingReceipt(String id);

    ResponseEntity checkoutBooking(Principal principal);

    ResponseEntity checkoutBookingSA(String id);

    ResponseEntity findBookingById(String id);
}
