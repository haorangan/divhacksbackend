package com.divhacks.divhacksbackend.controller;
/*
import com.divhacks.divhacksbackend.models.User;
import com.divhacks.divhacksbackend.repository.UserRepo;
import com.divhacks.divhacksbackend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/user")
public class UserController {
    private UserService userService;
    UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/post")
    public User createUser(@RequestBody User user) {
        return userService.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        User existingUser = userService.login(user.getUsername(), user.getPassword());
        if (existingUser != null) {
            return existingUser.getUsername();
        }
        return null;
    }


}


 */