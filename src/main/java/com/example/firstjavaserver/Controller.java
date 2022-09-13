package com.example.firstjavaserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Controller {

    @GetMapping
    static String helloDevops(){
        System.out.println("Hello Devops!");
        return "Hello Devops!";
    }

    public static void main(String[] args) {
        helloDevops();
    }
}
