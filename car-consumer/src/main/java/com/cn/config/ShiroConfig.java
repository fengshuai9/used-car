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



import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;


/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author 琪
 * @create 2019/5/9
 * @since 1.0.0
 */

@Configuration
public class ShiroConfig {
    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(@Qualifier("defaultWebSecurityManager") DefaultWebSecurityManager defaultWebSecurityManager){

        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();

        shiroFilterFactoryBean.setSecurityManager(defaultWebSecurityManager);
        //setLoginUrl是shiro登录的方法  参数是登录方法的路径
        shiroFilterFactoryBean.setLoginUrl("/page/toLogin");
        shiroFilterFactoryBean.setUnauthorizedUrl("/page/to403");
        //定义一个专门存放拦截的map  用的是LinkedHashMap  因为 这个map是有顺序的map  能够记住存放数据的次序
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        //所有的登录拦截都set到这个map中去  anon 是游客登录,不被拦截  authc是被拦截的意思 需要认证登录
        map.put("/login/login","anon");//放过登录页面
        map.put("/statics/*","anon");
        map.put("/*/*","authc");//拦截所有页面

        map.put("/page/toadd","roles[user]");
        map.put("/page/toedit","roles[vip]");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(map);

        return shiroFilterFactoryBean;
    }

    @Bean(name="defaultWebSecurityManager")
    public DefaultWebSecurityManager securitutyManager(@Qualifier("userRealm") UserRealm userRealm){

        DefaultWebSecurityManager defaultWebSecurityManager=new DefaultWebSecurityManager();
        defaultWebSecurityManager.setRealm(userRealm);
        return defaultWebSecurityManager;
    }

    @Bean(name="userRealm")
    public UserRealm getUserRealm(){

        return  new UserRealm();
    }
}
