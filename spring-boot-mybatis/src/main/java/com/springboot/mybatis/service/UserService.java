package com.springboot.mybatis.service;


import com.springboot.mybatis.entity.User;

import java.util.List;

public interface UserService {
    default List<User> selectAll() {
        return null;
    }

    User getOne(long userId);

    void delete(long userId);

    void insert(User user);

    void update(User user);
}

