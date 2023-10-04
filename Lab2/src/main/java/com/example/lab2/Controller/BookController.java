package com.example.lab2.Controller; // Corrected package name to follow naming conventions

import com.example.lab2.Model.Books;


import com.example.lab2.Service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {
   // private final BookService bookService;

    @GetMapping("/get")
    public String getAllBooks(Model model) {
        model.addAttribute("books"); //bookService.getBooks());
        return "books";
    }

    @GetMapping("/getBook")
    public String getBookById(@RequestParam(required = false, name = "bookId") int id, Model model) {
        model.addAttribute("book", Books.builder()
                .id(1)
                .title("Lost")
                .isbn("123")
                .build());

        return "books";
    }

    @GetMapping("/{id}")
    public String getBookById2(@PathVariable int id, Model model) {
        model.addAttribute("book", Books.builder()
                .id(id)
                .title("Lost")
                .isbn("123")
                .build());

        return "books";
    }

    @GetMapping("/{bookId}/comments/{cid}")
    public String getBookCommentByBookIdAndCommentId(@PathVariable int bookId, @PathVariable int cid, Model model) {
        model.addAttribute("book", Books.builder()
                .id(bookId)
                .title(String.valueOf(cid))
                .isbn("123")
                .build());

        return "books";
    }

    @GetMapping("/getBookByTitle")
    public String getBookByTitle(@RequestParam(required = false, name = "bookTitle") String title, Model model) {
        model.addAttribute("book", Books.builder()
                .id(1)
                .title(title)
                .isbn("123")
                .build());

        return "books";
    }

    @GetMapping("/getBookByIsbn")
    public String getBookByIsbn(@RequestParam(required = false, name = "bookIsbn") String isbn, Model model) {
        model.addAttribute("book", Books.builder()
                .id(1)
                .title("Lost")
                .isbn(isbn)
                .build());

        return "books";
    }

    @PostMapping("/save")
    public String saveBook() {
        return "saveBook";
    }

    @PutMapping("/update")
    public String updateBook() {
        return "updateBook";
    }

    @DeleteMapping("/delete")
    public String deleteBook() {
        return "deleteBook";
    }
}
