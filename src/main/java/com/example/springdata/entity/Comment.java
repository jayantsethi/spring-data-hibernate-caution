package com.example.springdata.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Comment {
    @Id
    private int id;
    private String content;
}
