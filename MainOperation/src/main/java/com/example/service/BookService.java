package com.example.service;

import com.example.model.Book;
import com.example.repository.BookRepository;

import java.util.Optional;

public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public Book save(Book request){
        return bookRepository.save(request);
    }

    public Book findByBookId(Long id){
        Optional<Book> optDb = bookRepository.findById(id);
        if(optDb.isPresent()){
            return optDb.get();
        }
        else{
            throw new RuntimeException("Record with Id:"+id+" not found");
        }
    }
}
