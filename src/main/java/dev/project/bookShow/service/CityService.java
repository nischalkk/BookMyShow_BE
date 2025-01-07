package dev.project.bookShow.service;

import dev.project.bookShow.exception.CityNotFoundException;
import dev.project.bookShow.model.City;
import dev.project.bookShow.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService{
    @Autowired
    private CityRepository cityRepository;

    public City createCity(City city) {
        return cityRepository.save(city);
    }

    public City getCityById(int id){
        return cityRepository.findById(id).orElseThrow(
                () -> new CityNotFoundException("City with id "+id+" is not found")
        );
    }

    public List<City> getAllCities(){
        return cityRepository.findAll();
    }

    public void deleteCityById(int id){
        if(cityRepository.existsById(id)){
        cityRepository.deleteById(id);
        }

    }

}
