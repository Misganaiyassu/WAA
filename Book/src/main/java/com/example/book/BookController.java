package com.example.book;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class BookController {

    @GetMapping("/books")
    public List<Books> getAllBooks() {
        return List.of(
                new Books(1,
                        "The Lord of the Rings",
                        "J.R.R. Tolkien"
                        ),
                new Books(2,
                        "The Lord of the Rings",
                        "J.R.R. Tolkien"
                        ),
                new Books(3,
                        "The Lord of the Rings",
                        "J.R.R. Tolkien"
                        )
        );
    }

}
