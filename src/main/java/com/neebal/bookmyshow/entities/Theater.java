package com.neebal.bookmyshow.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "theaters")
public class Theater {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = true)
    private String address;

    @OneToMany(mappedBy = "theater")
    private Set<MovieTheater> movieTheater;

    @OneToMany(mappedBy = "theater")
    private Set<Screen> screen;

    @OneToMany(mappedBy = "theater")
    private Set<MovieScreen> movieScreens;

    public Theater() {
    }

    public Theater(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Set<MovieScreen> getMovieScreens() {
        return movieScreens;
    }

    public void setMovieScreens(Set<MovieScreen> movieScreens) {
        this.movieScreens = movieScreens;
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

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public Set<MovieTheater> getMovieTheater() {
        return movieTheater;
    }

    public void setMovieTheater(Set<MovieTheater> movieTheater) {
        this.movieTheater = movieTheater;
    }

    public Set<Screen> getScreen() {
        return screen;
    }

    public void setScreen(Set<Screen> screen) {
        this.screen = screen;
    }

}

