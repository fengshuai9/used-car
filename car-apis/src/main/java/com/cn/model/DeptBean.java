/** 
 * <pre>项目名称:maven 
 * 文件名称:DeptBean.java 
 * 包名:com.jk.fs.model.dept 
 * 创建日期:2019年4月2日上午11:35:35 
 * Copyright (c) 2019, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.cn.model;

import java.io.Serializable;
import java.util.List;



import lombok.Data;

/** 
 * <pre>项目名称：maven    
 * 类名称：DeptBean    
 * 类描述：    
 * 创建人：封帅
 * 创建时间：2019年4月2日 上午11:35:35    
 * 修改人：封帅 1848123832@qq.om
 * 修改时间：2019年4月2日 上午11:35:35    
 * 修改备注：       
 * @version </pre>    
 */

@Data
public class DeptBean implements Serializable {

	
	private Integer id;

    private String text;

    private Integer pid;
    
    private List<DeptBean> children;
	
}
