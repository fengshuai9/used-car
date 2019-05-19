package com.cn.controller;

import com.cn.model.Comment;
import com.cn.model.ReportBean;
import com.cn.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("report")
public class ReportController {



    @Autowired
    private ReportService reportService;

    //报表统计
    @RequestMapping("findReports")
    @ResponseBody
    public List<ReportBean> findReports(){

        return reportService.findReports();
    }

    //评论管理，带条查
    @RequestMapping("findComments")
    @ResponseBody
    public Map<String,Object>findComments(Comment comment,Integer page,Integer rows){


        return  reportService.findComments(comment,page,rows);

    }
    //批量删除和删除
    @RequestMapping("delReport")
    @ResponseBody
    public void delReport(String[]ids) {

        reportService.delReport(ids);
    }
}
