package dev.project.bookShow.model;

import dev.project.bookShow.model.constants.TicketStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Ticket extends BaseModel {
    @OneToMany
    @JoinColumn(name = "ticket_id")
    private List<ShowSeat> showSeats;
    @ManyToOne
    private Show show;
    private LocalDateTime bookingtime;
    private double localCost;
    @ManyToOne
    private User user;
    @Enumerated(EnumType.STRING)
    private TicketStatus ticketStatus;

    public List<ShowSeat> getShowSeats() {
        return showSeats;
    }

    public void setShowSeats(List<ShowSeat> showSeats) {
        this.showSeats = showSeats;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public LocalDateTime getBookingtime() {
        return bookingtime;
    }

    public void setBookingtime(LocalDateTime bookingtime) {
        this.bookingtime = bookingtime;
    }

    public double getLocalCost() {
        return localCost;
    }

    public void setLocalCost(double localCost) {
        this.localCost = localCost;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public TicketStatus getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(TicketStatus ticketStatus) {
        this.ticketStatus = ticketStatus;
    }
}