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

import com.cn.model.TreeBean;
import com.cn.service.LoginService;
import com.cn.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.reflect.generics.tree.Tree;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author 琪
 * @create 2019/5/17
 * @since 1.0.0
 */
@RestController
@RequestMapping("tree")
public class TreeController {

    @Autowired
    private TreeService treeService;

    @RequestMapping("queryTree")
    public List<TreeBean> queryTree(){
        return treeService.queryTree();
    }
}
