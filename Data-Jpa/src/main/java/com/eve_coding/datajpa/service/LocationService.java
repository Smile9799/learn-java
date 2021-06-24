package com.eve_coding.datajpa.service;

import com.eve_coding.datajpa.model.Location;
import com.eve_coding.datajpa.model.Location;
import com.eve_coding.datajpa.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {
    @Autowired
    private LocationRepository locationRepository;

    public List<Location> findAll() {
        return (List<Location>) locationRepository.findAll();
    }

    public Location findById(Long id){
        return locationRepository.findById(id).orElse(null);
    }

    public void save(Location location){
        locationRepository.save(location);
    }

    public void deleteById(Long id) {
        locationRepository.deleteById(id);
    }
}
