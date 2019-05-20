package com.cn.controller;
import com.cn.model.CarBean;
import com.cn.model.ColorBean;
import com.cn.model.LocationBean;
import com.cn.model.SizeBean;
import com.cn.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/car")
@RestController
public class CarController{
    @Autowired
    private CarService carService;
    //查询
    @GetMapping("/queryCarList")
    public List<CarBean> queryCarList(){
        List<CarBean> list= carService.queryCarList();
        return list;
    };
    //删除
    @DeleteMapping("/deleteCar")
    public void deleteCar(@RequestParam(value = "id") Integer id){
        carService.deleteCar(id);
    }
    //批删
    @RequestMapping("/delCars")
    public void delCars(String ids){
        System.out.println("123455消费者方接受的批删id号  码："+ids);
        String[] split = ids.split(",");
        Integer[] arr = new Integer[ids.length()];
        for (int i=0;i<split.length;i++) {
            arr[i]=Integer.parseInt(split[i]);
        }
        System.out.println(ids);
        carService.delCars(ids);
    }
    //回显
    @GetMapping("/queryCarById")

    public CarBean queryCarById(@RequestParam(value = "id")Integer id) {

        return carService.queryCarById(id);
    }
    //加载汽车颜色
    @GetMapping("/findColor")
    @ResponseBody
    public List<ColorBean> findColor() {
       List<ColorBean>  list = carService.findColor();
        return list;
    }
    //加载汽车级别
    @GetMapping("/findSize")
    @ResponseBody
    public List<SizeBean> findSize() {
        List<SizeBean>  list = carService.findSize();
        return list;
    }
    //加载汽车城市
    @GetMapping("/findLocation")
    @ResponseBody
    public List<LocationBean> findLocation() {
        List<LocationBean>  list = carService.findLocation();
        return list;
    }
    //新增（修改保存）汽车
    @PostMapping("insCar")
    public void insCar(CarBean carBean) {
        System.out.println(carBean.getBrand());
        carService.insCar(carBean);
    }


}
