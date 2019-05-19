package com.cn.service;

import com.cn.model.UserBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashSet;

public interface LoginServiceApi {

    @RequestMapping(value="queryUsername" ,method= RequestMethod.GET)
    UserBean queryUsername(@RequestParam(value="username") String username);

    @RequestMapping(value="addRole")
    HashSet<String> addRole(@RequestParam(value="userid")Integer userid);
}
