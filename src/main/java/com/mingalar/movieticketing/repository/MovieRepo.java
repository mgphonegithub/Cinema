package com.mingalar.movieticketing.repository;

import com.mingalar.movieticketing.model.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepo extends JpaRepository<Movies,Long> {
}
