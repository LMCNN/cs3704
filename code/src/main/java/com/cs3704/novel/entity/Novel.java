package com.cs3704.novel.entity;

import java.util.*;

public class Novel {
    private Integer id;
    private String title;
    private List<Author> authors;

    public Novel (int id, String title){
        this.id = id;
        this.title = title;
        authors = new LinkedList<>();
    }

    public int getId(){
        return this.id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void addAuthor(Author author){
        authors.add(author);
    }

    public Collection<Author> getAuthors() {
        return authors;
    }

    @Override
    public String toString() {
        return "Novel [id=" + id + ", title=" + title + "]";
    }
}
