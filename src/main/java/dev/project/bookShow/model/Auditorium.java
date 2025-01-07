package dev.project.bookShow.model;

import dev.project.bookShow.model.constants.AuditoriumFeature;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
public class Auditorium extends BaseModel{
    private String name;
    private int capacity;
    @OneToMany
    @JoinColumn(name = "auditorium_id")
    private List<Seat> seats;
    @OneToMany
    @JoinColumn(name = "auditorium_id")
    private List<Show> shows;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }
}
