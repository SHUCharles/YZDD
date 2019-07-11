package com.it.shu.service.impl;

import com.it.shu.entity.User;
import com.it.shu.mapper.CheckUserMapper;
import com.it.shu.service.CheckUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckUserServiceImpl implements CheckUserService {
    @Autowired
    private CheckUserMapper checkUserMapper;
    @Override
    public User checkUserLogin(User user) {
        User userVo = new User();
        List<User> users = checkUserMapper.checkUser(user);
        if (users.size()>0){
            userVo = users.get(0);
        }
        return userVo;
    }
}
