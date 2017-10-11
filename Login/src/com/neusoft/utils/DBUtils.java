 package com.neusoft.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



/**
 * 
 * 
 * 关闭数据库
 * 
 * */
public class DBUtils {

	
	private DBUtils(){}
	//
	/**
	 * 关闭Connection
	 * @param Connection
	 * */
	public static void  close(Connection conn){
		if(null!=conn){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 关闭Statement
	 * @param Statement
	 * */
	public static void  close(Statement st){
		if(null!=st){
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	/**
	 * 关闭ResultSet
	 * @param ResultSet
	 * */
	public static void  close(ResultSet rs){
		if(null!=rs){
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 
	 * 查询，需关闭Connection Statement ResultSet
	 * @param conn
	 * @param st
	 * @param rs
	 * */
	
	public static void close(Connection conn,Statement st,ResultSet rs){
		close(conn);
		close(st);
		close(rs);
	}
	
	/**
	 * 
	 * 查询，需关闭Connection Statement 
	 * @param conn
	 * @param st
	 * 
	 * */
	
	public static void close(Connection conn,Statement st){
		close(conn);
		close(st);
		
	}
}
