package com.eve_coding.datajpa.controller;

import com.eve_coding.datajpa.model.Post;
import com.eve_coding.datajpa.model.User;
import com.eve_coding.datajpa.service.PostService;
import com.eve_coding.datajpa.service.UserService;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class PostController {
    @Autowired
    private PostService postService;
    @Autowired
    private UserService userService;

    @RequestMapping("/posts")
    public List<Post> getPostList(){
        return postService.findAll();
    }
    @RequestMapping("/post/{id}")
    public Post findPostById(@PathVariable Long id){
        return postService.findById(id);
    }
    @RequestMapping(value = "/posts/save",method = RequestMethod.POST)
    public void save(@RequestBody Post post){
        post.setPostDate(LocalDateTime.now());
        postService.save(post);
    }
    @RequestMapping(value = "/posts/{id}/update",method = RequestMethod.PUT)
    public void updatePost(@RequestBody Post post){
        post.setPostDate(LocalDateTime.now());
        postService.save(post);
    }
    @RequestMapping(value = "/posts/{id}/delete",method = RequestMethod.DELETE)
    public void deletePost(@PathVariable Long id){
        postService.deleteById(id);
    }
}
