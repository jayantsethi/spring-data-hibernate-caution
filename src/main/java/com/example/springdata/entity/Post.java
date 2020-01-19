package com.example.springdata.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Post {
    @Id
    private int id;
    private String content;
    @OneToMany
    private List<Comment> comments;
}
