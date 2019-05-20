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

import com.cn.model.UserBean;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashSet;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 琪
 * @create 2019/5/16
 * @since 1.0.0
 */

@Component
public interface LoginMapper {


    @Select("select id,username,password from t_user where username=#{username}")
    UserBean queryUsername(@RequestParam(value="username") String username);

    @Select(" select tr.name from  t_user_role tur left join t_role tr on tur.role_id = tr.id  where tur.user_id = #{userid}")
    HashSet<String> addRole(@RequestParam(value="userid")Integer userid);
}
