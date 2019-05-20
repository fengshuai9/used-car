package com.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class PageController {

    @RequestMapping("toceshi")
    public String  toceshi(){
        return "ceshi";
    }

    @RequestMapping("tolist")
    public String  tolist(){
        return "list";
    }

    @RequestMapping("tonews")
    public String  tonews(){
        return "news";
    }

    @RequestMapping("toadd")
    public String  toadd(){
        return "addGood";
    }
}
