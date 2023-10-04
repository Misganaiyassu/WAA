package com.example.lab2.Controller;

import com.example.lab2.Model.Books;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/get")
    public String getUser(Model model){
        Books b1 = new Books(1, "Lost", "My old self");
        Books b2 = Books.builder()
                .id(2) //return this
                .title("found")
                .isbn("new me")
                .build();
        var books = Arrays.asList(b1, b2);
        model.addAttribute("books", books);
        return "books";
    }
}
