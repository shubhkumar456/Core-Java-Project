package com.example.Core.Java.Project.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

 @RequestMapping("/message")
     public void hello(){

        System.out.println("Hello welcome to the future");
    }
}
