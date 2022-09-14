package com.example.firstjavaserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.logging.Logger;
import java.util.logging.Level;

@RestController
public class Controller {

    @GetMapping
    static String helloDevops(){
        //System.out.println("Hello Devops!");
        Logger logger = Logger.getLogger("mess::  ");
        logger.log(Level.INFO, "Message to log");
        return "Hello Devops!";
    }

    public static void main(String[] args) {
        helloDevops();
    }
}
