package com.cn.mapper;

import com.cn.model.CarBean;
import com.cn.model.ColorBean;
import com.cn.model.LocationBean;
import com.cn.model.SizeBean;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Component
public interface CarMapper {
//查询
    @Select("select tc.id,brand,price,sizeName,displacement,mileage,modeName,colorName,phone,locationName,image,ztime,statusName,tcaseName from t_car tc  " +
            "  left JOIN t_color tco  on tc.color = tco.id  " +
            "  left JOIN t_status tst  on tc.status = tst.id " +
            "  left JOIN t_location tlo  on tc.location = tlo.id  " +
            "  left JOIN t_mode tmo  on tc.mode = tmo.id  " +
            "  left JOIN t_tcase ttc  on  tc.tcase = ttc.id  " +
            "  left JOIN t_size tsi  on tc.size = tsi.id  where  status = 3 ")
    List<CarBean> queryCarList();
//单删
    @Delete("delete from t_car where id =#{value}")
    void deleteCar(Integer id);
   //回显
  @Select("select * from  t_car where id=#{value} ")
    CarBean queryCarById(Integer id);
//加载汽车颜色
    @Select("select * from t_color ")
    List<ColorBean> findColor();

//新增
    @Insert("insert into t_car(brand,price,size,displacement,mileage,mode,color,phone,location,image,ztime,btime,status,tcase) " +
            " values(#{brand},#{price},#{size},#{displacement},#{mileage},#{mode},#{color},#{phone},#{location},#{image}," +
            " #{ztime},#{btime},3,#{tcase})")
    void insCar(CarBean carBean);
 //修改
    @Update(" update t_car set brand=#{brand},price=#{price},size=#{size},displacement=#{displacement}," +
            "mileage =#{mileage},mode=#{mode},color=#{color},phone=#{phone},location=#{location},image=#{image}," +
            " ztime=now,btime=#{btime},status=3,tcase=#{tcase} where id=#{id}")
    void updateCar(CarBean carBean);
    //加载汽车级别
    @Select("select * from t_size")
    List<SizeBean> findSize();
    //加载汽车城市
    @Select("select * from t_location")
    List<LocationBean> findLocation();
    //批量删除
    @Delete("delete from t_car where id in(${ids})")
    void delCars(@Param("ids") String ids);
}
