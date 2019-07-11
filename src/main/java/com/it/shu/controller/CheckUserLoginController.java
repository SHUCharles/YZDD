package com.it.shu.controller;

import com.it.shu.entity.User;
import com.it.shu.service.CheckUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckUserLoginController {
    @Autowired
    private CheckUserService checkUserService;
    @RequestMapping(value = "/submit/", method = RequestMethod.POST)
    public User submit(@RequestBody User user){
        User userVO = checkUserService.checkUserLogin(user);
        return new User();
    }
}
