package com.mingalar.movieticketing.repository;

import com.mingalar.movieticketing.model.Screens;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScreenRepo extends JpaRepository<Screens,Long> {
}
