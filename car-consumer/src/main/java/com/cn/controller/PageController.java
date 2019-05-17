package com.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class PageController {

    @RequestMapping("toceshi")
    public String  toceshi(){
        System.out.println("这是从ider中改的");
        return "ceshi";
    }



    @RequestMapping("toLogin")
    public String toLogin(){
        return "login";
    }


    @RequestMapping("toMain")
    public String toMain(){
        return "main";
    }
}