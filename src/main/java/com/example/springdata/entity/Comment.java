package com.example.springdata.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Comment {
    @Id
    private Integer id;
    private String content;
}
