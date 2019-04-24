package com.cs3704.novel.controller;

import com.cs3704.novel.entity.Author;
import com.cs3704.novel.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    AuthorRepository authorRepository;

//    @GetMapping("/test")
//    public String test(){
//        System.out.println(authorRepository.findAll());
//        return "login";
//    }

//    @PostMapping(value = "/user/login")
//    public String login(@RequestParam("username") String username,
//                        @RequestParam("password") String password,
//                        Map<String, Object> msg, HttpSession session){
//        try{
//            Author author = authorRepository.findByUserName(username);
//            System.out.println(author);
//            if (author.getPassword().equals(password)){
//                session.setAttribute("loginUser", username);
//                return "redirect:/main.html";
//            }
//            else {
//                msg.put("msg", "username or password is wrong");
//                return "login";
//            }
//        }
//        catch (Exception e){
//            msg.put("msg", "username or password is wrong");
//            return "login";
//        }
//
//    }
}
