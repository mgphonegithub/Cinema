package com.mingalar.movieticketing.payload.response;

import lombok.Data;

@Data
public class BaseResponse {
    private String message;
    private Object result;
    private Boolean success;
}
