package com.springboot.quickstart.dao;


import com.springboot.quickstart.entity.Book;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class BookDao {
    public List<Book> getBooks(){
        List<Book> books = new ArrayList<>();
        books.add(new Book(1,"Spring Boot 实战",88.7));
        books.add(new Book(2,"Spring MVC",77.8));
        books.add(new Book(3,"java入门",89.6));
        return books;

    }
}
