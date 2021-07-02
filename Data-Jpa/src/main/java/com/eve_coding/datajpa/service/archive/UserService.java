package com.eve_coding.datajpa.service.archive;

import com.eve_coding.datajpa.model.archive.Location;
import com.eve_coding.datajpa.model.archive.User;
import com.eve_coding.datajpa.repository.archive.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }

    public User findById(Long id){
        return userRepository.findById(id).orElse(null);
    }

    public List<User> findByLocation(Location location){
        return userRepository.findByLocation(location);
    }
    public void save(User user){
        userRepository.save(user);
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
