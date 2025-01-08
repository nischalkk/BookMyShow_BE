package dev.project.bookShow.service;

import dev.project.bookShow.exception.SeatNotFoundException;
import dev.project.bookShow.model.Seat;
import dev.project.bookShow.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatService {
    @Autowired
    private SeatRepository seatRepository;

    public Seat createSeat(Seat seat) {
        return seatRepository.save(seat);
    }

    public Seat getSeatById(int id) {
        return seatRepository.findById(id).orElseThrow(
                () -> new SeatNotFoundException("Seat with id " + id + " is not found")
        );
    }

    public List<Seat> getAllSeats() {
        return seatRepository.findAll();
    }
}
