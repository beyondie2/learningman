// src/main/java/com.demogroup.demoweb/Controller/HelloWorldController.java
package com.quiz.learningman.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/api/hello")
    public String test() {
        return "Hello, world!";
    }
}
