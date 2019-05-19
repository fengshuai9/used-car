package com.cn.service;

import com.cn.model.TreeBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public interface TreeServiceApi {

    @RequestMapping(value="queryTree" ,method= RequestMethod.GET)
    List<TreeBean> queryTree();
}
