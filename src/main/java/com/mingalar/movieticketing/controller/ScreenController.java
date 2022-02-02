package com.mingalar.movieticketing.controller;

import com.mingalar.movieticketing.payload.response.BaseResponse;
import com.mingalar.movieticketing.service.IScreenService;
import com.mingalar.movieticketing.service.implementations.ScreenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(methods = {RequestMethod.DELETE, RequestMethod.PUT, RequestMethod.GET, RequestMethod.POST, RequestMethod.OPTIONS})
public class ScreenController {

    @Autowired
    IScreenService iScreenService;


    @GetMapping("seats/{screenId}")
    public ResponseEntity<BaseResponse> getSeats(@PathVariable Long screenId) {
        return iScreenService.getSeats(screenId);
    }

    @GetMapping("theatres")
    public ResponseEntity<BaseResponse> getTheatres(){
        return iScreenService.getTheatres();
    }
}
