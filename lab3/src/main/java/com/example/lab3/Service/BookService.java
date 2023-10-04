package com.example.lab3.Service;

import com.example.lab3.Model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    public String getAllBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "The Lord of the Rings", "J.R.R. Tolkien", 100));
        books.add(new Book(2, "The Lord of the Rings", "J.R.R. Tolkien", 100));
        books.add(new Book(3, "The Lord of the Rings", "J.R.R. Tolkien", 100));
        return books.toString();
    }
    public Book getBookById(Integer id) {

        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "The Lord of the Rings", "J.R.R. Tolkien", 100));
        books.add(new Book(2, "The Lord of the Rings", "J.R.R. Tolkien", 100));
        books.add(new Book(3, "The Lord of the Rings", "J.R.R. Tolkien", 100));
        return books.get(id);
    }

    public void addBook(Book book) {

        List<Book> books = new ArrayList<>();
        books.add(book);
    }

    public void updateBook(int id, Book book) {

        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "The Lord of the Rings", "J.R.R. Tolkien", 100));
        books.add(new Book(2, "The Lord of the Rings", "J.R.R. Tolkien", 100));
        books.add(new Book(3, "The Lord of the Rings", "J.R.R. Tolkien", 100));
        books.set(id, book);
    }

    public void deleteBook(int id) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "The Lord of the Rings", "J.R.R. Tolkien", 100));
        books.add(new Book(2, "The Lord of the Rings", "J.R.R. Tolkien", 100));
        books.add(new Book(3, "The Lord of the Rings", "J.R.R. Tolkien", 100));
        books.remove(id);
    }
}
