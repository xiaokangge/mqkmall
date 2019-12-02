package com.mqkmall.user.service;

import com.mqkmall.user.bean.PmsProductInfo;

import java.util.List;

public interface SpuService {
    List<PmsProductInfo> spuList(String catalog3Id);
}
