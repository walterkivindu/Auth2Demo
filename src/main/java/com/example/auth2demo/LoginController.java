package com.example.auth2demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/success")
    public String success(Model model){
        return "success";
    }

    @GetMapping("/login")
    public String login(Model model){
        return "login";
    }
}
