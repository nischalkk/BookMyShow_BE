package dev.project.bookShow.repository;

import dev.project.bookShow.model.City;
import dev.project.bookShow.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Integer> {

}
