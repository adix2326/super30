package com.example.restclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/consume/book")
public class BookController {
    @Autowired
    private RestTemplate restTemplate;

    @PostMapping
    public ResponseEntity<Book> saveBook(@RequestBody Book request){
        String apiUrl = "http://practice-client/book";
        ResponseEntity<Book> response = restTemplate.postForEntity(apiUrl, request, Book.class);
        return response;
    }
}
