package com.mingalar.movieticketing.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@Data
public class Theatres {

    @Id
    private Long theatreId;

    private String theatreDescription;

    @OneToMany(mappedBy = "theatres")
    private Set<MovieTheatre> tickets;

    //may be addresss?
}
