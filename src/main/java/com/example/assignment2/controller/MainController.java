package com.example.assignment2.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @PostMapping("/")
    public String test(@RequestBody String s){
//        System.out.println(s);
        System.out.println(s);
        return "success";
    }

    @GetMapping("/")
    public String test(){
//        System.out.println(s);
        return "GET method";
    }


}
// add something