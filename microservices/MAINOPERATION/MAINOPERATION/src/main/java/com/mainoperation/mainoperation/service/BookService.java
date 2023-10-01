package com.mainoperation.mainoperation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mainoperation.mainoperation.model.Book;
import com.mainoperation.mainoperation.repository.BookRepository;

@Service
public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository)
    {
        this.bookRepository=bookRepository;
    }

    public Book save(Book request)
    {
        return bookRepository.save(request);
    }

    public Book findByBookId(Long id)
    {
        Optional<Book> optDb=bookRepository.findById(id);
        if(optDb.isPresent())
        {
            return optDb.get();
        }
        else
        {
            throw new RuntimeException("Record with id: "+ id +" not found");
        }
    }

    public List<Book> listAllBooks() {
        return bookRepository.findAll();
    }
}

