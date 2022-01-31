package com.mingalar.movieticketing.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class ShowDetails {

    @Id
    private Long showTimeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movieId")
    private Movies movies;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "screenId")
    private Screens screens;

    private String showTime;

    private LocalDate showDate;

    private String takenSeats;





}
