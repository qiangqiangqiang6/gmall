package com.guigu.gmall.gmallusermanage.service;

import com.guigu.gmall.gmallusermanage.bean.UserInfo;

import java.util.List;

public interface UserService {
    List<UserInfo> getAllUserInfoList();

    void addUser(UserInfo userInfo);

    UserInfo getUserById(String id);

    void update(UserInfo userInfo);

    void updateByName(String name, UserInfo userInfo);

    void deletedUser(UserInfo userInfo);
}
