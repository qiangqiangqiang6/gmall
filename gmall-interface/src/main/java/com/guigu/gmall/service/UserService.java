package com.guigu.gmall.service;



import com.gugi.gmall.bean.UserInfo;

import java.util.List;

public interface UserService {
    List<UserInfo> getAllUserInfoList();

    void addUser(UserInfo userInfo);

    UserInfo getUserById(String id);

    void update(UserInfo userInfo);

    void updateByName(String name, UserInfo userInfo);

    void deletedUser(UserInfo userInfo);
}
