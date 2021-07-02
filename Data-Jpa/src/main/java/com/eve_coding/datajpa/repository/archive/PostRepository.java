package com.eve_coding.datajpa.repository.archive;

import com.eve_coding.datajpa.model.archive.Post;
import com.eve_coding.datajpa.model.archive.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<Post,Long> {
    List<Post> findByUser(User user);
}
