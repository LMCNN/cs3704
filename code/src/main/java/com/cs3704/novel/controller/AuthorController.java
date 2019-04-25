package com.cs3704.novel.controller;

import com.cs3704.novel.entity.Author;
import com.cs3704.novel.entity.Novel;
import com.cs3704.novel.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import javax.servlet.http.HttpSession;
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
    public String addAuthor(Author author){
        System.out.println("Author info: " + author);
        authorRepository.save(author);
        return "redirect:/";
    }

    @GetMapping("/delAuthor")
    public String deleteAuthor(HttpSession session){
        String username = session.getAttribute("loginUser").toString();
        System.out.println("Current UserName: " + username);
        int id = authorRepository.findIdByName(username);
        System.out.println("Current User: "+ authorRepository.get(id));
        authorRepository.delete(id);
        return "redirect:/";
    }

    @GetMapping("/update")
    public String toUpdatePage(){
        return "update";
    }

    @PutMapping("update")
    public String updateAuthor(Author author){
        System.out.println("updated author: " + author);
        authorRepository.save(author);
        return "redirect:/main.html";
    }

    @GetMapping("/addNovel")
    public String toAddNovelPage(){
        return "addNovel";
    }

    @PostMapping("/addNovel")
    public String addNovel(Novel novel, HttpSession session){
        System.out.println("Novel info: " + novel);
        String username = session.getAttribute("loginUser").toString();
        System.out.println("Current UserName: " + username);
        int id = authorRepository.findIdByName(username);
        authorRepository.addNovel(id, novel);
        return "redirect:main.html";
    }
}
