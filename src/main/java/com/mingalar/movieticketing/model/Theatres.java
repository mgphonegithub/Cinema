package com.mingalar.movieticketing.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class Theatres {

    @Id
    private Long theatreId;

    private String theatreName;


}
