package dev.project.bookShow.repository;

import dev.project.bookShow.model.City;
import dev.project.bookShow.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatRepository extends JpaRepository<Seat,Integer> {

}
