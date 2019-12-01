package com.mqkmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.mqkmall.manage.mapper.CatalogMapper;
import com.mqkmall.manage.mapper.PmsBaseCatalog1Mapper;
import com.mqkmall.manage.mapper.PmsBaseCatalog2Mapper;
import com.mqkmall.manage.mapper.PmsBaseCatalog3Mapper;
import com.mqkmall.user.bean.PmsBaseCatalog1;
import com.mqkmall.user.bean.PmsBaseCatalog2;
import com.mqkmall.user.bean.PmsBaseCatalog3;
import com.mqkmall.user.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class CataLogServiceImpl implements CatalogService {
//    @Autowired
//    CatalogMapper catalogMapper;
    @Autowired
    PmsBaseCatalog1Mapper pmsBaseCatalog1Mapper;

    @Autowired
    PmsBaseCatalog2Mapper pmsBaseCatalog2Mapper;

    @Autowired
    PmsBaseCatalog3Mapper pmsBaseCatalog3Mapper;
    @Override
    public List<PmsBaseCatalog1> getCatalog1() {
        return pmsBaseCatalog1Mapper.getCatalog1();
    }

    @Override
    public List<PmsBaseCatalog2> getCatalog2(String catalogId) {
        return pmsBaseCatalog2Mapper.getCatalog2(catalogId);
    }

    @Override
    public List<PmsBaseCatalog3> getCatalog3(String catalogId) {
        return pmsBaseCatalog3Mapper.getCatalog3(catalogId);
    }
}
