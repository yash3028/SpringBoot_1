package com.example.demo.Services;

import com.example.demo.Model.Book;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BookService {

    private Map<Long, Book> bookMap = new HashMap<>();
    private Long idCounter = 1L;

    public Book createBook(Book book) {
        book.setId(idCounter++);
        bookMap.put(book.getId(), book);
        return book;
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(bookMap.values());
    }

    public Book getBookById(Long id) {
        return bookMap.get(id);
    }

    public Book updateBook(Long id, Book updatedBook) {
        Book existing = bookMap.get(id);
        if (existing != null) {
            existing.setTitle(updatedBook.getTitle());
            existing.setPrice(updatedBook.getPrice());
        }
        return existing;
    }

    public void deleteBook(Long id) {
        bookMap.remove(id);
    }
}