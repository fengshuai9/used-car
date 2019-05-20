package com.cn.mapper;

import com.cn.model.Comment;
import com.cn.model.ReportBean;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public interface ReportMapper {

    @Select("select  date_format(t1.createTime,'%m-%d') as  cTime ,count(*) as registrations from   " +
            "          (select *  from  ez_user   where createTime>=  date_add(now(), interval -7 day) and  createTime<=NOW())t1  " +
            "               GROUP BY date_format(t1.createTime,'%Y-%m-%d')")
    List<ReportBean> queryReport();


}
