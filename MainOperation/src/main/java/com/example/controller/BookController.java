package com.example.controller;

import com.example.model.Book;
import com.example.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {
    private BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @PostMapping("/book")
    public ResponseEntity<Book> saveBook(@RequestBody Book request){
        return new ResponseEntity<>(bookService.save(request), HttpStatus.CREATED);
    }

    @GetMapping("/book/{id}")
    public ResponseEntity<Book> findByBookId(@PathVariable Long id) {
        return new ResponseEntity<>(bookService.findByBookId(id), HttpStatus.OK);
    }
}
