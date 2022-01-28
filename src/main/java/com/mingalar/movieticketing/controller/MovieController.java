package com.mingalar.movieticketing.controller;

import com.mingalar.movieticketing.payload.response.BaseResponse;
import com.mingalar.movieticketing.payload.response.ResponseFactory;
import com.mingalar.movieticketing.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(methods = {RequestMethod.DELETE, RequestMethod.PUT, RequestMethod.GET, RequestMethod.POST, RequestMethod.OPTIONS})
public class MovieController {

    @Autowired
    ResponseFactory responseFactory;

    @Autowired
    MovieService movieService;

    @GetMapping("/movies")
    public ResponseEntity<BaseResponse> getMovieList(){
        return movieService.getLists();

    }
}
