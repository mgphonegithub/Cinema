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
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    ResponseFactory responseFactory;

    @Autowired
    MovieService movieService;

    @GetMapping
    public ResponseEntity<BaseResponse> getMovieList(){
        return movieService.getLists();

    }

    @GetMapping("/{id}")
    public ResponseEntity<BaseResponse> getMovieDetails(@PathVariable Long id){
        return movieService.getMovieDetails(id);
    }

    @GetMapping("/validrange/{id}")
    public ResponseEntity<BaseResponse> getValidRange(@PathVariable Long id){
        return movieService.getDateRange(id);
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
