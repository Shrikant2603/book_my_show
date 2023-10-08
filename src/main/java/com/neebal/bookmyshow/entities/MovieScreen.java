package com.neebal.bookmyshow.entities;

import jakarta.persistence.*;

import java.sql.SQLOutput;
import java.time.LocalTime;
import java.util.Date;
@Entity
@Table(name = "movies_screens")
public class MovieScreen {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Movie movie;

    @ManyToOne
    private Screen screen;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date date;

    @Temporal(TemporalType.TIME)
    @Column
    private LocalTime time;

    @ManyToOne
    private Theater theater;

    public MovieScreen() {
    }

    public MovieScreen(Movie movie, Screen screen, Date date, LocalTime time, Theater theater) {
        this.movie = movie;
        this.screen = screen;
        this.date = date;
        this.time = time;
        this.theater = theater;
    }

    //System.out.println("I AM INSIDE MOVIE-SCREEN CONSTRUCTOR");


    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
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

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
}
