package com.neusoft.services;

import java.util.List;

import com.neusoft.dao.impl.ProductDaoImpl;
import com.neusoft.entity.Product;

public class ProductService {

	public boolean addproduct(Product product){
		
		ProductDaoImpl pd=new	ProductDaoImpl();
		return pd.addProdect(product);
		
	}
	public List<Product> ShowProducService(){
		ProductDaoImpl pd=new	ProductDaoImpl();
		return pd.getlistProdectAll();
		
		
	}
	public boolean DeleteProducService(int id){
		ProductDaoImpl pd=new	ProductDaoImpl();
		return pd.deleteProdect(id);
		
		
	}
	
	public boolean UpdateProducService(int id){
		ProductDaoImpl pd=new	ProductDaoImpl();
		return pd.deleteProdect(id);
		
		
	}
	
	
}
