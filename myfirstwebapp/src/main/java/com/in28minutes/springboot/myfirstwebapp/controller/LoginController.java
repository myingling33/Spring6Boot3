package com.in28minutes.springboot.myfirstwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    // /login => com.in28minutes.springboot.myfirstwebapp.hello.LoginController => login.jsp
    @RequestMapping("login")
    public String goToLoginPage() {
        return "login";
    }
}
