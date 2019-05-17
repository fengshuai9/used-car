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


import com.cn.mapper.TreeMappe;
import com.cn.model.TreeBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
public class TreeController {

    @Autowired
    private TreeMappe treeMapper;

    @GetMapping("/queryTree")
    public List<TreeBean> queryTree() {
        int pid=0;
        List<TreeBean> list = treeNodes(pid);
        return list;
    }


    private List<TreeBean> treeNodes(int pid) {
        List<TreeBean> list = treeMapper.queryTree(pid);
        for (TreeBean tree : list) {
            Integer id = tree.getId();
            List<TreeBean> nodes = treeNodes(id);
            if(nodes.size()<=0) {
                //无子节点
                tree.setSelectable(true);
            }else {
                tree.setSelectable(false);
                tree.setNodes(nodes);
            }
        }
        return list;
    }
}
