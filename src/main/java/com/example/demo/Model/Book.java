package com.example.demo.Model;

import lombok.Data;

@Data
public class Book {
    private Long id;
    private String title;
    private double price;
    private Long authorId;
}
