package com.rocky.study.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

/**
 * Created by zhangpeng32 on 2017/12/19.
 */
@FeignClient(name= "service-hello")
public interface UserService {


    @RequestMapping(value = "/user/show")
    public String show(@RequestParam(value = "username") String username);
}
