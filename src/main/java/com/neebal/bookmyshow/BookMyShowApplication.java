package com.neebal.bookmyshow;

import com.neebal.bookmyshow.controller.MovieController;
import com.neebal.bookmyshow.entities.Movie;
import com.neebal.bookmyshow.entities.MovieScreen;
import com.neebal.bookmyshow.entities.Screen;
import com.neebal.bookmyshow.entities.Theater;
import com.neebal.bookmyshow.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class BookMyShowApplication /*implements CommandLineRunner*/ {
//	@Autowired
//	private MovieRepository movieRepository;
//	@Autowired
//	private MovieScreenRepository movieScreenRepository;
//
//	@Autowired
//	private MovieTheaterRepository movieTheaterRepository;
//
//	@Autowired
//	private ScreenRepository screenRepository;
//
//	@Autowired
//	private SeatRepository seatRepository;
//
//	@Autowired
//	TheaterRepository theaterRepository;

	public static void main(String[] args) {
		SpringApplication.run(BookMyShowApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		List<Movie> movies = Arrays.asList(
//				new Movie("Inception", 148.0, "Action", 8.8),
//				new Movie("The Matrix", 136.0, "Sci-fi", 8.7),
//				new Movie("Pulp Fiction", 154.0, "Crime", 8.9),
//				new Movie("The Lion King", 118.0, "Animation", 8.5),
//				new Movie("Gone Girl", 149.0, "Mystery", 8.1)
//		);
//		this.movieRepository.saveAll(movies);
//
//		List<Theater> theaters = Arrays.asList(
//				new Theater("Star Cineplex", "Mumbai"),
//				new Theater("PVR Cinemas", "Bangalore")
//
//		);
//		this.theaterRepository.saveAll(theaters);
//
//		List<Screen> screens = Arrays.asList(
//				new Screen("Screen A", 180),
//				new Screen("Screen B", 250),
//				new Screen("Screen C", 240),
//				new Screen("Screen D", 160),
//				new Screen("Screen E", 200)
//
//		);
//		this.screenRepository.saveAll(screens);
//
//		List<MovieScreen> movieScreens = Arrays.asList(
//				new MovieScreen(movies.get(0), screens.get(0), new Date(), LocalTime.parse("09:00"), theaters.get(0)),
//				new MovieScreen(movies.get(0), screens.get(1), new Date(), LocalTime.parse("15:00"), theaters.get(0)),
//				new MovieScreen(movies.get(0), screens.get(2), new Date(), LocalTime.parse("17:30"), theaters.get(0)),
//				new MovieScreen(movies.get(0), screens.get(1), new Date(), LocalTime.parse("22:00"), theaters.get(0)),
//				new MovieScreen(movies.get(0), screens.get(3), new Date(), LocalTime.parse("10:00"), theaters.get(1)),
//				new MovieScreen(movies.get(0), screens.get(3), new Date(), LocalTime.parse("14:00"), theaters.get(1)),
//				new MovieScreen(movies.get(0), screens.get(4), new Date(), LocalTime.parse("16:30"), theaters.get(1)),
//				new MovieScreen(movies.get(0), screens.get(1), new Date(), LocalTime.parse("21:00"), theaters.get(1)),
//
//				new MovieScreen(movies.get(1), screens.get(0), new Date(), LocalTime.parse("15:00"), theaters.get(0)),
//				new MovieScreen(movies.get(1), screens.get(1), new Date(), LocalTime.parse("09:00"), theaters.get(0)),
//				new MovieScreen(movies.get(1), screens.get(2), new Date(), LocalTime.parse("10:30"), theaters.get(0)),
//				new MovieScreen(movies.get(1), screens.get(1), new Date(), LocalTime.parse("19:00"), theaters.get(0)),
//				new MovieScreen(movies.get(1), screens.get(3), new Date(), LocalTime.parse("15:00"), theaters.get(1)),
//				new MovieScreen(movies.get(1), screens.get(3), new Date(), LocalTime.parse("12:00"), theaters.get(1)),
//				new MovieScreen(movies.get(1), screens.get(4), new Date(), LocalTime.parse("21:30"), theaters.get(1)),
//				new MovieScreen(movies.get(1), screens.get(1), new Date(), LocalTime.parse("18:00"), theaters.get(1)),
//
//				new MovieScreen(movies.get(2), screens.get(0), new Date(), LocalTime.parse("12:00"), theaters.get(0)),
//				new MovieScreen(movies.get(2), screens.get(1), new Date(), LocalTime.parse("14:00"), theaters.get(0)),
//				new MovieScreen(movies.get(2), screens.get(2), new Date(), LocalTime.parse("17:00"), theaters.get(0)),
//				new MovieScreen(movies.get(2), screens.get(1), new Date(), LocalTime.parse("20:00"), theaters.get(0)),
//				new MovieScreen(movies.get(2), screens.get(3), new Date(), LocalTime.parse("11:00"), theaters.get(1)),
//				new MovieScreen(movies.get(2), screens.get(3), new Date(), LocalTime.parse("15:30"), theaters.get(1)),
//				new MovieScreen(movies.get(2), screens.get(4), new Date(), LocalTime.parse("19:30"), theaters.get(1)),
//				new MovieScreen(movies.get(2), screens.get(1), new Date(), LocalTime.parse("22:00"), theaters.get(1)),
//
//				new MovieScreen(movies.get(3), screens.get(0), new Date(), LocalTime.parse("13:00"), theaters.get(0)),
//				new MovieScreen(movies.get(3), screens.get(1), new Date(), LocalTime.parse("16:00"), theaters.get(0)),
//				new MovieScreen(movies.get(3), screens.get(2), new Date(), LocalTime.parse("18:30"), theaters.get(0)),
//				new MovieScreen(movies.get(3), screens.get(1), new Date(), LocalTime.parse("21:00"), theaters.get(0)),
//				new MovieScreen(movies.get(3), screens.get(3), new Date(), LocalTime.parse("12:30"), theaters.get(1)),
//				new MovieScreen(movies.get(3), screens.get(3), new Date(), LocalTime.parse("17:00"), theaters.get(1)),
//				new MovieScreen(movies.get(3), screens.get(4), new Date(), LocalTime.parse("20:30"), theaters.get(1)),
//				new MovieScreen(movies.get(3), screens.get(1), new Date(), LocalTime.parse("23:00"), theaters.get(1)),
//
//				new MovieScreen(movies.get(4), screens.get(0), new Date(), LocalTime.parse("14:00"), theaters.get(0)),
//				new MovieScreen(movies.get(4), screens.get(1), new Date(), LocalTime.parse("17:00"), theaters.get(0)),
//				new MovieScreen(movies.get(4), screens.get(2), new Date(), LocalTime.parse("20:00"), theaters.get(0)),
//				new MovieScreen(movies.get(4), screens.get(1), new Date(), LocalTime.parse("22:30"), theaters.get(0)),
//				new MovieScreen(movies.get(4), screens.get(3), new Date(), LocalTime.parse("11:30"), theaters.get(1)),
//				new MovieScreen(movies.get(4), screens.get(3), new Date(), LocalTime.parse("16:30"), theaters.get(1)),
//				new MovieScreen(movies.get(4), screens.get(4), new Date(), LocalTime.parse("19:30"), theaters.get(1)),
//				new MovieScreen(movies.get(4), screens.get(1), new Date(), LocalTime.parse("21:30"), theaters.get(1))
//		);
//		this.movieScreenRepository.saveAll(movieScreens);
//	}
}
