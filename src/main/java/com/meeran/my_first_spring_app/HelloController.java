package com.meeran.my_first_spring_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Marks this class as a request handler (a REST controller)
public class HelloController {

    @GetMapping("/hello") // Maps HTTP GET requests to /hello to this method
    public String sayHello() {
        return "Hello, Spring Boot World! 🌍 test";
    }
}