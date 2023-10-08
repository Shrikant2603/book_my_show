package com.neebal.bookmyshow.repositories;

import com.neebal.bookmyshow.entities.MovieTheater;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieTheaterRepository extends JpaRepository<MovieTheater, Long> {
}
