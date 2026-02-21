package com.example.demo.Model;

import lombok.Data;

import java.awt.print.Book;
import java.util.List;

@Data
public class Author {

    private Long id;
    private String name;
    private String email;
    private List<Book> books;
}