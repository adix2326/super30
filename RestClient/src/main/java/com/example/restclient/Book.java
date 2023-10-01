package com.example.restclient;

import jakarta.persistence.*;

@Entity
@Table(name="db_book")
public class Book {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String title;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name= name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }

    public void setYearOfPublish(int yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }

    private int yearOfPublish;

}
