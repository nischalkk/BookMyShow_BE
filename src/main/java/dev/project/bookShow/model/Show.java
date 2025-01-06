package dev.project.bookShow.model;

import dev.project.bookShow.model.constants.ShowStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity(name="BMS_Show")
public class Show extends BaseModel {
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String language;
    @ManyToOne
    private Auditorium auditorium;
    @ManyToOne
    private Movie movie;
    @OneToMany
    @JoinColumn(name = "show_id")
    private List<ShowSeat> showSeats;
    @Enumerated(EnumType.STRING)
    private ShowStatus showStatus;
}
