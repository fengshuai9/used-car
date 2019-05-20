package com.cn.mapper;

import com.cn.model.NewsBean;
import com.cn.model.UserzBean;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper {


    @Select("select * from ez_user order by createTime desc")
    List<UserzBean> queryUser();

    @Select("select * from t_news")
    List<NewsBean> queryNews();

    @Delete("<script>  " +
            "DELETE  " +
            "FROM " +
            "ez_user  " +
            "WHERE " +
            "id IN <foreach open='(' close=')' collection = 'array' item = 'ids' separator = ',' > #{ids} " +
            "</foreach>" +
            "</script>")
    void deleteGood(Integer[] ids);

    @Delete("<script>  " +
            "DELETE  " +
            "FROM " +
            "t_news  " +
            "WHERE " +
            "id IN <foreach open='(' close=')' collection = 'array' item = 'ids' separator = ',' > #{ids} " +
            "</foreach>" +
            "</script>")
    void deleteNews(Integer[] ids);

    @Insert("insert into ez_user(account,password,status) values(#{account},#{password},#{status})")
    void addUser(UserzBean goodsBean);

    @Select("select * from ez_user where id=#{id}")
    UserzBean queryUserById(Integer id);

    @Update("update ez_user set account=#{account},password=#{password},status=#{status} where id=#{id}")
    void upUser(UserzBean goodsBean);
    @Update("update ez_user set status=2 where id=#{id}")
    void jiesuo(Integer id);

    @Update("update ez_user set status=1 where id=#{id}")
    void suoding(Integer id);

}
