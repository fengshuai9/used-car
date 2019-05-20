package com.cn.controller;


import com.cn.mapper.UserMapper;
import com.cn.model.NewsBean;
import com.cn.model.UserzBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/queryUser")
    public List<UserzBean> queryUser() {
        System.out.println("查1111ist");
        return userMapper.queryUser();
    }

    @GetMapping("/queryNews")
    public List<NewsBean> queryNews() {
        System.out.println("查1111ist");
        return  userMapper.queryNews();
    }

    //回显
    @GetMapping("queryGoodById/{id}")
    @ResponseBody
    public UserzBean queryGoodById(@PathVariable("id") Integer id) {
        return userMapper.queryUserById(id);
    }
    //xiugai
    @PostMapping("upUser")
    @ResponseBody
    public void upUser(@RequestBody UserzBean userzBean) {
        userMapper.upUser(userzBean);
    }
    //新增
    @PostMapping("addUser")
    @ResponseBody
    public void addUser(@RequestBody UserzBean userzBean) {
        userMapper.addUser(userzBean);
    }

    //删除
    @DeleteMapping("deleteGood/{id}")
    public void deleteGood(@RequestParam("ids") Integer[] ids) {
        userMapper.deleteGood(ids);
    }


    //删除
    @DeleteMapping("deleteNews/{id}")
    public void deleteNews(@RequestParam("ids") Integer[] ids) {
        userMapper.deleteNews(ids);
    }

    //解锁用户
    @RequestMapping("jiesuo/{id}")
    @ResponseBody
    public void jieSuoId(@PathVariable("id")Integer id) {
        userMapper.jiesuo(id);
    }

    //锁定用户
    @RequestMapping("suoding/{id}")
    @ResponseBody
    public void suoDingId(@PathVariable("id")Integer id) {
        userMapper.suoding(id);
    }

}
