package com.mingalar.movieticketing.payload.response;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ValidRangeResponseModel {
    private LocalDate startDate;
    private LocalDate endDate;
}
