package com.mqkmall.manage.mapper;

import com.mqkmall.user.bean.PmsBaseAttrValue;

import java.util.List;

public interface PmsBaseAttrValueMapper {
    void insertSelective(PmsBaseAttrValue pmsBaseAttrValue);

    void deleteByAttrId(String id);

    List<PmsBaseAttrValue> select(String attrId);
}
