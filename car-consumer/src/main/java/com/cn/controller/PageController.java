package com.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("page")
public class PageController {

    //报表统计
    @RequestMapping("toReport")
    public String  toceshi(){
        System.out.println("李天雨");
        return "report";
    }
    //评论管理
    @RequestMapping("toComments")
    public String  toCmments(){

        return "comments";
    }

    //报表管理
    @RequestMapping("toReport")
    public String  toReport(){
        return "report";
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