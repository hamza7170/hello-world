package com.example.helloworld.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String sayHello(@RequestParam(value = "name") String name) {
        return "test " + name + "!";
        //first change in branch1
        //Second change in branch 1
        //First change in branch2
        //First change in branch3
        //Second change in branch 3


    }
}
