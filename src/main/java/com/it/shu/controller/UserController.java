package com.it.shu.controller;

import com.it.shu.entity.User;
import com.it.shu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/list")
    public ModelAndView userInfo(Map<String,Object> map){
        List<User> users = userService.queryUser();
        map.put("users",users);
        return new ModelAndView("user/list",map);

    }
}
