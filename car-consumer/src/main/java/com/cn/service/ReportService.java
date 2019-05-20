package com.cn.service;

import com.cn.model.Comment;
import com.cn.model.ReportBean;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;
import java.util.Map;

@FeignClient(value = "car-provider")
public interface ReportService extends ResportServiceApi{



}
