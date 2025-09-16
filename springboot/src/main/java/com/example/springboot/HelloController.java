package com.example.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HelloController {

    @GetMapping("/")
    @ResponseBody
    public String root() {
        return "Welcome to Spring Boot!#";
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello World!!";
    }

    @GetMapping("/jump")
    @ResponseBody
    public String junp(){
        return "Jump to Spring Boot!";
    }
    

}