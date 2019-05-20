package com.cn.controller;

import com.cn.mapper.ReportMapper;
import com.cn.model.Comment;
import com.cn.model.ReportBean;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.CriteriaDefinition;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller

public class ReportController {

    @Autowired
    private ReportMapper reportMapper;

    @Autowired
    private MongoTemplate mongoTemplate;





    //报表统计
    @RequestMapping(value="/queryReport",method= RequestMethod.GET)
    @ResponseBody
    public List<ReportBean> queryReport(){

        return reportMapper.queryReport();
    }
    //评论删除和批删
    @RequestMapping(value="delReport",method = RequestMethod.GET)
    @ResponseBody
    public void delReport(@RequestParam(value="ids")String[] ids){
        Query query = new Query();
        CriteriaDefinition in = Criteria.where("id").in(ids);
        query.addCriteria(in);
        mongoTemplate.remove(query, Comment.class);

    };
    //评论管理
    @RequestMapping(value="/findComments")
    @ResponseBody
    public  Map<String, Object> findComments(@RequestBody  Comment comment, @RequestParam(value="page") Integer page,@RequestParam(value="rows") Integer rows){


        HashMap<String, Object> result = new HashMap<>();
        Query query = new Query();
        //汽车条查
        if(comment.getCarId()!=null) {
            //精确查询
            CriteriaDefinition criteria=Criteria.where("carId").is(comment.getCarId());
            query.addCriteria(criteria);
        }
        //时间条查
        if(comment.getStartTime()!=null&&comment.getEndtTime()!=null) {

            Criteria lte = Criteria.where("cTime").gte(comment.getStartTime()).lte(comment.getEndtTime());
            query.addCriteria(lte);
        }else {
            if(comment.getStartTime()!=null) {
                Criteria gte = Criteria.where("cTime").gte(comment.getStartTime());
                query.addCriteria(gte);
            }
            if(comment.getEndtTime()!=null) {
                Criteria lte = Criteria.where("cTime").lte(comment.getEndtTime());
                query.addCriteria(lte);
            }

        }

        //查询Count
        int count = (int) mongoTemplate.count(query, Comment.class);
        result.put("total",count);
        //查询list
        //排序
        query.with(new Sort(Sort.Direction.DESC, "cTime"));
        //分页
        query.skip((page-1)*rows);
        query.limit(rows);

        List<Comment> find = mongoTemplate.find(query, Comment.class);
        result.put("rows",find);
        return result;
    }

}




