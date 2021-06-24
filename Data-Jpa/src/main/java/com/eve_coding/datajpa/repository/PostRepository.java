package com.eve_coding.datajpa.repository;

import com.eve_coding.datajpa.model.Post;
import com.eve_coding.datajpa.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<Post,Long> {
    List<Post> findByUser(User user);
}
