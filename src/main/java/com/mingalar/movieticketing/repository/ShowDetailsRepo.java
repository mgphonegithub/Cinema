package com.mingalar.movieticketing.repository;

import com.mingalar.movieticketing.model.MovieScreen;
import com.mingalar.movieticketing.model.ShowDetails;
import org.springframework.boot.actuate.autoconfigure.health.HealthProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowDetailsRepo extends JpaRepository<ShowDetails,Long> {
    @Query(nativeQuery = true, value = "select * from show_details where movie_id = :movieId")
    List<ShowDetails> findShows(Long movieId);
}
