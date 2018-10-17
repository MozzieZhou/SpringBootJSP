package com.gem.springbootjsp.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloControl {


    @RequestMapping("/hello")
    public String hello(){

        return "hello";
    }

}
