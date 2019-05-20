package com.cn.controller;
import com.cn.mapper.CarMapper;
import com.cn.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class CarController {
    @Autowired
    private CarMapper carMapper;

    @GetMapping("/queryCarList")
    public List<CarBean> queryCarList(){
        List<CarBean> list = carMapper.queryCarList();
        return list;
    }
    //删除   deleteCar
    @DeleteMapping("deleteCar")
    public void deleteCar(@RequestParam(value = "id") Integer id) {
        carMapper.deleteCar(id);
    }
    //批量删除
    @DeleteMapping ("/delCars")
    public void delCars(@RequestParam(value = "ids") String ids){
        System.out.println("服务提供者接收到的ids："+ids);
        carMapper.delCars(ids);
    }

    //回显
    @RequestMapping(value="queryCarById")
    public CarBean queryCarById(@RequestParam(value = "id")Integer id) {

        return carMapper.queryCarById(id);
    }
    //加载汽车颜色
    @GetMapping("/findColor")

    public List<ColorBean> findColor() {
        List<ColorBean>  list = carMapper.findColor();
        return list;
    }
    //加载汽车级别
    @GetMapping("/findSize")

    public List<SizeBean> findSize() {
        List<SizeBean>  list = carMapper.findSize();
        return list;
    }

    //加载汽车城市
    @GetMapping("/findLocation")

    public List<LocationBean> findLocation() {
        List<LocationBean>  list = carMapper.findLocation();
        return list;
    }
    //新增汽车
    @PostMapping("insCar")
    public void insCar(@RequestBody CarBean carBean) {
        if (carBean.getId() == null){
            carMapper.insCar(carBean);
        }else {
            carMapper.updateCar(carBean);
        }
    }


}
