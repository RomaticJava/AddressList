package com.zzu.service;

import com.zzu.dao.addressDAO;
import com.zzu.dao.addressDAOImpl;
import com.zzu.entity.address;
import com.zzu.util.JDBCUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by 62599 on 2017/06/05.
 */
public class addressServiceImpl implements addressService{

    addressDAO addressDAO = new addressDAOImpl();

    @Override
    public List<address> queryAllAddress() {
        List<address> allAddress = addressDAO.queryAllAddress();
        return allAddress;
    }

    @Override
    public void updateAddress(address address) { 
    	Connection	conn = null;
    	
    	try {
    		conn=JDBCUtil.getConnection();
			conn.setAutoCommit(false);
			addressDAO.updateAddress(address); 
			conn.commit();
		} catch (Exception e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
             
    }

    @Override
    public void deleteAddress(address address) {
        Connection	conn = null;

        try {
            conn=JDBCUtil.getConnection();
            conn.setAutoCommit(false);
            addressDAO.deleteAddress(address);
            conn.commit();
        } catch (Exception e) {
            try {
                conn.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }
    }

    @Override
    public void insertAddress(address address) {
        Connection	conn = null;

        try {
            conn=JDBCUtil.getConnection();
            conn.setAutoCommit(false);
            addressDAO.insertAddress(address);
            conn.commit();
        } catch (Exception e) {
            try {
                conn.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }
    }
}
