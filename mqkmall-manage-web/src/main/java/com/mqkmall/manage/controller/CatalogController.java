package com.mqkmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mqkmall.user.bean.PmsBaseCatalog1;
import com.mqkmall.user.bean.PmsBaseCatalog2;
import com.mqkmall.user.bean.PmsBaseCatalog3;
import com.mqkmall.user.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.List;

@RestController
@CrossOrigin
public class CatalogController implements Serializable {
    @Reference
    CatalogService catalogService;
@RequestMapping(value = "/catalog1",method = RequestMethod.GET)
    public List<PmsBaseCatalog1> getCatalog1()
{
        return catalogService.getCatalog1();
    }
    @RequestMapping(value = "/catalog2",method = RequestMethod.GET)
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id)
    {
        return catalogService.getCatalog2(catalog1Id);
    }
    @RequestMapping(value = "/catalog1",method = RequestMethod.GET)
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id)
    {
        return catalogService.getCatalog3(catalog2Id);
    }
}
