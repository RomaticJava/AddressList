package com.zzu.dao;

import com.zzu.entity.user;
import com.zzu.util.JDBCUtil;

import java.sql.*;

/**
 * Created by 62599 on 2017/06/04.
 */
public class userDAOImpl implements userDAO{
    @Override
    public user queryUserAndPassword(user user){
        user user1= null;
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        String sql = null;
        try {
            conn = JDBCUtil.getConnection();
            sql = "SELECT USERNAME,PASSWORD FROM ZZU_USER WHERE USERNAME = ? AND PASSWORD = ?";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1,user.getUsername());
            pstm.setString(2,user.getPassword());
            rs = pstm.executeQuery();
            if (rs.next()){
                String username = rs.getString("username");
                String password = rs.getString("password");
                user1 = new user(username,password);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.release(conn, pstm, rs);
        }
        return user1;
    }

}
