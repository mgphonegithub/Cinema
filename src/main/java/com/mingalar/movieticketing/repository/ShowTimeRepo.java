package com.mingalar.movieticketing.repository;

import com.mingalar.movieticketing.model.ShowTime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowTimeRepo extends JpaRepository<ShowTime,Long> {
}
