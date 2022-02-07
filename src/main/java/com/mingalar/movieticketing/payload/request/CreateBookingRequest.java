package com.mingalar.movieticketing.payload.request;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class CreateBookingRequest {


    @NotNull
    private Long movieId;

    @NotNull
    private Long showDetailsId;

    @NotNull
    private String seatNumbers;

    @NotNull
    private String theatreName;

    @NotNull
    private String customerPhone;

    @NotNull
    private Double totalPrice;

}
