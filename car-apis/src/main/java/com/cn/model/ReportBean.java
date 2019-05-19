package com.cn.model;
//报表
public class ReportBean {

    private  Integer id;

    private String  cTime;   //日期

    private Integer  registrations;  //注册量


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getcTime() {
        return cTime;
    }

    public void setcTime(String cTime) {
        this.cTime = cTime;
    }

    public Integer getRegistrations() {
        return registrations;
    }

    public void setRegistrations(Integer registrations) {
        this.registrations = registrations;
    }

    @Override
    public String toString() {
        return "ReportBean{" +
                "id=" + id +
                ", cTime='" + cTime + '\'' +
                ", registrations=" + registrations +
                '}';
    }
}
