package com.mqkmall.manage.mapper;

import com.mqkmall.user.bean.PmsBaseAttrInfo;

import java.util.List;

public interface PmsBaseAttrInfoMapper {
    List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);

    void insertSelective(PmsBaseAttrInfo pmsBaseAttrInfo);

    void updateByExampleSelective(PmsBaseAttrInfo pmsBaseAttrInfo);
}
