package com.zzu.service;

import com.zzu.entity.address;

import java.util.List;

/**
 * Created by 62599 on 2017/06/05.
 */
public interface addressService {

    //查找所有用户
    public List<address> queryAllAddress();

    // 修改用户
    public void updateAddress(address address);

    // 删除用户
    public void deleteAddress(address address);

    // 添加用户
    public void insertAddress(address address);
}
