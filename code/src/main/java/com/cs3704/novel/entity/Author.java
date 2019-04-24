package com.cs3704.novel.entity;

import java.util.*;

public class Author {
    private Integer id;
    private String userName;
    private String name;
    private String password;
    private String contact;
    private List<Novel> novels;

    public Author(int id, String userName, String name, String password, String contact){
        this.id = id;
        this.userName = userName;
        this.name = name;
        this.password = password;
        this.contact = contact;
        novels = new LinkedList<>();
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public String getUserName(){
        return this.userName;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return this.password;
    }

    public void setContact(String contact){
        this.contact = contact;
    }

    public String getContact(){
        return this.contact;
    }

    public void addNovel(Novel novel){
        this.novels.add(novel);
    }

    public Collection<Novel> getNovels(){
        return this.novels;
    }

    @Override
    public String toString(){
        return "Employee{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", name='" + name + '\'' +
                ", contact=" + contact +
                '}';
    }
}
