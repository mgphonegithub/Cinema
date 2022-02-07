package com.mingalar.movieticketing.service;

import com.mingalar.movieticketing.payload.request.CreateBookingRequest;
import com.mingalar.movieticketing.payload.response.BaseResponse;
import org.springframework.http.ResponseEntity;

public interface IBookingService {
    ResponseEntity<BaseResponse> createBookings(CreateBookingRequest createBookingRequest);
}
