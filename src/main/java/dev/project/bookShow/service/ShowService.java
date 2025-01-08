package dev.project.bookShow.service;

import dev.project.bookShow.exception.ShowNotFoundException;
import dev.project.bookShow.model.Seat;
import dev.project.bookShow.model.Show;
import dev.project.bookShow.model.ShowSeat;
import dev.project.bookShow.model.constants.ShowSeatStatus;
import dev.project.bookShow.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShowService {
    @Autowired
    private ShowRepository showRepository;

    @Autowired
    private ShowSeatService showSeatService;

    public Show createShow(Show show) {
        //create ShowSeats for a show
        List<ShowSeat> showSeats = new ArrayList<>();
        List<Seat> seats = show.getAuditorium().getSeats();
        for (Seat seat: seats){
            ShowSeat showSeat = new ShowSeat();a
            showSeat.setSeat(seat);
            showSeat.setPrice(100);
            showSeat.setShowSeatStatus(ShowSeatStatus.AVAILABLE);
            showSeat = showSeatService.createShowSeat(showSeat);
            showSeats.add(showSeat);
        }
        show.setShowSeats(showSeats);
        return showRepository.save(show);
    }

    public Show getShowById(int id) {
        return showRepository.findById(id).orElseThrow(
                () -> new ShowNotFoundException("Show with id " + id + " is not found")
        );
    }

    public List<Show> getAllShows() {
        return showRepository.findAll();
    }
}
