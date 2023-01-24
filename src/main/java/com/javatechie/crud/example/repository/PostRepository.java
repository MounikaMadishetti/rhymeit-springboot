package com.javatechie.crud.example.repository;

import com.javatechie.crud.example.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Integer> {
    Post findByName(String name);
}

