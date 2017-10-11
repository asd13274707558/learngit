package com.neusoft.test;

import com.neusoft.dao.AccountDao;
import com.neusoft.entity.Account;
import com.neusoft.utils.DaoFactory;

public class test {
public static void main(String[] args) {
	test1();
}


public static void  test1(){
	
	AccountDao a= DaoFactory.getInstance("AccountDao");
	 boolean b= a.doLogin("admin","admin");
	 if(b){
		 System.out.println("µÇÂ½³É¹¦");
	 }else{
		 System.out.println("µÇÂ¼Ê§°Ü");
	 }
	
}
}
