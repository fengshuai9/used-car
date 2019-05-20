/**
 * Copyright (C), 2019, 金科
 * FileName:
 * Author:   赵传明
 * Date:
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.cn.service;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 琪
 * @create 2019/5/17
 * @since 1.0.0
 */
@FeignClient(value = "car-provider")
public interface TreeService extends TreeServiceApi{

}
