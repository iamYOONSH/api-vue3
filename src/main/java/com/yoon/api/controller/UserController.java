package com.yoon.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController
{

    @GetMapping("/list")
    @ResponseBody
    public String list()
    {

        return "유저리스트";
    }
}



