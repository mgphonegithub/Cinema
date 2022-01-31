package com.mingalar.movieticketing.repository;

import com.mingalar.movieticketing.model.MovieScreen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieScreenRepo extends JpaRepository<MovieScreen,Long> {
    @Query(nativeQuery = true,
            value = "select * from movie_screen where movie_id = :movieId")
    List<MovieScreen> findDateRange(Long movieId);
}
