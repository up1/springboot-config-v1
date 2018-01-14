package demo.controllers;

import demo.model.User;
import demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="v1/users")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping(value = "/")
    public List<User> getUsers() {
        return userService.getAllUser();
    }

    @GetMapping(value = "/{userId}")
    public User getUser(@PathVariable("userId") int userId) {
        return userService.getUserById(userId);
    }

}
