package com.guigu.gmall.service;

import com.gugi.gmall.bean.BaseAttrInfo;
import com.gugi.gmall.bean.BaseCatalog1;
import com.gugi.gmall.bean.BaseCatalog2;
import com.gugi.gmall.bean.BaseCatalog3;

import java.util.List;

public interface ManageService{
    //查询一级分类
    public List<BaseCatalog1> getCatalog1();
    //查询二级分类
    public List<BaseCatalog2> getCatalog2(String catalog1Id);
    //查询三级分类
    public  List<BaseCatalog3> getCatalog3(String catalog2Id);

    //根据三级分类查询平台属性
    public List<BaseAttrInfo> getAttrList(String catalog3Id);

    //根据平台属性查看平台属性值，顺便把该属性的属性值列表也取到
    public  BaseAttrInfo getBaseAttrInfo(String attrId);

    //保存平台属性
    public void saveAttrInfo(BaseAttrInfo baseAttrInfo);

    //删除平台属性






}

