package com.mingalar.movieticketing.model;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class ShowDetails {

    @Id
    private Long showDetailsId;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "movieId")
    @JsonIncludeProperties(value = "movieId")
    private Movies movies;

    @ManyToOne(fetch = FetchType.EAGER)
    //lazy loading lote phoe fetchtype lazy lote ya dl mac mhr sann kyi windows mhr ka error pya dl
    // hibernate proxy ko allow ma lote wo model ka higer bytecode provider lo tl so pee tok
    @JoinColumn(name = "screenId")
    @JsonIncludeProperties(value = "screenId")
    private Screens screens;

    private String showTime;

    private LocalDate showDate;

    private String takenSeats;





}
