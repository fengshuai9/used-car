/** 
 * <pre>项目名称:maven 
 * 文件名称:RoleBean.java 
 * 包名:com.jk.fs.model.user 
 * 创建日期:2019年4月2日下午2:54:02 
 * Copyright (c) 2019, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.cn.model;

import lombok.Data;

import java.io.Serializable;

/** 
 * <pre>项目名称：maven    
 * 类名称：RoleBean    
 * 类描述：    
 * 创建人：封帅
 * 创建时间：2019年4月2日 下午2:54:02    
 * 修改人：封帅 1848123832@qq.om
 * 修改时间：2019年4月2日 下午2:54:02    
 * 修改备注：       
 * @version </pre>    
 */
@Data
public class RoleBean implements Serializable {

	
	private String id;
	private String name;
	private String beizhu;
	/* (non-Javadoc)    
	 * @see java.lang.Object#toString()    
	 */
	@Override
	public String toString() {
		return "RoleBean [id=" + id + ", name=" + name + ", beizhu=" + beizhu + "]";
	}
	
	
	
	
}
