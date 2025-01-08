package dev.project.bookShow.service;

import dev.project.bookShow.exception.TheatreNotFoundException;
import dev.project.bookShow.model.Theatre;
import dev.project.bookShow.repository.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheatreService {
    @Autowired
    private TheatreRepository theatreRepository;

    public Theatre createTheatre(Theatre theatre) {
        return theatreRepository.save(theatre);
    }

    public Theatre getTheatreById(int id) {
        return theatreRepository.findById(id).orElseThrow(
                () -> new TheatreNotFoundException("Theatre with id " + id + " is not found")
        );
    }

    public List<Theatre> getAllTheatres() {
        return theatreRepository.findAll();
    }
}
