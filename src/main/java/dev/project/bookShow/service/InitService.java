package dev.project.bookShow.service;

import dev.project.bookShow.model.*;
import dev.project.bookShow.model.constants.SeatStatus;
import dev.project.bookShow.model.constants.SeatType;
import dev.project.bookShow.model.constants.ShowStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class InitService {

    @Autowired
    private CityService cityService;
    @Autowired
    private TheatreService theatreService;
    @Autowired
    private SeatService seatService;
    @Autowired
    private ShowSeatService showSeatService;
    @Autowired
    private AuditoriumService auditoriumService;
    @Autowired
    private MovieService movieService;
    @Autowired
    private ShowService showService;
    @Autowired
    private UserService userService;

    public void initialise(){
        //create Seats
        List<Seat> seats = new ArrayList<>();
        for(int i=1;i<=100;i++){
            Seat seat = new Seat();
            seat.setSeatNumber("Seat - "+i);
            seat.setRow1(i);
            seat.setCol(i);
            seat.setSeatStatus(SeatStatus.AVAILABLE);
            seat.setSeatType(SeatType.GOLD);
            seat = seatService.createSeat(seat);
            seats.add(seat);
        }

        //create auditorium
        Auditorium auditorium = new Auditorium();
        auditorium.setName("AUDI-01");
        auditorium.setCapacity(100);
        auditorium.setSeats(seats);
        auditorium = auditoriumService.createAuditorium(auditorium);


        //create Theatre
        Theatre theatre = new Theatre();
        theatre.setName("PVR INOX CINEPOLIS");
        theatre.setAddress("Electronic City");
        theatre.setAuditoriums(List.of(auditorium));
        theatre = theatreService.createTheatre(theatre);

        // create City
        City city = new City();
        city.setName("Bangalore");
        city.setTheatres(List.of(theatre));
        city = cityService.createCity(city);

        //create movie
        Movie movie = new Movie();
        movie.setName("Moana");
        movie.setLanguage("English");
        movie = movieService.createMovie(movie);

        //create show
        Show show = new Show();
        show.setMovie(movie);
        show.setStartTime(LocalDateTime.now());
        show.setEndTime(LocalDateTime.now().plusHours(2));
        show.setLanguage("English");
        show.setAuditorium(auditorium);
        show.setShowStatus(ShowStatus.YET_TO_START);
        show = showService.createShow(show);


    }
}
