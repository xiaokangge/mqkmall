package com.mqkmall.user.mapper;


import com.mqkmall.user.bean.UmsMember;

import java.util.List;

//import tk.mybatis.mapper.common.Mapper;


public interface UserMapper /*extends Mapper<UmsMember>*/ {
    //查询所有用户
    List<UmsMember> selectAllUser();
//    删除用户，注销用户
    public void deleteUserMember(String id);
//    修改用户信息
    public void updateUserMember(UmsMember umsMember);
//    新增用户信息
    public void addUserMember(UmsMember umsMember);
}


