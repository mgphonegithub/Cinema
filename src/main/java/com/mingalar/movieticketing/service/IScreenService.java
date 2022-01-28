package com.mingalar.movieticketing.service;


import com.mingalar.movieticketing.payload.response.BaseResponse;
import org.springframework.http.ResponseEntity;

public interface IScreenService {
    ResponseEntity<BaseResponse> getSeats(Long id);
}
