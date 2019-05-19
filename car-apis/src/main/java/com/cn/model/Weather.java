/** 
 * <pre>项目名称:maven 
 * 文件名称:Weather.java 
 * 包名:com.jk.fs.model.weather 
 * 创建日期:2019年4月12日下午1:28:36 
 * Copyright (c) 2019, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.cn.model;

import lombok.Data;

import java.io.Serializable;

/** 
 * <pre>项目名称：maven    
 * 类名称：Weather    
 * 类描述：    
 * 创建人：封帅
 * 创建时间：2019年4月12日 下午1:28:36    
 * 修改人：封帅 1848123832@qq.om
 * 修改时间：2019年4月12日 下午1:28:36    
 * 修改备注：       
 * @version </pre>    
 */
@Data
public class Weather implements Serializable {
	
	private String ymd;//日期
	private String week; //星期xx
	private String type; //天气type xx
	private String high; //高气温xx
	private String low; //最低气温xx
	private String fx; //风向xx,
	private String fl; //风力xx
	
	private String sunset;//日落
	private String sunrise;//日出
	private String parent;
	private String city;
	private String notice;
	
	
	
	
	
	

}
