package com.mingalar.movieticketing.service.implementations;

import com.mingalar.movieticketing.payload.response.BaseResponse;
import com.mingalar.movieticketing.service.IScreenService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ScreenService implements IScreenService {

    @Override
    public ResponseEntity<BaseResponse> getSeats(Long id) {
        return null;
    }
}
