package com.zzu.util;


import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class JDBCUtil {
	
	//创建一个properties
	private static	Properties pr = new Properties();
	static{	
		//加载配置文件
		InputStream is = JDBCUtil.class.getResourceAsStream("/jdbc.properties");
		try {			
			pr.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//线程池
	private static ThreadLocal<Connection>  th = new ThreadLocal<Connection>();
	public static Connection getConnection()throws Exception{
		//线程池中取得连接
		Connection conn = th.get();
		if(conn==null){
			Class.forName(pr.getProperty("driverName"));
			conn = DriverManager.getConnection(pr.getProperty("url"),pr.getProperty("user"),pr.getProperty("password"));
			th.set(conn);//连接放入线程池 
			return conn;
		}else{
			return conn;
		}
	}
	
	public static void release(Connection conn,PreparedStatement pst,ResultSet rs){
		if(rs!=null){try {rs.close();} catch (Exception e) {}};
		if(pst!=null){try {pst.close();} catch (Exception e) {}};
		if(conn!=null){try {conn.close();th.remove();} catch (Exception e) {}};
	}
	
	public static void release(Connection conn,PreparedStatement pst){
		if(pst!=null){try {pst.close();} catch (Exception e) {}};
		if(conn!=null){try {conn.close();th.remove();} catch (Exception e) {}};
	}
	
	public static void release(Connection conn){
		if(conn!=null){try {conn.close();th.remove();} catch (Exception e) {}};
	}
	
	public static void release(PreparedStatement pst){
		if(pst!=null){try {pst.close();} catch (Exception e) {}};
	}
}
