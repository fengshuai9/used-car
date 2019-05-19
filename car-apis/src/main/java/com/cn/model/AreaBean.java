/** 
 * <pre>项目名称:maven 
 * 文件名称:AreaBean.java 
 * 包名:com.jk.fs.model.area 
 * 创建日期:2019年4月2日下午1:46:54 
 * Copyright (c) 2019, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.cn.model;

import lombok.Data;

import java.io.Serializable;

/** 
 * <pre>项目名称：maven    
 * 类名称：AreaBean    
 * 类描述：    
 * 创建人：封帅
 * 创建时间：2019年4月2日 下午1:46:54    
 * 修改人：封帅 1848123832@qq.om
 * 修改时间：2019年4月2日 下午1:46:54    
 * 修改备注：       
 * @version </pre>    
 */
@Data
public class AreaBean implements Serializable {

	private Integer id;
	private String name;
	private Integer pid;
	
	
}
