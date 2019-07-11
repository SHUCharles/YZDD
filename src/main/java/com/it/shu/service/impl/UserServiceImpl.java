package com.it.shu.service.impl;

import com.it.shu.entity.User;
import com.it.shu.mapper.UserMapper;
import com.it.shu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> queryUser() {
        List<User> users = userMapper.queryUser();
        return users;
    }
}
