package com.neusoft.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.neusoft.dao.AccountDao;
import com.neusoft.entity.Account;
import com.neusoft.utils.ConnectionFactory;
import com.neusoft.utils.MD5Utils;

public class AccountDaoImpl implements AccountDao {

	/**
	 * @param username 用户名
	 * @param password 密码
	 * @return true:查询到用户 false:为查询到用户
	 * */
	
QueryRunner qRunner = new QueryRunner();
	
	
	@Override
	public  boolean doLogin(String username, String password) {
		Connection conn = null;
		Account account = null;
		try {
			conn= ConnectionFactory.getConnection();
			String sql = "select * from account where username=? and password=?";
			//System.out.println(sql);
			ResultSetHandler<Account> rsh = new BeanHandler <Account>(Account.class);
			account = qRunner.query(conn, sql, rsh,username,password);
			// System.out.println(account);
			if(account!=null) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DbUtils.closeQuietly(conn);
		}
		return false;
	}
	
/*	public static void main(String[] args) {
		System.out.println(new AccountDaoImpl().doLogin("admin", "admin"));
	}*/
	
	public static void main(String[] args) {
		System.out.println(MD5Utils.GetMD5Code("admin"));
	}

}

