package com.cn.model;

import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

//评论
@Document(collection="t_comment")
public class Comment {

    private String id;

    private Integer carId;   //汽车id

    private String content;  //评论内容

    private Date cTime;     //评论时间

    @Transient
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date startTime;

    @Transient
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date endtTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getcTime() {
        return cTime;
    }

    public void setcTime(Date cTime) {
        this.cTime = cTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndtTime() {
        return endtTime;
    }

    public void setEndtTime(Date endtTime) {
        this.endtTime = endtTime;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id='" + id + '\'' +
                ", carId=" + carId +
                ", content='" + content + '\'' +
                ", cTime=" + cTime +
                ", startTime=" + startTime +
                ", endtTime=" + endtTime +
                '}';
    }
}

