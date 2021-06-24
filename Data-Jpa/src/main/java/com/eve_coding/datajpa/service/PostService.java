package com.eve_coding.datajpa.service;

import com.eve_coding.datajpa.model.Post;
import com.eve_coding.datajpa.model.User;
import com.eve_coding.datajpa.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public List<Post> findAll() {
        return (List<Post>) postRepository.findAll();
    }

    public Post findById(Long id){
        return postRepository.findById(id).orElse(null);
    }
    public List<Post> getUserPosts(User user){
        return (List<Post>) postRepository.findByUser(user);
    }
    public void save(Post post){
        postRepository.save(post);
    }

    public void deleteById(Long id) {
        postRepository.deleteById(id);
    }
}
