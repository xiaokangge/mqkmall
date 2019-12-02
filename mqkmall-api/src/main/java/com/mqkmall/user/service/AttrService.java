package com.mqkmall.user.service;

import com.mqkmall.user.bean.PmsBaseAttrInfo;
import com.mqkmall.user.bean.PmsBaseAttrValue;
import com.mqkmall.user.bean.PmsBaseSaleAttr;

import java.util.List;

public interface AttrService {

    List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);

    public String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);

    public List<PmsBaseAttrValue> getAttrValueList(String attrId);

    public List<PmsBaseSaleAttr> baseSaleAttrList();
}
