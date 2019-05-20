package com.cn.model;

import lombok.Data;

@Data
public class CarBean {
    //用户名id
    private Integer id;
    //品牌
    private String brand;
    //价格
    private double price;
    //车辆级别大小
    private Integer size;
    private String sizeName;
    //排量
    private double displacement;
    //里程
    private  double mileage;
    //驱动方式
    private Integer mode;
    private String modeName;
    //变速箱
    private Integer tcase;
    private String tcaseName;
    //颜色
    private Integer color;
    private String colorName;
    //联系电话
    private String phone;
    //所在地
    private Integer location;
    private String locationName;
    //图片
    private String image;
    //新增（审核通过）日期
    private String ztime;
    //状态
    private Integer status;   //3审核已通过  1未审核
    private String statusName;
    //新车时间或者 叫做上牌时间）
    private String btime;
    //汽车简介
    private String cinfo;



}
