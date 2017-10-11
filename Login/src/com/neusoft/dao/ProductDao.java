package com.neusoft.dao;

import java.util.List;

import com.neusoft.entity.Product;

public interface ProductDao {

	/**
	 * 
	 * @param product
	 * @return true �жϴ��������Ƿ���ȷ
	 */
	public boolean addProdect(Product product) ;
	public boolean updateProdect(Product product) ;
	public boolean deleteProdect(int id) ;
	public Product getlistProdect(int id) ;
	public List<Product> getlistProdectAll() ;
	
}
	

