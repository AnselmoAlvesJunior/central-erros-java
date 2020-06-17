package com.codenation.endpoints;

import com.codenation.entity.User;
import com.codenation.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable("id") Long userId) {
        return userService.findById(userId);
    }

    @GetMapping("/{email}")
    public Optional<User> findByEmail(@PathVariable("email") String email) {
        return userService.findByEmail(email);
    }

}
