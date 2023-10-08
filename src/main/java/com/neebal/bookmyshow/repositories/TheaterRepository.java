package com.neebal.bookmyshow.repositories;

import com.neebal.bookmyshow.entities.Theater;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterRepository extends JpaRepository<Theater, Long> {
}
