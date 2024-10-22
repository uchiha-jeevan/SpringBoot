package com.library.RESTAPI.controller;

import com.library.RESTAPI.model.Book;
import com.library.RESTAPI.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookRepository bookrepository;

    @GetMapping
    public List<Book> getAllBooks(){
        return bookrepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable long id){
        return bookrepository.findById(id).map(book -> ResponseEntity.ok().body(book)).orElse(ResponseEntity.notFound().build());

    }

    @PostMapping
    public String createBook(@RequestBody Book book){
        bookrepository.save(book);
        return "Book created";
    }
    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book bookDetails) {
        return bookrepository.findById(id)
                .map(book -> {
                    book.setName(bookDetails.getName());
                    book.setAuthor(bookDetails.getAuthor());
                    book.setPages(bookDetails.getPages());
                    book.setRating(bookDetails.getRating());
                    book.setPrice(bookDetails.getPrice());
                    Book updatedBook = bookrepository.save(book);
                    return ResponseEntity.ok(updatedBook);
                }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        return bookrepository.findById(id)
                .map(book -> {
                    bookrepository.delete(book);
                    return ResponseEntity.ok().<Void>build();
                }).orElse(ResponseEntity.notFound().build());
    }
}

