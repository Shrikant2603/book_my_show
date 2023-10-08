package com.neebal.bookmyshow.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = true)
    private Double duration;

    @Column(nullable = true)
    private String genre;

    @Column(nullable = true)
    private Double rating;

    @OneToMany(mappedBy = "movie")
    private Set<MovieTheater> movieTheater;

    @OneToMany(mappedBy = "movie")
    private Set<MovieScreen> movieScreens;

    public Movie() {

    }

    public Movie(String title, Double duration, String genre, Double rating) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        this.rating = rating;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Set<MovieTheater> getMovieTheater() {
        return movieTheater;
    }

    public void setMovieTheater(Set<MovieTheater> movieTheater) {
        this.movieTheater = movieTheater;
    }

    public Set<MovieScreen> getMovieScreens() {
        return movieScreens;
    }

    public void setMovieScreens(Set<MovieScreen> movieScreens) {
        this.movieScreens = movieScreens;
    }
}
