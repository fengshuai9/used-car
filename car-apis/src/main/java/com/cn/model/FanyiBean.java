/** 
 * <pre>项目名称:maven 
 * 文件名称:FanyiBean.java 
 * 包名:com.jk.fs.model.fanyi 
 * 创建日期:2019年4月17日下午8:15:30 
 * Copyright (c) 2019, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.cn.model;

import lombok.Data;

import java.io.Serializable;

/** 
 * <pre>项目名称：maven    
 * 类名称：FanyiBean    
 * 类描述：    
 * 创建人：封帅
 * 创建时间：2019年4月17日 下午8:15:30    
 * 修改人：封帅 1848123832@qq.om
 * 修改时间：2019年4月17日 下午8:15:30    
 * 修改备注：       
 * @version </pre>    
 */
@Data
public class FanyiBean implements Serializable {

	private String src;
	
	private String tgt;
}
