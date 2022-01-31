package com.mingalar.movieticketing.repository;

import com.mingalar.movieticketing.model.ShowDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowTimeRepo extends JpaRepository<ShowDetails,Long> {
}
