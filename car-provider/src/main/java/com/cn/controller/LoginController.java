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
package com.cn.controller;

import com.cn.mapper.LoginMapper;
import com.cn.model.UserBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;

/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author 琪
 * @create 2019/5/16
 * @since 1.0.0
 */
@RestController
public class LoginController {

    @Autowired
    private LoginMapper loginMapper;

    @RequestMapping("queryUsername")
    public UserBean queryUsername(@RequestParam(value="username") String username){
        return loginMapper.queryUsername(username);
    }
    @RequestMapping("addRole")
    public HashSet<String> addRole(@RequestParam(value="userid") Integer userid){
        return loginMapper.addRole(userid);
    }
}
