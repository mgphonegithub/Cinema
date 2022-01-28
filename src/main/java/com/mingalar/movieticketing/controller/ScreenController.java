package com.mingalar.movieticketing.controller;

import com.mingalar.movieticketing.payload.response.BaseResponse;
import com.mingalar.movieticketing.service.ScreenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(methods = {RequestMethod.DELETE, RequestMethod.PUT, RequestMethod.GET, RequestMethod.POST, RequestMethod.OPTIONS})
public class ScreenController {

    @Autowired
    ScreenService screenService;


    @GetMapping("seats/{screenId}")
    public ResponseEntity<BaseResponse> getSeats(@PathVariable Long screenId) {
        return screenService.getSeats(screenId);
    }
}
