package com.example.testapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/api/hello")
    public int getNumber(){
        return 200;
    }
}
