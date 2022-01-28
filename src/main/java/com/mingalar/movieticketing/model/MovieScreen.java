package com.mingalar.movieticketing.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class MovieScreen {
    @EmbeddedId
    MovieScreenKey id;

    @ManyToOne
    @MapsId("movieId")
    @JoinColumn(name = "movie_id")
    private Movies movies;

    @ManyToOne
    @MapsId("screenId")
    @JoinColumn(name = "screen_id")
    private Screens screens;

    private Double baseTicketPrice;

    //can put seats here to be movie special

}