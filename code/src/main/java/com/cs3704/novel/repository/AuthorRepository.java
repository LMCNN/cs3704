package com.cs3704.novel.repository;

import com.cs3704.novel.entity.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class AuthorRepository{
    private static Map<Integer, Author> authors;

    @Autowired
    private NovelRepository novelRepository;

    static {
        authors = new HashMap<>();

        authors.put(1, new Author(1, "admin", "superuser", "123456", "admin@abc"));
        authors.put(2, new Author(2, "mingchi", "mingchi", "123", "mingchi@abc"));
    }

    public void save(Author author){
        authors.put(author.getId(), author);
    }

    public Collection<Author> getAll(){
        return authors.values();
    }

    public Author get(Integer id){
        return authors.get(id);
    }

    public void delete(Integer id){
        authors.remove(id);
    }
}
