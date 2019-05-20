package com.cn.service;

import com.cn.model.NewsBean;
import com.cn.model.UserzBean;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface UserServiceApi {

    @GetMapping("/queryUser")
    List<UserzBean> queryUser();

    @GetMapping("/queryNews")
    List<NewsBean> queryNews();

    @DeleteMapping("deleteGood/{ids}")
    void deleteGood(@RequestParam("ids")Integer[] ids);

    @DeleteMapping("deleteNews/{ids}")
    void deleteNews(@RequestParam("ids")Integer[] ids);

    @PostMapping("addUser")
    void addUser(UserzBean userzBean);

    @GetMapping("queryUserById/{id}")
    UserzBean queryUserById(@PathVariable("id") Integer id);

    @PostMapping("upUser")
    void upUser(@RequestBody UserzBean userzBean);

    @PostMapping("jiesuo/{id}")
    void jiesuo(@PathVariable("id") Integer id);

    @PostMapping("suoding/{id}")
    void suoding(@PathVariable("id") Integer id);
}
