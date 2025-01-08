package dev.project.bookShow.service;

import dev.project.bookShow.exception.AuditoriumNotFoundException;
import dev.project.bookShow.model.Auditorium;
import dev.project.bookShow.repository.AuditoriumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuditoriumService {
    @Autowired
    private AuditoriumRepository auditoriumRepository;

    public Auditorium createAuditorium(Auditorium auditorium) {
        return auditoriumRepository.save(auditorium);
    }

    public Auditorium getAuditoriumById(int id) {
        return auditoriumRepository.findById(id).orElseThrow(
                () -> new AuditoriumNotFoundException("Auditorium with id " + id + " is not found")
        );
    }

    public List<Auditorium> getAllAuditoriums() {
        return auditoriumRepository.findAll();
    }
}
