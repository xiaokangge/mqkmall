package com.mqkmall.user.controller;

import com.mqkmall.user.bean.UmsMember;
import com.mqkmall.user.bean.UmsMemberReceiveAddress;
import com.mqkmall.user.service.UmsMemberReceiveAddressService;
import com.mqkmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

        @Autowired
        UmsMemberReceiveAddressService umsMemberReceiveAddressService;
    @RequestMapping(value ="getReceiveAddressByMemberId/{memberId}",method = RequestMethod.GET)
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(@PathVariable String memberId) {
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressService.getReceiveAddressByMemberId(memberId);
        return umsMemberReceiveAddresses;
    }
    @RequestMapping("selectAllUser")
    public List<UmsMember> selectAllUser() {
        List<UmsMember> umsMembers = userService.selectAllUser();
        return umsMembers;
    }

    @RequestMapping("index")
    public String index() {
        return "hello user";
    }
}
