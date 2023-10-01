package com.mainoperation.mainoperation.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mainoperation.mainoperation.model.Book;
import com.mainoperation.mainoperation.service.BookService;

import java.util.List;

@RestController
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService)
    {
        this.bookService=bookService;
    }

    @PostMapping("/book")
    public ResponseEntity<Book> saveBook(@RequestBody Book request)
    {
        return new ResponseEntity<>(bookService.save(request),HttpStatus.CREATED);
    }

    @GetMapping("/books")
    public ResponseEntity<List<Book>> allBooks() {
        List<Book> books = bookService.listAllBooks();
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @GetMapping("book/{id}")
    public ResponseEntity<Book> findByBookId(@PathVariable Long id)
    {
        return new ResponseEntity<>(bookService.findByBookId(id), HttpStatus.OK);
    }
}

