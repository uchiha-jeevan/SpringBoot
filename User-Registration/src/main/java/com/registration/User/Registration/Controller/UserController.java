package com.registration.User.Registration.Controller;

import org.springframework.ui.Model;
//import ch.qos.logback.core.model.Model;
import com.registration.User.Registration.model.User;
import com.registration.User.Registration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userservice;

    @GetMapping("/")
    public String register(Model model){
        model.addAttribute("user", new User());
        return "index";
    }

    @PostMapping("/register")
    public String registerUser(User user) {
        userservice.saveuser(user);
        return "home";
    }

}
