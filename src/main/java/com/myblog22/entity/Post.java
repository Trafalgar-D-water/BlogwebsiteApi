package com.myblog22.entity;


import jakarta.persistence.*;


@Entity
@Table(name = "posts")

public class Post {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String content;
    private String title;
    private String description;
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
