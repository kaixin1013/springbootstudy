package com.springboot.mybatis.service.impl;

import com.springboot.mybatis.entity.User;
import com.springboot.mybatis.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.jws.soap.SOAPBinding;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Resource
    private UserService userService;

    @Test
    public void selectAll() {
        List<User> userList = userService.selectAll();
        userList.forEach(user -> System.out.println(user));
    }

    @Test
    public void getOne() {
        User user = userService.getOne(1);
        System.out.println(user);
    }

    @Test
    public void delete() {
        userService.delete(10);
    }

    @Test
    public void insert() {
        User user = new User();
        user.setUserId(12L);
        user.setMobile("455115");
        user.setPassword("12345824");
        user.setUsername("李山");
        user.setAvatar("b8.jpg");
        userService.insert(user);
    }

    @Test
    public void update() {
        User user = userService.getOne(12L);
        user.setAvatar("1.jpg");
        userService.update(user);
    }
}