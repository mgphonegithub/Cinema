package com.mingalar.movieticketing.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class MovieScreenKey implements Serializable {

    @Column(name = "movie_id")
    Long movieId;

    @Column(name = "screen_id")
    Long screenId;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
