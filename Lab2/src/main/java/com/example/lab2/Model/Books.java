package com.example.lab2.Model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Books {
    int id;
    String title;
    String isbn;

}