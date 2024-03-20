package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    //Fake Data
    List<User> userList = List.of(
            new User(1L, "Name", "11111"),
            new User(2L, "Neel", "22222"),
            new User(3L, "Black", "33333")
    );

    @Override
    public User getUser(Long id) {
        return userList.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }


}
