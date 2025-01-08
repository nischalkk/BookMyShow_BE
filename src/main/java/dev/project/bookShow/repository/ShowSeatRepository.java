package dev.project.bookShow.repository;

import dev.project.bookShow.model.City;
import dev.project.bookShow.model.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeat,Integer> {

}
