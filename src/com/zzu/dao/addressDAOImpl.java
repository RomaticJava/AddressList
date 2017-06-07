package com.zzu.dao;




import com.zzu.entity.address;
import com.zzu.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by 62599 on 2017/06/05.
 */
public class addressDAOImpl implements addressDAO{

    @Override
    public List<address> queryAllAddress() {
    	
        ArrayList<address> list = new ArrayList<address>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        String sql = null;
        try {
            conn = JDBCUtil.getConnection();
            sql = "SELECT * FROM ADDRESS_LIST ORDER BY ID";
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                address address = new address();
                address.setId(rs.getInt("id"));
                address.setName(rs.getString("name"));
                address.setSalary(rs.getString("salary"));
                address.setBirthday(rs.getString("birthday"));
                list.add(address);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            JDBCUtil.release(conn, pstm, rs);
        }
        
       
    }

    @Override
    public void updateAddress(address address) {
        
        Connection conn = null;
        PreparedStatement pstm = null;
        String sql = null;

        try {
            conn =JDBCUtil.getConnection();
            sql = "update address_list set name = ?,salary = ?,birthday = ? where id = ?";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1,address.getName());
            pstm.setString(2,address.getSalary());
            pstm.setString(3,address.getBirthday());
            pstm.setInt(4,address.getId());
            pstm.execute();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JDBCUtil.release(null,pstm,null);
        }

    }

    @Override
    public void deleteAddress(address address) {
        Connection conn = null;
        PreparedStatement pstm = null;
        String sql = null;

        try {
            conn =JDBCUtil.getConnection();
            sql = "delete from address_list where id=?";
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1,address.getId());
            pstm.execute();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JDBCUtil.release(null,pstm,null);
        }
    }

    @Override
    public void insertAddress(address address) {
        Connection conn = null;
        PreparedStatement pstm = null;
        String sql = null;

        try {
            conn =JDBCUtil.getConnection();
            sql = "insert into address_list(id,name,salary,birthday) values(seq_id.nextval,?,?,?)";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1,address.getName());
            pstm.setString(2,address.getSalary());
            pstm.setString(3,address.getBirthday());
            pstm.execute();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JDBCUtil.release(null,pstm,null);
        }
    }
}
