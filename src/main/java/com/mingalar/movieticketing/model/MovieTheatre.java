package com.mingalar.movieticketing.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class MovieTheatre {
    @EmbeddedId
    MovieTheatreKey id;

    @ManyToOne
    @MapsId("movieId")
    @JoinColumn(name = "movie_id")
    private Movies movies;

    @ManyToOne
    @MapsId("theatreId")
    @JoinColumn(name = "theatre_id")
    private Theatres theatres;

    private Double ticketPrice;

}
