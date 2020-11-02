package com.codegym.blog.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity(name = "blog")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;
    @Column(columnDefinition = "Text")
    String blogContent;
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "catelory_id",referencedColumnName = "id")
    private Catelory cateloryBlog;
    private String dateWrite;

    public String getDateWrite() {
        return dateWrite;
    }

    public void setDateWrite(String dateWrite) {
        this.dateWrite = dateWrite;
    }

    public Catelory getCateloryBlog() {
        return cateloryBlog;
    }

    public void setCateloryBlog(Catelory cateloryBlog) {
        this.cateloryBlog = cateloryBlog;
    }

    public Blog() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent;
    }
}
