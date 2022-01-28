package com.mingalar.movieticketing.payload.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class ResponseFactory {
    public ResponseEntity<BaseResponse> buildError(HttpStatus status, String message) {
        BaseResponse basic = new BaseResponse();
        basic.setSuccess(false);
        basic.setResult(null);
        basic.setMessage(message);
        return ResponseEntity.status(status).body(basic);
    }

    public ResponseEntity<BaseResponse> buildSuccess(HttpStatus status, Object result, String message) {
        BaseResponse basic = new BaseResponse();
        basic.setSuccess(true);
        basic.setMessage(message);
        basic.setResult(result);
        return ResponseEntity.status(status).body(basic);
    }
}
