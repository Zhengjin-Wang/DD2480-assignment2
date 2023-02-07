package com.example.assignment2.controller;

import com.example.assignment2.utils.CloneRepository;
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
//        CloneRepository.cloneRepository("https://github.com/ppplbngth/CI-server.git", "./repo");
        CloneRepository.cloneRepository("https://github.com/ppplbngth/CI-server", "D:/REPO");
        return "GET method";
    }


}
// add something 2