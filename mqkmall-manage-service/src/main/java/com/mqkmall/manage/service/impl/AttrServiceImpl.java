package com.mqkmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.mqkmall.manage.mapper.PmsBaseAttrInfoMapper;
import com.mqkmall.manage.mapper.PmsBaseAttrValueMapper;

import com.mqkmall.user.bean.PmsBaseAttrInfo;
import com.mqkmall.user.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class AttrServiceImpl implements AttrService {
    @Autowired
    PmsBaseAttrInfoMapper pmsBaseAttrInfoMapper;
    @Autowired
    PmsBaseAttrValueMapper pmsBaseAttrValueMapper;


    @Override
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id) {
        return pmsBaseAttrInfoMapper.attrInfoList(catalog3Id);
    }
}
