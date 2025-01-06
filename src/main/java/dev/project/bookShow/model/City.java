package dev.project.bookShow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class City extends BaseModel{
    private String name;
    @OneToMany
    @JoinColumn(name="city_id")
    private List<Theatre> theatres;
}
