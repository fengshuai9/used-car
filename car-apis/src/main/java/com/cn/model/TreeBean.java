/** 
 * <pre>项目名称:boostrap1 
 * 文件名称:TreeBean.java 
 * 包名:com.jk.fs.model.tree 
 * 创建日期:2019年4月15日下午6:39:12 
 * Copyright (c) 2019, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.cn.model;

import java.util.List;

import lombok.Data;

/** 
 * <pre>项目名称：boostrap1    
 * 类名称：TreeBean    
 * 类描述：    
 * 创建人：封帅
 * 创建时间：2019年4月15日 下午6:39:12    
 * 修改人：封帅 1848123832@qq.om
 * 修改时间：2019年4月15日 下午6:39:12    
 * 修改备注：       
 * @version </pre>    
 */
@Data
public class TreeBean {
	
	
	private Integer id;
	private String text;
	private String href;
	private Integer pid;
	private List<TreeBean> nodes;
	private Boolean selectable;
	
	

}
