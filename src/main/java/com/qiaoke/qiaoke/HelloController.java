package com.qiaoke.qiaoke;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello Jenkins! Your Spring Boot App is running successfully!";
    }
}