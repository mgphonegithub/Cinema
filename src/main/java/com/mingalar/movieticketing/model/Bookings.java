package com.mingalar.movieticketing.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Data
public class Bookings {

    @Id
    private Long bookingId;

    @NotNull
    private Long movieId;

    @NotNull
    private Long showDetailsId;

//    private LocalDate bookingDate;
//
//    private String bookingTime;

    @NotNull
    private String seatNumbers;

    @NotNull
    private String theatreName;

//    private String customerName;

    @NotNull
    private String customerPhone;

    @NotNull
    private Double totalPrice;

    @NotNull
    private Integer totalSeats;


}
