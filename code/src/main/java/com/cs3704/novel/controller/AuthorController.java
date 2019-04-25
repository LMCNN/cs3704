package com.cs3704.novel.controller;

import com.cs3704.novel.entity.Author;
import com.cs3704.novel.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.Collection;
import java.util.Map;

@Controller
public class AuthorController {

    @Autowired
    AuthorRepository authorRepository;

    @GetMapping("/aus")
    public void list(){
        System.out.println(authorRepository.findAll().toString());
    }

    @GetMapping("/au")
    public String toAddPage(){
        return "add";
    }

    @PostMapping("/au")
    public String addAuthor(Author author, Map<String, Object> msg){
        System.out.println("Author info: " + author);
        authorRepository.save(author);
        return "redirect:/login.html";
    }
}
