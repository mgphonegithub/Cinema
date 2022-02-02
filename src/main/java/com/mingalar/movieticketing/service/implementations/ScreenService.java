package com.mingalar.movieticketing.service.implementations;

import com.mingalar.movieticketing.model.Screens;
import com.mingalar.movieticketing.model.Theatres;
import com.mingalar.movieticketing.payload.response.BaseResponse;
import com.mingalar.movieticketing.payload.response.ResponseFactory;
import com.mingalar.movieticketing.repository.TheatreRepo;
import com.mingalar.movieticketing.service.IScreenService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ScreenService implements IScreenService {
    @Autowired
    TheatreRepo theatreRepo;

    @Autowired
    ResponseFactory responseFactory;

    @Override
    public ResponseEntity<BaseResponse> getSeats(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<BaseResponse> getTheatres() {
        List<Theatres> theatres = theatreRepo.findAll();
        return responseFactory.buildSuccess(HttpStatus.OK,theatres,"Theatre List");
    }


}
