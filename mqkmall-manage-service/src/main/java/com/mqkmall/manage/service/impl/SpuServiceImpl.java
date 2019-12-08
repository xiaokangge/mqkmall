package com.mqkmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.mqkmall.manage.mapper.PmsProductImageMapper;
import com.mqkmall.manage.mapper.PmsProductInfoMapper;
import com.mqkmall.manage.mapper.PmsProductSaleAttrMapper;
import com.mqkmall.manage.mapper.PmsProductSaleAttrValueMapper;
import com.mqkmall.user.bean.PmsProductImage;
import com.mqkmall.user.bean.PmsProductInfo;
import com.mqkmall.user.bean.PmsProductSaleAttr;
import com.mqkmall.user.bean.PmsProductSaleAttrValue;
import com.mqkmall.user.service.SpuService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class SpuServiceImpl implements SpuService {
    @Autowired
    PmsProductInfoMapper pmsProductInfoMapper;
    @Autowired
    PmsProductImageMapper pmsProductImageMapper;

    @Autowired
    PmsProductSaleAttrMapper pmsProductSaleAttrMapper;

    @Autowired
    PmsProductSaleAttrValueMapper pmsProductSaleAttrValueMapper;

    @Override
    public List<PmsProductInfo> spuList(String catalog3Id) {

        return pmsProductInfoMapper.select(catalog3Id);
    }

    @Override
    public void saveSpuInfo(PmsProductInfo pmsProductInfo) {
        //保存商品信息
        pmsProductInfoMapper.insertSelective(pmsProductInfo);
        // 生成商品主键
        String productId = pmsProductInfo.getId();
        // 保存商品图片信息
        List<PmsProductImage> spuImageList = pmsProductInfo.getSpuImageList();
        for (PmsProductImage pmsProductImage : spuImageList) {
            pmsProductImage.setProductId(productId);
            pmsProductImageMapper.insertSelective(pmsProductImage);
            // 保存销售属性信息
            List<PmsProductSaleAttr> spuSaleAttrList = pmsProductInfo.getSpuSaleAttrList();
            for (PmsProductSaleAttr pmsProductSaleAttr : spuSaleAttrList) {
                pmsProductSaleAttr.setProductId(productId);
                pmsProductSaleAttrMapper.insertSelective(pmsProductSaleAttr);
                // 保存销售属性值
                List<PmsProductSaleAttrValue> spuSaleAttrValueList = pmsProductSaleAttr.getSpuSaleAttrValueList();
                for (PmsProductSaleAttrValue pmsProductSaleAttrValue : spuSaleAttrValueList) {
                    pmsProductSaleAttrValue.setProductId(productId);
                    pmsProductSaleAttrValueMapper.insertSelective(pmsProductSaleAttrValue);
                }
            }

        }
    }
}