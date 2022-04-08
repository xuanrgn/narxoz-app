package kz.narxoz.narxozapp.controller;

import kz.narxoz.narxozapp.model.Book;
import kz.narxoz.narxozapp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @GetMapping("books")
    public List<Book> getAll() {
        return bookRepository.findAll();
    }
}
