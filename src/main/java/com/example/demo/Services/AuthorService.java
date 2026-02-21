package com.example.demo.Services;

import com.example.demo.Model.Author;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AuthorService {

    private Map<Long, Author> authorMap = new HashMap<>();
    private Long idCounter = 1L;

    public Author createAuthor(Author author) {
        author.setId(idCounter++);
        authorMap.put(author.getId(), author);
        return author;
    }

    public List<Author> getAllAuthors() {
        return new ArrayList<>(authorMap.values());
    }

    public Author getAuthorById(Long id) {
        return authorMap.get(id);
    }

    public Author updateAuthor(Long id, Author updatedAuthor) {
        Author existing = authorMap.get(id);
        if (existing != null) {
            existing.setName(updatedAuthor.getName());
            existing.setEmail(updatedAuthor.getEmail());
        }
        return existing;
    }

    public void deleteAuthor(Long id) {
        authorMap.remove(id);
    }
}