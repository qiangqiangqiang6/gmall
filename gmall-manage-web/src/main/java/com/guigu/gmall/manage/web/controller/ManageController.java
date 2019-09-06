package com.guigu.gmall.manage.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gugi.gmall.bean.*;
import com.guigu.gmall.service.ManageService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ManageController {
    @Reference
    ManageService manageService;

   @PostMapping("getCatalog1")
    public List<BaseCatalog1> getCatalog1(){
       List<BaseCatalog1> catalog1List = manageService.getCatalog1();
       return catalog1List;
   }

   @PostMapping("getCatalog2")
    public List<BaseCatalog2> getCatalog2( String catalog1Id){
       List<BaseCatalog2> catalog2List = manageService.getCatalog2(catalog1Id);
       return catalog2List;
   }

   @PostMapping("getCatalog3")
    public List<BaseCatalog3> getCatalog3(String catalog2Id){
        List<BaseCatalog3> catalog3List = manageService.getCatalog3(catalog2Id);
        return catalog3List;
   }

   @GetMapping("attrInfoList")
    public List<BaseAttrInfo> getBaseAttrInfoList(String catalog3Id){
       List<BaseAttrInfo> attrList = manageService.getAttrList(catalog3Id);
       return attrList;
   }
   @PostMapping("getAttrValueList")
    public List<BaseAttrValue> getAttrValueList(String attrId){
       BaseAttrInfo baseAttrInfo = manageService.getBaseAttrInfo(attrId);
       List<BaseAttrValue> attrValueList = baseAttrInfo.getAttrValueList();
       return attrValueList;
   }

   @PostMapping("saveAttrInfo")
    public String saveAttrInfo(@RequestBody BaseAttrInfo baseAttrInfo){
        manageService.saveAttrInfo(baseAttrInfo);
        return "success";
   }



}
