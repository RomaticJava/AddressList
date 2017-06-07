package com.zzu.dao;

import com.zzu.entity.user;

/**
 * Created by 62599 on 2017/06/04.
 */
public interface userDAO {
    //验证用户名密码
    public user queryUserAndPassword(user user);
}
