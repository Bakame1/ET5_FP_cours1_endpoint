package controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @getMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}
