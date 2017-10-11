package com.neusoft.services;

import java.util.List;

import com.neusoft.dao.impl.CateDaoImpl;
import com.neusoft.dao.impl.ProductDaoImpl;
import com.neusoft.entity.Cate;

public class Cate1Service {

	public List<Cate>  showCate(){
		CateDaoImpl cd = new CateDaoImpl();
		
		return cd.getAllCate();
	}
	
	
	
	public boolean  UpdateCate(Cate cate){
		CateDaoImpl cd = new CateDaoImpl();
	
		return cd.updateCate(cate);
	}
	
	
	public boolean  AddCate(Cate cate){
		CateDaoImpl cd = new CateDaoImpl();
		
		return cd.addCate(cate);
	}
	
	public boolean DeleteCateService(int cid){
		CateDaoImpl pd=new	CateDaoImpl();
		return pd.deleteCate(cid);
		
		
	}
	
	
	
}
