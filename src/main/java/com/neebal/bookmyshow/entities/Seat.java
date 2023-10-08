package com.neebal.bookmyshow.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "seats")
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer seatNo;

    @Column(nullable = false)
    private Boolean seatStatus;

    @ManyToOne
    private Screen screen;

    @ManyToOne
    private Booking booking;

    public Seat() {
    }

    public Seat(Integer seatNo, Boolean seatStatus) {
        this.seatNo = seatNo;
        this.seatStatus = seatStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(Integer seatNo) {
        this.seatNo = seatNo;
    }

    public Boolean getSeatStatus() {
        return seatStatus;
    }

    public void setSeatStatus(Boolean seatStatus) {
        this.seatStatus = seatStatus;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
}
