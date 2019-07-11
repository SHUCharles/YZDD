package com.it.shu.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class UserLoginController {
    @RequestMapping(value="/")
    public String login(){
        return "index.html";
    }
}
