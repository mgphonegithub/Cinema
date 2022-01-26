package com.mingalar.movieticketing.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class MovieTheatreKey implements Serializable {

    @Column(name = "movie_id")
    Long movieId;

    @Column(name = "theatre_id")
    Long theatreId;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
