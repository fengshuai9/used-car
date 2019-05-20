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
package com.cn.config;

import com.cn.model.UserBean;
import com.cn.service.LoginService;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;

import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;

/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author 琪
 * @create 2019/5/10
 * @since 1.0.0
 */
public class UserRealm extends AuthorizingRealm {

    @Autowired
    private LoginService loginSerivce;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        System.out.println("执行授权逻辑");
        //new一个实现类对象 作为授权器
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        //new一个hashset  获取当前用户拥有角色的set集合
        UserBean user = (UserBean) SecurityUtils.getSubject().getPrincipal();
        Integer userid = user.getId();
        //将角色set集合赋给当前用户对象
        HashSet<String> roles = loginSerivce.addRole(userid);
        info.setRoles(roles);
        //返回实体对象
        return info;

    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("执行认证逻辑");

        UsernamePasswordToken token=(UsernamePasswordToken)authenticationToken;
        //
        String username = token.getUsername();
       UserBean user=loginSerivce.queryUsername(username);

       if(user==null){
               return null;
       }
        return new SimpleAuthenticationInfo(user,user.getPassword(),this.getClass().getName());
    }
}
