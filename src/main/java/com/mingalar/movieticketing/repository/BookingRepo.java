package com.mingalar.movieticketing.repository;

import com.mingalar.movieticketing.model.Bookings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepo extends JpaRepository<Bookings,Long> {
}
