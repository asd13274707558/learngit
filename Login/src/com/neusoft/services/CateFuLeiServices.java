package com.neusoft.services;

import java.util.List;

import com.neusoft.dao.impl.CateDaoImpl;
import com.neusoft.entity.Cate;

public class CateFuLeiServices {

	public List<Cate>  getFulistCate(){
		CateDaoImpl cd = new CateDaoImpl();
	
		return 	cd.getFulistCate();
	}
	
	
	
	
	
	
	
}
