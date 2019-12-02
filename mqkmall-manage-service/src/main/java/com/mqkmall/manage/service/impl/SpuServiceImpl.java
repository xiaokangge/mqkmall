package com.mqkmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.mqkmall.manage.mapper.PmsProductInfoMapper;
import com.mqkmall.user.bean.PmsProductInfo;
import com.mqkmall.user.service.SpuService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class SpuServiceImpl implements SpuService {
    @Autowired
    PmsProductInfoMapper pmsProductInfoMapper;
    @Override
    public List<PmsProductInfo> spuList(String catalog3Id) {
        return pmsProductInfoMapper.select(catalog3Id);
    }
}
