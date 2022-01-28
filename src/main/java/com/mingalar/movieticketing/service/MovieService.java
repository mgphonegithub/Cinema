package com.mingalar.movieticketing.service;

import com.mingalar.movieticketing.model.Movies;
import com.mingalar.movieticketing.payload.response.BaseResponse;
import com.mingalar.movieticketing.payload.response.ResponseFactory;
import com.mingalar.movieticketing.repository.MovieRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class MovieService {
    @Autowired
    MovieRepo movieRepo;

    @Autowired
    ResponseFactory responseFactory;

    public ResponseEntity<BaseResponse> getLists(){
        List<Movies> movies = movieRepo.findAll();
        return responseFactory.buildSuccess(HttpStatus.OK,movies,"Movies Fetched");
    }
}
