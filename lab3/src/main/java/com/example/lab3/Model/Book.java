package com.example.lab3.Model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Book {
    private Integer id;
    private String title;
    private String isbn;
    private double price;

}
