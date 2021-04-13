package com.relax.relax.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class Register {
    @ResponseBody
    @RequestMapping("/user")
    public String getUser(){
        return "Hello user";
    }

    @RequestMapping("/index")
    public String getIndex(){
        return "index";
    }
}
