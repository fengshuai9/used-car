package com.cn.service;



import com.cn.model.Comment;
import com.cn.model.ReportBean;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

public interface ResportServiceApi {

    //报表查询统计
    @RequestMapping("/queryReport")
    List<ReportBean> findReports();

    //查询评论
    @RequestMapping("/findComments")
    Map<String, Object> findComments(@RequestBody  Comment comment, @RequestParam(value="page") Integer page,@RequestParam(value="rows") Integer rows);

    //评论删除和批删
    @RequestMapping(value="/delReport")
    void delReport( @RequestParam(value="ids")String[] ids);
}
