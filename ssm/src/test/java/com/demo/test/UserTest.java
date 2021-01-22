package com.demo.test;

import com.demo.domain.User;
import com.demo.mapper.UserMapper;
import com.demo.service.UserService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class UserTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;


    @Test
    public void testSave(){
        User user = new User();
        user.setUsername("zhangsan");
        user.setPassword("123");
        userService.save(user);
    }

    @Test
    public void testSelectAll(){
        List<User> allUser = userService.findAllUser();
        for (User user : allUser) {
            System.out.println(user);
        }
    }
}
