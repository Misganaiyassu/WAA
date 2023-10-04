package com.example.lab2.Service;

import com.example.lab2.Model.Books;

import java.util.Arrays;
import java.util.List;

public class BookServiceImpl implements BookService{

    @Override
    public List<Books> getBooks() {
       Books b1 = new Books(1, "Lost", "My old self");
       Books b2 = Books.builder()
               .id(2)
               .title("Found")
               .isbn("new me")
               .build();
        return Arrays.asList(b1, b2);
    }
}
