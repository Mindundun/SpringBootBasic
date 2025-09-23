package com.example.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {

    @GetMapping("/")
    public String root() {
        return "redirect:/question/list";
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