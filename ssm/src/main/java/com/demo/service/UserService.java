package com.demo.service;

import com.demo.domain.User;

import java.util.List;

public interface UserService {
    public void save(User user);
    List<User> findAllUser();
}
