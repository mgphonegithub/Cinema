package com.mingalar.movieticketing.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
public class MovieScreen {
    @EmbeddedId
    MovieScreenKey id;

    @JsonIgnore
    @ManyToOne
    @MapsId("movieId")
    @JoinColumn(name = "movie_id")
    private Movies movies;

    @JsonIgnore
    @ManyToOne
    @MapsId("screenId")
    @JoinColumn(name = "screen_id")
    private Screens screens;

    private Double baseTicketPrice;
    private LocalDate startDate;
    private LocalDate endDate;

    //can put seats here to be movie special

}
