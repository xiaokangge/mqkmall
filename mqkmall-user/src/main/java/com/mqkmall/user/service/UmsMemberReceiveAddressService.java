package com.mqkmall.user.service;


import com.mqkmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UmsMemberReceiveAddressService {
    //根据用户id查询收货地址
    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
    //删除某条收货地址
    //新增收货地址
//    修改用户收货地址

}
