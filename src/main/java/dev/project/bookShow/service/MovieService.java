package dev.project.bookShow.service;

import dev.project.bookShow.exception.MovieNotFoundException;
import dev.project.bookShow.model.Movie;
import dev.project.bookShow.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public Movie createMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public Movie getMovieById(int id) {
        return movieRepository.findById(id).orElseThrow(
                () -> new MovieNotFoundException("Movie with id " + id + " is not found")
        );
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }
}
