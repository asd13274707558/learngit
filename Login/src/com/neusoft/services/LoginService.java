package com.neusoft.services;

import com.neusoft.dao.AccountDao;
import com.neusoft.dao.impl.AccountDaoImpl;

/**
 * ҵ���߼���
 * */
public class LoginService {

	
	 /**
	  * �����¼ҵ���߼���
	  * @param username �û���
	  * @param password ����
	  * @return true:��¼�ɹ� 
	  * */
	public boolean doLogin(String username,String password) {
		AccountDao acc=new	AccountDaoImpl();
		boolean a=	acc.doLogin(username, password);
		return a;
	}
	
}
