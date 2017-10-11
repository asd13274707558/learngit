package com.neusoft.services;

import com.neusoft.dao.AccountDao;
import com.neusoft.dao.impl.AccountDaoImpl;

/**
 * 业务逻辑层
 * */
public class LoginService {

	
	 /**
	  * 处理登录业务逻辑。
	  * @param username 用户名
	  * @param password 密码
	  * @return true:登录成功 
	  * */
	public boolean doLogin(String username,String password) {
		AccountDao acc=new	AccountDaoImpl();
		boolean a=	acc.doLogin(username, password);
		return a;
	}
	
}
