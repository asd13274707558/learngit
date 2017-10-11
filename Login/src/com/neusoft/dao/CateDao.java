package com.neusoft.dao;

import java.util.List;

import com.neusoft.entity.Cate;

public interface CateDao  {

	
	public  boolean addCate( Cate  cate) ;
	public boolean updateCate( Cate  cate) ;
	public boolean deleteCate(int cid) ;
	public  Cate getlistCate(int id) ;
	public List<Cate> getAllCate() throws DaoException;
}
