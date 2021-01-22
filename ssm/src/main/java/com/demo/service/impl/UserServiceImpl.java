package com.demo.service.impl;

import com.demo.domain.User;
import com.demo.mapper.UserMapper;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
     private UserMapper userMapper;

    @Override
    public void save(User user) {
       userMapper.save(user);
    }

    @Override
    public List<User> findAllUser() {
        List<User> userList=userMapper.selectAll();
        return userList;
    }
}
