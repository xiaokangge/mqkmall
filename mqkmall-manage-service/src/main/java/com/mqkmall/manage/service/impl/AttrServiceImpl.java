package com.mqkmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.mqkmall.manage.mapper.PmsBaseAttrInfoMapper;
import com.mqkmall.manage.mapper.PmsBaseAttrValueMapper;

import com.mqkmall.manage.mapper.PmsBaseSaleAttrMapper;
import com.mqkmall.user.bean.PmsBaseAttrInfo;
import com.mqkmall.user.bean.PmsBaseAttrValue;
import com.mqkmall.user.bean.PmsBaseSaleAttr;
import com.mqkmall.user.service.AttrService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class AttrServiceImpl implements AttrService {
    @Autowired
    PmsBaseAttrInfoMapper pmsBaseAttrInfoMapper;
    @Autowired
    PmsBaseAttrValueMapper pmsBaseAttrValueMapper;
    @Autowired
    PmsBaseSaleAttrMapper pmsBaseSaleAttrMapper;


    @Override
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id) {
        return pmsBaseAttrInfoMapper.attrInfoList(catalog3Id);
    }

    @Override
    public String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo) {
        String id = pmsBaseAttrInfo.getId();
        if(StringUtils.isEmpty(id)){
            pmsBaseAttrInfoMapper.insertSelective(pmsBaseAttrInfo);
            for (PmsBaseAttrValue pmsBaseAttrValue: pmsBaseAttrInfo.getAttrValueList()
            ) {
                pmsBaseAttrValue.setAttrId(pmsBaseAttrInfo.getId());
                pmsBaseAttrValueMapper.insertSelective(pmsBaseAttrValue);
            }
        }else{
            pmsBaseAttrInfoMapper.updateByExampleSelective(pmsBaseAttrInfo);
            pmsBaseAttrValueMapper.deleteByAttrId(pmsBaseAttrInfo.getId());
            for (PmsBaseAttrValue pmsBaseAttrValue: pmsBaseAttrInfo.getAttrValueList()) {
                pmsBaseAttrValueMapper.insertSelective(pmsBaseAttrValue);
            }
        }

        return "success";
    }

    @Override
    public List<PmsBaseAttrValue> getAttrValueList(String attrId) {
        return pmsBaseAttrValueMapper.select(attrId);
    }

    @Override
    public List<PmsBaseSaleAttr> baseSaleAttrList() {
        return pmsBaseSaleAttrMapper.selectAll();
    }
}
