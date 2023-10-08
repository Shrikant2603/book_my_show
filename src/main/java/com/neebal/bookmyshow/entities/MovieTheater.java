package com.neebal.bookmyshow.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "movies_theaters")
public class MovieTheater {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Movie movie;

    @OneToMany(mappedBy = "movieTheater")
    private Set<Booking> bookings;

    @ManyToOne
    private Theater theater;

    public MovieTheater() {
    }

    public MovieTheater(Movie movie) {
        this.movie = movie;
    }

    public MovieTheater(Movie movie, Set<Booking> bookings, Theater theater) {
        this.movie = movie;
        this.bookings = bookings;
        this.theater = theater;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Set<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(Set<Booking> bookings) {
        this.bookings = bookings;
    }

    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }
}
