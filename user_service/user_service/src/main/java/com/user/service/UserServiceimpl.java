package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceimpl implements UserService {

    List<User> list = List.of(
            new User(1311L, "Ankit Khanna", "232323"),
            new User(1312L, "Ravi Bishnoi", "454545"),
            new User(1313L, "Ravindra Jadeja", "899898"));

    @Override
    public User getUser(Long id) {
        return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }

}
