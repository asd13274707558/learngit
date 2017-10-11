 package com.neusoft.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



/**
 * 
 * 
 * �ر����ݿ�
 * 
 * */
public class DBUtils {

	
	private DBUtils(){}
	//
	/**
	 * �ر�Connection
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
	 * �ر�Statement
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
	 * �ر�ResultSet
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
	 * ��ѯ����ر�Connection Statement ResultSet
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
	 * ��ѯ����ر�Connection Statement 
	 * @param conn
	 * @param st
	 * 
	 * */
	
	public static void close(Connection conn,Statement st){
		close(conn);
		close(st);
		
	}
}
