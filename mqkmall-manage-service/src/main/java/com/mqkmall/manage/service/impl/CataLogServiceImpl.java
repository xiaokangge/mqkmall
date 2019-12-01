package com.mqkmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.mqkmall.manage.mapper.CatalogMapper;
import com.mqkmall.user.bean.PmsBaseCatalog1;
import com.mqkmall.user.bean.PmsBaseCatalog2;
import com.mqkmall.user.bean.PmsBaseCatalog3;
import com.mqkmall.user.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class CataLogServiceImpl implements CatalogService {
    @Autowired
    CatalogMapper catalogMapper;
    @Override
    public List<PmsBaseCatalog1> getCatalog1() {
        return catalogMapper.getCatalog1();
    }

    @Override
    public List<PmsBaseCatalog2> getCatalog2(String catalogId) {
        return catalogMapper.getCatalog2(catalogId);
    }

    @Override
    public List<PmsBaseCatalog3> getCatalog3(String catalogId) {
        return catalogMapper.getCatalog3(catalogId);
    }
}
