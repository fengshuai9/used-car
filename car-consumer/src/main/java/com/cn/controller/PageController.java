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
    //跳转汽车列表展示页面
    @RequestMapping("tocarlist")
    public String  tocarlist(){
        return "carlist";
    }

    //跳转汽车新增页面
    @RequestMapping("toAddCars")
    public String  toAddCars(){
        return "addcar";
    }

//跳转汽车新增页面
    @RequestMapping("toEditCar")
    public String  toEditCar(){
        return "editcar";
    }

}
