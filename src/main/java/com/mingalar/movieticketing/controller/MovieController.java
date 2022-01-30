package com.mingalar.movieticketing.controller;

import com.mingalar.movieticketing.payload.request.CreateMovieRequest;
import com.mingalar.movieticketing.payload.response.BaseResponse;
import com.mingalar.movieticketing.payload.response.ResponseFactory;
import com.mingalar.movieticketing.service.implementations.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public ResponseEntity<BaseResponse> getMovieDetails(){
        return movieService.getLists();
    }

    @PostMapping("/create")
    public ResponseEntity<BaseResponse> createMovie(CreateMovieRequest createMovieRequest){
        return movieService.getLists();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<BaseResponse> deleteMovie(){
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<BaseResponse> updateMovie(){
        return null;
    }

}
