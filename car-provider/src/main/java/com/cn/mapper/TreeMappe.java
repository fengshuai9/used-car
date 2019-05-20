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
package com.cn.mapper;

import com.cn.model.TreeBean;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 琪
 * @create 2019/5/17
 * @since 1.0.0
 */
@Component
public interface TreeMappe {


    @Select("select * from t_tree where pid=#{pid}")
    List<TreeBean> queryTree(@RequestParam(value="pid") int pid);
}
