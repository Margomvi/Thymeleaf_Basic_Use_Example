package com.example.Thymeleaf_Basic_Example.controller;

import com.example.Thymeleaf_Basic_Example.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {

    @GetMapping("/users")
    public String home(Model model) {
        List<User> userList = List.of(
                new User("Daniel Esquivias","daniel.esquivias@testmail.com"),
                new User("Antonio Díaz","antonio.diaz@testmail.com"),
                new User("Jorge Suárez","jorge.suarez@testmail.com")
                );

        model.addAttribute("users",userList);
        return "users";
    }
}
