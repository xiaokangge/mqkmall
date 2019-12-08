package com.mqkmall.manage.mapper;

import com.mqkmall.user.bean.PmsProductInfo;

import java.util.List;

public interface PmsProductInfoMapper {
    List<PmsProductInfo> select(String catalog3Id);

    void insertSelective(PmsProductInfo pmsProductInfo);
}
