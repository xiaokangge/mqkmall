package com.mqkmall.manage.controller;

import com.mqkmall.user.bean.PmsBaseCatalog1;
import com.mqkmall.user.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.List;

@RestController
public class CatalogController implements Serializable {
    @Autowired
    CatalogService catalogService;
@RequestMapping(value = "/catalog1",method = RequestMethod.GET)
    public List<PmsBaseCatalog1> getCatalog1(){
        return null;
    }
}
