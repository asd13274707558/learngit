package com.neusoft.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.neusoft.dao.CateDao;
import com.neusoft.dao.DaoException;
import com.neusoft.entity.Cate;
import com.neusoft.entity.Product;
import com.neusoft.utils.ConnectionFactory;

public class CateDaoImpl implements CateDao  {
	QueryRunner qr = new QueryRunner();
	/**
	 * 添加类别
	 */
	
	@Override
	public  boolean addCate(Cate cate) throws  DaoException{
		// TODO Auto-generated method stub
		Connection conn = null;
		try {
			conn = ConnectionFactory.getConnection();
			// sql语句
			String sql = "insert into Cate (cname,pid) values(?,?)";
			Object[] params = {cate.getCname(),cate.getPid() };
			int count = qr.update(conn, sql, params);
			if (count > 0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new DaoException("添加类别失败", e);
		} finally {
			DbUtils.closeQuietly(conn);
		}
		return false;
	}
	
	
	/**
	 * 修改类别
	 */
	@Override
	public boolean updateCate(Cate cate) throws  DaoException {
		Connection conn = null;
		try {
			conn = ConnectionFactory.getConnection();
			String sql = "update Cate set cname=?,pid=? where cid=?";
			Object[] params = { cate.getCname(), cate.getPid(), cate.getCid() };
			int count = qr.update(conn, sql, params);

			if (count > 0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new DaoException("修改类别失败", e);
		} finally {
			DbUtils.closeQuietly(conn);
		}

		return false;
	}
	/**
	 * 根据id删除类别
	 */
	@Override
	public boolean deleteCate(int cid) throws  DaoException {
		Connection conn = null;
		try {
			conn = ConnectionFactory.getConnection();
			String sql = "delete from Cate where cid=?";

			int count = qr.update(conn, sql, cid);

			if (count > 0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new DaoException("删除类别失败", e);
		} finally {
			DbUtils.closeQuietly(conn);
		}

		return false;
	}

	
	
	/**
	 * 根据id查看
	 */
	@Override
	public Cate getlistCate(int cid) throws  DaoException {
		// TODO Auto-generated method stub
		Connection conn = null;
		Cate cate = null;
		try {
			conn = ConnectionFactory.getConnection();
			String sql = "select * from Cate where cid=?";
			ResultSetHandler<Cate> rsh = new BeanHandler<Cate>(Cate.class);

			cate = qr.query(conn, sql, rsh, cid);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new DaoException("查看类别失败", e);
		}

		return cate;
	}
	/**
	 * 查看父类全部
	 */
	public List<Cate> getFulistCate() throws  DaoException {
		// TODO Auto-generated method stub
		Connection conn = null;
		List<Cate> cate = null;
		try {
			conn = ConnectionFactory.getConnection();
			String sql = "select * from Cate where pid=0";
			cate = qr.query(conn,sql,  new BeanListHandler<Cate>(Cate.class));
			for (Cate cate2 : cate) {
				System.out.println(cate2);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new DaoException("查看类别失败", e);
		}

		return cate;
	}
	
	
	public List<Cate> getAllCate() throws DaoException{
		// TODO Auto-generated method stub
		Connection conn = null;
		Cate cate = null;
		List<Cate> list= new ArrayList<Cate>();
		try {
			conn = ConnectionFactory.getConnection();
			String sql = "select * from Cate ";
			ResultSetHandler<List<Cate>> rsh = new BeanListHandler<Cate>(Cate.class);

			list = qr.query(conn, sql, rsh);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new DaoException("查看类别失败", e);
		}

		return list;
		
	}

}
