package kz.narxoz.narxozapp.controller;

import kz.narxoz.narxozapp.model.Book;
import kz.narxoz.narxozapp.model.User;
import kz.narxoz.narxozapp.repository.BookRepository;
import kz.narxoz.narxozapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("users")
    public List<User> getAll() {
        return userRepository.findAll();
    }
}
