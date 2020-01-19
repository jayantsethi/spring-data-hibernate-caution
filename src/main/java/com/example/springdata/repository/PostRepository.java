package com.example.springdata.repository;

import com.example.springdata.entity.Post;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Integer> {
    @Override
    @EntityGraph(attributePaths = {"comments"})
    Iterable<Post> findAll();
}
