package dev.project.bookShow.service;

import dev.project.bookShow.exception.ShowSeatNotFoundException;
import dev.project.bookShow.model.ShowSeat;
import dev.project.bookShow.repository.ShowSeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowSeatService {
    @Autowired
    private ShowSeatRepository showSeatRepository;

    public ShowSeat createShowSeat(ShowSeat showSeat) {
        return showSeatRepository.save(showSeat);
    }

    public ShowSeat getShowSeatById(int id) {
        return showSeatRepository.findById(id).orElseThrow(
                () -> new ShowSeatNotFoundException("ShowSeat with id " + id + " is not found")
        );
    }

    public List<ShowSeat> getAllShowSeats() {
        return showSeatRepository.findAll();
    }
}
