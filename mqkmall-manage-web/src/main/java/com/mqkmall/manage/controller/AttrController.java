package com.mqkmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mqkmall.user.bean.PmsBaseAttrInfo;
import com.mqkmall.user.service.AttrService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class AttrController {
    @Reference
    AttrService attrService;
    @RequestMapping("attrInfoList")
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id){
        return attrService.attrInfoList(catalog3Id);
    }
    @RequestMapping("saveAttrInfo")
    public String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo) {
        return "success";
    }
}
