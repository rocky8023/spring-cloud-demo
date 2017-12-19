package com.rocky.study.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangpeng32 on 2017/12/19.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @RequestMapping(value = "/show")
    public String show(@RequestParam String username){
        return "hello " +username + " ，this is my user service";
    }
}
