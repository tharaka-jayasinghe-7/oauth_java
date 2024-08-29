package com.tharaka.oauth;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class MainController {

    @RequestMapping("/")
    public String home(){
        return "Welcome to Home Page";
    }

    @RequestMapping("/user")
    public Principal user(Principal user){
        return user;
    }
}
