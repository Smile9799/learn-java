package com.eve_coding.datajpa.repository.archive;

import com.eve_coding.datajpa.model.archive.Location;
import com.eve_coding.datajpa.model.archive.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Long> {
    List<User> findByLocation(Location location);
}
