package com.rocky.study.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangpeng32 on 2017/12/19.
 */
@RestController
@RequestMapping(value = "/order")
public class OrderController {

        @RequestMapping(value = "/show")
        public String show(){
            return "this is my order service";
        }
}
