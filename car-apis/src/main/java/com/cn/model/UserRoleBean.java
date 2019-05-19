/** 
 * <pre>项目名称:maven 
 * 文件名称:UserRoleBean.java 
 * 包名:com.jk.fs.model.user 
 * 创建日期:2019年4月2日下午2:56:24 
 * Copyright (c) 2019, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.cn.model;

import lombok.Data;

import java.io.Serializable;

/** 
 * <pre>项目名称：maven    
 * 类名称：UserRoleBean    
 * 类描述：    
 * 创建人：封帅
 * 创建时间：2019年4月2日 下午2:56:24    
 * 修改人：封帅 1848123832@qq.om
 * 修改时间：2019年4月2日 下午2:56:24    
 * 修改备注：       
 * @version </pre>    
 */
@Data
public class UserRoleBean implements Serializable {

	private String id;
	private Integer userId;
	private String roleId;
	
	
	
	
}
