package com.mqkmall.user.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.mqkmall.user.bean.UmsMemberReceiveAddress;
import com.mqkmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.mqkmall.user.service.UmsMemberReceiveAddressService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;

import java.util.List;

//import com.mqkmall.service.UmsMemberReceiveAddressService;

@Service
public class UmsMemberReceiveAddressServiceImpl implements UmsMemberReceiveAddressService {
    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;
    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        return umsMemberReceiveAddressMapper.getReceiveAddressByMemberId("1");
    }
}
