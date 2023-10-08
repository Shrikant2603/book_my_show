package com.neebal.bookmyshow.services;

import com.neebal.bookmyshow.entities.Movie;
import com.neebal.bookmyshow.entities.MovieScreen;
import com.neebal.bookmyshow.entities.Theater;
import com.neebal.bookmyshow.repositories.TheaterRepository;
import com.neebal.bookmyshow.services.MasterDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TheaterService {

    @Autowired
    private MasterDataService masterDataService;

    @Autowired
    private TheaterRepository theaterRepository;

    public TheaterService() {

    }

    public List<Theater> getTheatersForMovie(String movieTitle) {
        List<Theater> theaters = theaterRepository.findAll();
        List<Theater> filteredTheaters = new ArrayList<>();
        for (Theater theater : theaters) {
            for (MovieScreen movieScreen : theater.getMovieScreens()) {
                if (movieScreen.getMovie().getTitle().equals(movieTitle)) {
                    filteredTheaters.add(theater);
                    break;
                }
            }
        }
        System.out.println(filteredTheaters);
        return filteredTheaters;
    }
}
