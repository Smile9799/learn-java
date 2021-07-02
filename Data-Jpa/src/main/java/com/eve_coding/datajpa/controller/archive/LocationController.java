package com.eve_coding.datajpa.controller.archive;

import com.eve_coding.datajpa.model.archive.Location;
import com.eve_coding.datajpa.model.archive.User;
import com.eve_coding.datajpa.service.archive.LocationService;
import com.eve_coding.datajpa.service.archive.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LocationController {
    @Autowired
    private LocationService locationService;
    @Autowired
    private UserService userService;

    @RequestMapping("/locations")
    public List<Location> getLocationList(){
        return locationService.findAll();
    }
    @RequestMapping("/location/{id}")
    public Location findLocationById(@PathVariable Long id){
        return locationService.findById(id);
    }
    @RequestMapping("/location/{id}/users")
    public List<User> getUsersByLocation(@PathVariable Long id){
        Location location = locationService.findById(id);
        if(location != null){
            return userService.findByLocation(location);
        }
        return null;
    }
    @RequestMapping(value = "/locations/save",method = RequestMethod.POST)
    public String saveLocation(@RequestBody Location location){
        locationService.save(location);
        return "saved";
    }
    @RequestMapping(value = "/locations/{id}/update",method = RequestMethod.PUT)
    public void updateLocation(@RequestBody Location location){
        locationService.save(location);
    }
    @RequestMapping("/locations/{id}/delete")
    public void  deleteLocation(@PathVariable Long id){
        locationService.deleteById(id);
    }
}
