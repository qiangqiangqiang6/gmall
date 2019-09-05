package com.guigu.gmall.gmallusermanage.controller;


import com.gugi.gmall.bean.UserInfo;
import com.guigu.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("allUser")
    public List<UserInfo> getAllUser(){
        return userService.getAllUserInfoList();
    }

    @PostMapping("addUser")
    public String  addUser(UserInfo userInfo){
        userService.addUser(userInfo);
        return "success";
    }

    @GetMapping("getUserById")
    public UserInfo getUserById(String id){
        return userService.getUserById(id);

    }

    @PutMapping("update")
    public String update(UserInfo userInfo){
        userService.update(userInfo);
        return "success";

    }

    @PostMapping("updateByName")
    public String updateByName(UserInfo userInfo){
        userService.updateByName(userInfo.getName(),userInfo);
        return "success";
    }

    @DeleteMapping("deletedUser")
    public String deletedUser(UserInfo userInfo){
        userService.deletedUser(userInfo);
        return "success";
    }
}