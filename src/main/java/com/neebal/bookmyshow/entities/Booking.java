package com.neebal.bookmyshow.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private MovieTheater movieTheater;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "booking")
    private Set<Seat> seat;

    public Booking() {
    }

    public Booking(MovieTheater movieTheater, User user, Set<Seat> seat) {
        this.movieTheater = movieTheater;
        this.user = user;
        this.seat = seat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MovieTheater getMovieTheater() {
        return movieTheater;
    }

    public void setMovieTheater(MovieTheater movieTheater) {
        this.movieTheater = movieTheater;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Seat> getSeat() {
        return seat;
    }

    public void setSeat(Set<Seat> seat) {
        this.seat = seat;
    }
}

