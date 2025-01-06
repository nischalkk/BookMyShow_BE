package dev.project.bookShow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Theatre extends BaseModel{
    private String name;
    private String Address;
    @OneToMany
    @JoinColumn(name = "theatre_id")
    private List<Auditorium> auditoriums;
}
