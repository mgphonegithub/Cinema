package com.mingalar.movieticketing.service.implementations;

import com.mingalar.movieticketing.model.MovieScreen;
import com.mingalar.movieticketing.model.Movies;
import com.mingalar.movieticketing.payload.response.BaseResponse;
import com.mingalar.movieticketing.payload.response.ResponseFactory;
import com.mingalar.movieticketing.payload.response.ValidRangeResponseModel;
import com.mingalar.movieticketing.repository.MovieRepo;
import com.mingalar.movieticketing.repository.MovieScreenRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class MovieService {
    @Autowired
    MovieRepo movieRepo;

    @Autowired
    MovieScreenRepo movieScreenRepo;

    @Autowired
    ResponseFactory responseFactory;

    public ResponseEntity<BaseResponse> getLists(){
        List<Movies> movies = movieRepo.findAll();
        return responseFactory.buildSuccess(HttpStatus.OK,movies,"Movies Fetched");
    }

    public ResponseEntity<BaseResponse> getMovieDetails(Long id){
        Optional<Movies> movies = movieRepo.findById(id);
        return responseFactory.buildSuccess(HttpStatus.OK,movies,"Movie Fetched");
    }

    public ResponseEntity<BaseResponse> getDateRange(Long id){
        List<MovieScreen> movieScreens= movieScreenRepo.findDateRange(id);
//        ArrayList<LocalDate> dates = new ArrayList<LocalDate>();
//        for (int i = 0; i < movieScreens.size(); i++) {
//           dates.add(movieScreens.get(i).getStartDate());
//           dates.add(movieScreens.get(i).getEndDate());
//        }
//        LocalDate startDate = Collections.min(dates);
//        LocalDate endDate = Collections.max(dates);
//        ValidRangeResponseModel validRangeResponseModel= new ValidRangeResponseModel();
//        validRangeResponseModel.setEndDate(endDate);
//        validRangeResponseModel.setStartDate(startDate);

        return responseFactory.buildSuccess(HttpStatus.OK,movieScreens,"Valid Date Range for the movie");
    }

}
