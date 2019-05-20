package com.cn.service;

import com.cn.model.CarBean;
import com.cn.model.ColorBean;
import com.cn.model.LocationBean;
import com.cn.model.SizeBean;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface CarServiceApi {
    //查询
    @GetMapping("/queryCarList")
    List<CarBean> queryCarList();
    //单删
    @DeleteMapping("/deleteCar")
    void deleteCar(@RequestParam(value = "id") Integer id);
    //回显
    @RequestMapping(value="queryCarById")
    CarBean queryCarById(@RequestParam(value = "id") Integer id);
    //加载颜色
    @GetMapping("/findColor")
    List<ColorBean> findColor();
    //保存（新增和修改）
    @PostMapping("/insCar")
    void insCar(@RequestBody CarBean carBean);
    //加载汽车级别
    @GetMapping("/findSize")
    List<SizeBean> findSize();
    //加载汽车级别
    @GetMapping("/findLocation")
    List<LocationBean> findLocation();
    //批删
    @DeleteMapping("/delCars")
    void delCars(@RequestParam(value = "ids") String ids);
}
