package com.example.demo.greeting;

import jdk.jfr.Frequency;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/greeting")
public class GreetingMessageController {
    @GetMapping("{id}")
    public String getMessage(@PathVariable(value = "id") String id) {
        System.out.println(id);
        return "Hello world! From Spring boot " + id;
    }
}
