package com.group46;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

    @GetMapping
    public List<User> getUsers() {
        return List.of(
                new User(
                        "1",
                        "John",
                        ""
                ),
                new User(
                        "2",
                        "Jane",
                        ""
                ),
                new User(
                        "3",
                        "Bob",
                        ""
                )
        );
    }
}
