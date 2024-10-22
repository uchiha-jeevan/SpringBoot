package com.UserRegisteration.Login.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;


import com.UserRegisteration.Login.Modell.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.UserRegisteration.Login.Service.UserService;
import java.util.List;

@Controller
public class Index {

    @Autowired
    private UserService userservice;


    @GetMapping("/")
    public String login(){
        return "index";
    }

    @PostMapping("/register")
    public User registerUser(@RequestBody User user){
        return UserService.registerUser(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return UserService.getAllUsers();
    }
    }





    public String register(@ModelAttribute User user, Model model){
        System.out.println(user.toString());
        model.addAttribute("name",user.getName());
        //model.getBodyText();
        return "home";
    }
}
