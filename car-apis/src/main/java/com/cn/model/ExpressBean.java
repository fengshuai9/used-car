/** 
 * <pre>项目名称:maven 
 * 文件名称:Express.java 
 * 包名:com.jk.fs.model.express 
 * 创建日期:2019年4月11日下午10:12:52 
 * Copyright (c) 2019, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.cn.model;

import lombok.Data;

import java.io.Serializable;

/** 
 * <pre>项目名称：maven    
 * 类名称：Express    
 * 类描述：    
 * 创建人：封帅
 * 创建时间：2019年4月11日 下午10:12:52    
 * 修改人：封帅 1848123832@qq.om
 * 修改时间：2019年4月11日 下午10:12:52    
 * 修改备注：       
 * @version </pre>    
 */
@Data
public class ExpressBean implements Serializable {

	private String time;
	private String ftime;
	private String context;
	private String location;
	
	
}
