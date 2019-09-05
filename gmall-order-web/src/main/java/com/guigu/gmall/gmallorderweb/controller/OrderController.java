package com.guigu.gmall.gmallorderweb.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gugi.gmall.bean.UserInfo;
import com.guigu.gmall.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Reference
    UserService userService;

    @GetMapping("tarde")
    public UserInfo tarde(@RequestParam ("userid") String userid) {
        UserInfo userInfo = userService.getUserById(userid);
        return userInfo;
    }



}
