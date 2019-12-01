package com.mqkmall.user.service;

import com.mqkmall.user.bean.PmsBaseAttrInfo;

import java.util.List;

public interface AttrService {

    List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);
}
