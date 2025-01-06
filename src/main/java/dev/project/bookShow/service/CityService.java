package dev.project.bookShow.service;

import dev.project.bookShow.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService{
    @Autowired
    private CityRepository cityRepository;

    
}
