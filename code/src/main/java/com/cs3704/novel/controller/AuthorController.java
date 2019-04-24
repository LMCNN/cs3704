package com.cs3704.novel.controller;

import com.cs3704.novel.entity.Author;
import com.cs3704.novel.repository.AuthorRepository;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
import java.util.Collection;

@Controller
public class AuthorController {

    @Autowired
    AuthorRepository authorRepository;

    @GetMapping("/au")
    public String list(Model model, HttpSession session){

        Object username = session.getAttribute("loginUser");
        System.out.println(username.toString());
        Author author = authorRepository.findByUserName(username.toString());

        model.addAttribute("au", author);
        return "au/novel";
    }
}
