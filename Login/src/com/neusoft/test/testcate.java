package com.neusoft.test;

import java.util.List;

import com.neusoft.dao.CateDao;
import com.neusoft.dao.impl.CateDaoImpl;
import com.neusoft.entity.Cate;
import com.neusoft.utils.DaoFactory;

public class testcate {

/**
	 * �������	
	 * @param args
	 */
/*	public static void main(String[] args) {
		CateDao   cate=DaoFactory.getInstance("cateDao");
	
		for (int i = 0; i < 20; i++) {
			Cate cate1=new Cate("�·�",0);
			System.out.println(cate.addCate(cate1));
		}
		
		
	}*/
	
	
	
	
/*	*//**
	 * �����޸�
	 * @param args
	 *//*
	public static void main(String[] args) {
		CateDao   cate=DaoFactory.getInstance("cateDao");
		Cate cate1=new Cate(1,"�·�",0);
		
		System.out.println(cate.updateCate(cate1));
	}*/
	
	
	
	/**
	 * ����ɾ��
	 * @param args
	 *//*
	public static void main(String[] args) {
		CateDao   cate=DaoFactory.getInstance("cateDao");
	
		
		System.out.println(cate.deleteCate(1));
	}
	*/
	
	/**
	 * ���Բ鿴
	 * @param args
	 */
/*	public static void main(String[] args) {
		CateDao   cate=DaoFactory.getInstance("cateDao");
	
		
		System.out.println(cate.getlistCate(3));
	}*/
	/**
	 * ���Բ鿴ȫ����sevice
	 * @param args
	 */
	
/*	public static void main(String[] args) {
		CateDaoImpl cate=new CateDaoImpl();
	List<Cate> list=cate.getAllCate();
	for (Cate cate2 : list) {
		System.out.println(cate2);
	}
		}*/
	


	
	
}
