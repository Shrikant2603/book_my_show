package com.neebal.bookmyshow.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "screens")
public class Screen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;

    @ManyToOne
    private Theater theater;

    @Column
    private Integer capacity;

    @OneToMany(mappedBy = "screen")
    private Set<Seat> seat;

    @OneToMany(mappedBy = "screen")
    private Set<MovieScreen> movieScreens;

    public Screen() {
    }

    public Screen(String name,  Integer capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Screen(String name, Theater theater) {
        this.name = name;
        this.theater = theater;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }

    public Set<Seat> getSeat() {
        return seat;
    }

    public void setSeat(Set<Seat> seat) {
        this.seat = seat;
    }

    public Set<MovieScreen> getMovieScreens() {
        return movieScreens;
    }

    public void setMovieScreens(Set<MovieScreen> movieScreens) {
        this.movieScreens = movieScreens;
    }
}