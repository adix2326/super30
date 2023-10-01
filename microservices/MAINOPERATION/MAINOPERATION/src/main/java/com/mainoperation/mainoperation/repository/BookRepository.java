package com.mainoperation.mainoperation.repository;

import com.mainoperation.mainoperation.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}