package com.mingalar.movieticketing.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@Entity
public class Movies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movieId;

    private String movieName;

    private LocalDateTime createAt;

    private LocalDateTime updatedAt;

    private String imageUrl;

    private String description;

    private String trailerUrl;

    private LocalDate toDate;

    private LocalDate fromDate;

    /**
     * dr ka logic ko pyn sinn srr kyi pop
     * i dont think it it necessary like comma code pee pl cast ko htr loh ya dl but like
     * list nae thein chin yin tok table khwl tr a kg sone pop but for now string pl htr ya ag
     */
    private String cast;

//    @JsonIgnore
    @OneToMany(mappedBy = "movies")
    private Set<MovieScreen> tickets;


}
























