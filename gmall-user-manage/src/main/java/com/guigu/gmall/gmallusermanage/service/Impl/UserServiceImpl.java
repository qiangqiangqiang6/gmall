package com.guigu.gmall.gmallusermanage.service.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.guigu.gmall.gmallusermanage.bean.UserInfo;
import com.guigu.gmall.gmallusermanage.mapper.UserInfoMapper;
import com.guigu.gmall.gmallusermanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import tk.mybatis.mapper.entity.Example;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> getAllUserInfoList() {
        List<UserInfo> userInfos = userInfoMapper.selectAll();
        return userInfos;
    }

    @Override
    public void addUser(UserInfo userInfo) {
        userInfoMapper.insertSelective(userInfo);

    }

    @Override
    public UserInfo getUserById(String id) {
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(id);
        return userInfo;

    }

    @Override
    public void update(UserInfo userInfo) {
        userInfoMapper.updateByPrimaryKey(userInfo);

    }

    @Override
    public void updateByName(String name, UserInfo userInfo) {
        Example example = new Example(UserInfo.class);
        example.createCriteria().andEqualTo("name",name);
        userInfoMapper.updateByExampleSelective(userInfo,example);
    }

    @Override
    public void deletedUser(UserInfo userInfo) {
        userInfoMapper.deleteByPrimaryKey(userInfo.getId());
    }


}
