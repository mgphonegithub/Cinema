package com.mingalar.movieticketing.repository;

import com.mingalar.movieticketing.model.Theatres;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheatreRepo extends JpaRepository<Theatres,Long> {
}
