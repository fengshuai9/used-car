package com.cn.controller;


import com.cn.model.NewsBean;
import com.cn.model.UserzBean;
import com.cn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    private UserService userService;



    @GetMapping("/queryUser")
    public List<UserzBean> queryUser(){
        System.out.println("查找userList");
        List<UserzBean> list= userService.queryUser();
        return list;
    };

    @GetMapping("/queryNews")
    public List<NewsBean> queryNews(){
        System.out.println("查找userList");
        List<NewsBean> list= userService.queryNews();
        return list;
    };
    //回显
    @GetMapping("queryGoodById")
    @ResponseBody
    public UserzBean queryGoodById(Integer id) {
        return userService.queryUserById(id);
    }
    //修改
    @PostMapping("upUser")
    @ResponseBody
    public void upUser(UserzBean userzBean) {
        userService.upUser(userzBean);
    }

    //新增
    @PostMapping("addUser")
    @ResponseBody
    public void addUser(UserzBean userzBean) {
        userService.addUser(userzBean);
    }

    //删除
    @RequestMapping("deleteNews")
    @ResponseBody
    public void deleteNews(@RequestParam("ids")  Integer[] ids){
        userService.deleteNews(ids);
    }

    //删除
    @RequestMapping("deleteGood")
    @ResponseBody
    public void deleteGood(@RequestParam("ids")  Integer[] ids){
        userService.deleteGood(ids);
    }

    //解锁用户
    @RequestMapping("jieSuo")
    public void jieSuo(Integer id) {
        userService.jiesuo(id);
    }

    //锁定用户
    @RequestMapping("suoDing")
    public void suoDingId(Integer id) {
        userService.suoding(id);
    }

}
