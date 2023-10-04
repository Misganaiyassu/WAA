package com.example.lab3.Controller;

import com.example.lab3.Model.Book;
import com.example.lab3.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/books")
public class BookController {
    @Autowired
    private BookService bookService;
    @GetMapping(value = "/list", params = "version=1" )
    public String getAllBooks() {

        return  bookService.getAllBooks();
    }
    @GetMapping(value = "/v1/{id}", produces = "application/cs.miu.edu-v2+json")
    public Book getBookById(@PathVariable Integer id) {

        return bookService.getBookById(id);
    }
    @PostMapping("/add")
    public void addBook(Book book) {
        bookService.addBook(book);
    }
    @PutMapping("/update/{id}")
    public void updateBook(@PathVariable int id, Book book) {
        bookService.updateBook(id, book);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteBook(@PathVariable int id) {
        bookService.deleteBook(id);
    }

}
