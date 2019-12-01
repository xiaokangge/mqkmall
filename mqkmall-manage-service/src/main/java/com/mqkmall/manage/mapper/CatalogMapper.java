package com.mqkmall.manage.mapper;

import com.mqkmall.user.bean.PmsBaseCatalog1;
import com.mqkmall.user.bean.PmsBaseCatalog2;
import com.mqkmall.user.bean.PmsBaseCatalog3;

import java.util.List;

public interface CatalogMapper {
    List<PmsBaseCatalog1> getCatalog1();

    List<PmsBaseCatalog2> getCatalog2(String catalog1Id);

    List<PmsBaseCatalog3> getCatalog3(String catalog2Id);
}
