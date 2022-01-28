package com.mingalar.movieticketing.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(methods = {RequestMethod.DELETE, RequestMethod.PUT, RequestMethod.GET, RequestMethod.POST, RequestMethod.OPTIONS})
public class TicketController {

    @GetMapping("/tickets")
    public ResponseEntity<?> getTickets(String fromTime, String toTime){
        return null;
    }
}
