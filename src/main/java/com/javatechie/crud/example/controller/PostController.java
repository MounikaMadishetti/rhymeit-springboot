package com.javatechie.crud.example.controller;

import com.javatechie.crud.example.entity.Post;
import com.javatechie.crud.example.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    private PostService service;

    @PostMapping("/addPost")
    public Post addPost(@RequestBody Post post) {
        return service.savePost(post);
    }

    @PostMapping("/addPosts")
    public List<Post> addPosts(@RequestBody List<Post> posts) {
        return service.savePosts(posts);
    }

    @GetMapping("/posts")
    public List<Post> findAllPosts() {
        return service.getPosts();
    }

    @GetMapping("/postById/{id}")
    public Post findPostById(@PathVariable int id) {
        return service.getPostById(id);
    }

    @GetMapping("/post/{name}")
    public Post findPostByName(@PathVariable String name) {
        return service.getPostByName(name);
    }

    @PutMapping("/update")
    public Post updatePost(@RequestBody Post post) {
        return service.updatePost(post);
    }

    @DeleteMapping("/delete/{id}")
    public String deletePost(@PathVariable int id) {
        return service.deletePost(id);
    }
}
