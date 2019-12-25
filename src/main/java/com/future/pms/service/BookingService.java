package com.future.pms.service;

import com.future.pms.model.Booking;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.security.Principal;

public interface BookingService {
    ResponseEntity loadAll(Integer page);

    //    ResponseEntity findBookingCustomer(Principal principal, Integer page);

    ResponseEntity findOngoingBookingParkingZone(Principal principal, Integer page);

    ResponseEntity findPastBookingParkingZone(Principal principal, Integer page);

    ResponseEntity findBookingCustomerNonPaging(Principal principal);

    ResponseEntity findOngoingBookingCustomer(Principal principal);

    ResponseEntity createBooking(Principal principal, @RequestBody String idSlot);

    ResponseEntity bookingReceipt(@PathVariable("id") String id);

    ResponseEntity checkoutBooking(Principal principal);

    ResponseEntity<Booking> updateBooking(@PathVariable("id") String id,
        @RequestBody Booking booking);

    ResponseEntity deleteBooking(@PathVariable("id") String id);
}
