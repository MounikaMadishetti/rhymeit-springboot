package com.javatechie.crud.example.service;

import com.javatechie.crud.example.entity.Post;
import com.javatechie.crud.example.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepository repository;

    public Post savePost(Post post) {
        return repository.save(post);
    }

    public List<Post> savePosts(List<Post> posts) {
        return repository.saveAll(posts);
    }

    public List<Post> getPosts() {
        return repository.findAll();
    }

    public Post getPostById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Post getPostByName(String name) {
        return repository.findByName(name);
    }

    public String deletePost(int id) {
        repository.deleteById(id);
        return "post removed !! " + id;
    }

    public Post updatePost(Post post) {
        Post existingPost = repository.findById(post.getId()).orElse(null);
        existingPost.setName(post.getName());
        existingPost.setPoem(post.getPoem());
        return repository.save(existingPost);
    }


}
