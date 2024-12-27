package controller;

import data.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.UserService;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping(path = "/users/login")
    public User createUsers(@RequestBody User user)
    {
        return userService.createUser(user);
    }
    @GetMapping(path = "/users")
    public List<User> findAllUsers()
    {
        return userService.getUser();
    }
    @GetMapping(path = "/users/{userId}")
    public User findUserById(@PathVariable int userId)
    {
        return userService.getUserById(userId);
    }


}
