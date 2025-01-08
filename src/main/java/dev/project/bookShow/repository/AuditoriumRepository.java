package dev.project.bookShow.repository;

import dev.project.bookShow.model.Auditorium;
import dev.project.bookShow.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditoriumRepository extends JpaRepository<Auditorium,Integer> {

}
