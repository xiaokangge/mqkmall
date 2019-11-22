package com.mqkmall.user.mapper;


import com.mqkmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

//import tk.mybatis.mapper.common.Mapper;

public interface UmsMemberReceiveAddressMapper  /*extends Mapper<UmsMemberReceiveAddress>*/ {
    //根据用户id查询用户的收货地址
    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
    //删除某条收货地址
    public void deleteReceiveAddressById(String id);
    //新增收货地址
    public void addReceiveAddressByMemberId(UmsMemberReceiveAddress umsMemberReceiveAddress);
//    修改用户收货地址
    public void updateUmsMemberReceiveAddressByMemberId(UmsMemberReceiveAddress umsMemberReceiveAddress);
}
