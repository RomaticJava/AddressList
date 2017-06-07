package com.zzu.service;

import com.zzu.dao.userDAO;
import com.zzu.dao.userDAOImpl;
import com.zzu.entity.user;

/**
 * Created by 62599 on 2017/06/04.
 */
public class userServiceImpl implements userService{

    userDAO dao = new userDAOImpl();

    @Override
    public  user login(user user){
        user user1 = dao.queryUserAndPassword(user);
        if (user1 != null){
            return user1;
        }else {
            return null;
        }
    }
}
