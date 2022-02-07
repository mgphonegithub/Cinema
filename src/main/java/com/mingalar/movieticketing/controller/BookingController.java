package com.mingalar.movieticketing.controller;

import com.mingalar.movieticketing.payload.request.CreateBookingRequest;
import com.mingalar.movieticketing.payload.response.BaseResponse;
import com.mingalar.movieticketing.service.IBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Access;
import javax.validation.Valid;

@RestController
@CrossOrigin(methods = {RequestMethod.DELETE, RequestMethod.PUT, RequestMethod.GET, RequestMethod.POST, RequestMethod.OPTIONS})
@RequestMapping("/bookings")
public class BookingController {
    @Autowired
    IBookingService iBookingService;

    @GetMapping("/")
    public ResponseEntity<?> getTickets(String fromTime, String toTime) {
        return null;
    }

    @PostMapping("/create")
    public ResponseEntity<BaseResponse> createBookings(@RequestBody @Valid CreateBookingRequest createBookingRequest){
        return iBookingService.createBookings(createBookingRequest);
    }
}
