package com.cn.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "car-provider")
public interface UserService extends UserServiceApi{
}
