package com.user.controller;

import com.user.entity.Contact;
import com.user.entity.User;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user/{userId}")
    public User getUserById(@PathVariable Long userId) {
        var user = userService.getUser(userId);
        if (user != null) {
            var contactlist = restTemplate.getForObject("http://contact-service:9091/api/contact/" + user.getUserId(), List.class);
            user.setContact((ArrayList) contactlist);
        }
        return user;
    }
}
