package com.neebal.bookmyshow.repositories;

import com.neebal.bookmyshow.entities.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepository extends JpaRepository<Seat, Long> {
}
