package com.example.demo.controller;

import com.example.demo.bean.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String login() {
        return "login";
    }
//
//    @RequestMapping("/doLogin")
//    public String doLogin(User user, HttpSession httpSession, Model model) {
//        User userResult = userService.selectUsersByUser(user);
//        return
//    }

    @RequestMapping("/register")
    public String register() {
        return "register";
    }

    @RequestMapping("/doResgister")
    public String doRegister(User user) {
        User userResult = userService.selectByUser(user);
        if (userResult != null) {
            return "register";
        } else {
            return "redirect:/user/login";
        }
    }
}
