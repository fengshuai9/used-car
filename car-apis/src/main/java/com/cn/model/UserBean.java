/** 
 * <pre>项目名称:maven 
 * 文件名称:UserBean.java 
 * 包名:com.jk.fs.model.user 
 * 创建日期:2019年4月1日下午7:54:51 
 * Copyright (c) 2019, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.cn.model;

import lombok.Data;

import java.io.Serializable;

/** 
 * <pre>项目名称：maven    
 * 类名称：UserBean    
 * 类描述：    
 * 创建人：封帅
 * 创建时间：2019年4月1日 下午7:54:51    
 * 修改人：封帅 1848123832@qq.om
 * 修改时间：2019年4月1日 下午7:54:51    
 * 修改备注：       
 * @version </pre>
 */
@Data
public class UserBean implements Serializable {

	private Integer id;
	private String name;
	private String username;
	private String password;
	private Integer sex;
	private String birthday;
	
	private Integer deptId; //部门id
	private String deptName; //部门name
	
	private Integer status;//状态 1锁定 0正常
	private String detail;//简介
	private String email;
	private String handImg;
	
	private Integer province;//省id
	private String provinceName;//省name
	private Integer city;//城市id
	private String cityName;//城市name
	
	private String roleId;//角色id
	private String roleName;//角色name
	
	
	private String loginIp;
	
	
}
