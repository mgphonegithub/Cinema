package com.mingalar.movieticketing.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Screens {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long screenId;

    private String screenDescription;

//    private String covidSeats;

    private String normalRows;

    private String premiumRows;

    private String vipRows;

    private String coupleRows;

    private Double normalSeatPrice;

    private Double premiumSeatPrice;

    private Double vipSeatPrice;

    private Double coupleSeatPrice;

    private Double totalSeats;

//    @OneToMany(mappedBy = "screens")
//    private Set<MovieScreen> tickets;

}
