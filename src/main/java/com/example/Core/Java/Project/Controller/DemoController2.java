package com.example.Core.Java.Project.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController2 {

    @RequestMapping("/Welcome")
    public String welcome(){

        return "My name is shubendra Kumar";
    }
}
