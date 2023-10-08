package com.neebal.bookmyshow.repositories;

import com.neebal.bookmyshow.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MovieRepository extends JpaRepository<Movie, Long> {
}
