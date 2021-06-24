package com.eve_coding.datajpa.repository;

import com.eve_coding.datajpa.model.Location;
import com.eve_coding.datajpa.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Long> {
    List<User> findByLocation(Location location);
}
