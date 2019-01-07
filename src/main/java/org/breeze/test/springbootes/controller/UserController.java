package org.breeze.test.springbootes.controller;

import org.breeze.test.springbootes.entity.User;
import org.breeze.test.springbootes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by wb on 2019/1/7.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/{id}")
    public User findOne(@PathVariable(name = "id") String id) {
        return userService.findOne(id);
    }

    @PostMapping(value = "/")
    public User addOne(User user) {
        return userService.addOne(user);
    }
}