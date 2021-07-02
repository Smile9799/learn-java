package com.eve_coding.datajpa.controller.archive;

import com.eve_coding.datajpa.model.archive.Post;
import com.eve_coding.datajpa.model.archive.User;
import com.eve_coding.datajpa.service.archive.PostService;
import com.eve_coding.datajpa.service.archive.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private PostService postService;

    @RequestMapping("/users")
    public List<User> getUserList(){
        return userService.findAll();
    }
    @RequestMapping("/user/{id}")
    public User findUserById(@PathVariable Long id){
        return userService.findById(id);
    }
    @RequestMapping("/user/{id}/posts")
    public List<Post> findPostByUser(@PathVariable Long id){
        User user = userService.findById(id);
        if(user != null){
            return postService.getUserPosts(user);
        }
        return null;
    }
    @RequestMapping(value = "/users/save",method = RequestMethod.POST)
    public void save(@RequestBody User user){
        userService.save(user);
    }
    @RequestMapping(value = "/users/{id}/update",method = RequestMethod.PUT)
    public void updateUser(@RequestBody User user){
        userService.save(user);
    }
    @RequestMapping("/users/{id}/delete")
    public void deleteUser(@PathVariable Long id){
        userService.deleteById(id);
    }
}
