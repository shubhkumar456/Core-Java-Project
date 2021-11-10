package com.example.Core.Java.Project.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalController {

    @RequestMapping("/Addition")
    public int add(){
        int var = 12 + 12;
        return var;
    }

    @RequestMapping("/Substraction")
    public int subs(){
        int val = 100-25;
        return val;

    }

    @RequestMapping("/Multiplication")
    public int multiply(){
        int ans = 12*12;
        return ans;
    }

    @RequestMapping("/Division")
    public int div(){
        int result = 1000/10;
        return result;
    }
}
