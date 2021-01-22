package com.demo.mapper;

import com.demo.domain.User;

import java.util.List;

public interface UserMapper{
    public void save(User user);
    List<User> selectAll();
}
