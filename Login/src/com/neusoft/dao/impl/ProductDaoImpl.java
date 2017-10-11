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
import com.neusoft.dao.DaoException;
import com.neusoft.dao.ProductDao;
import com.neusoft.entity.Account;
import com.neusoft.entity.Cate;
import com.neusoft.entity.Product;
import com.neusoft.utils.ConnectionFactory;
import com.neusoft.utils.MD5Utils;

public class ProductDaoImpl implements ProductDao {
	QueryRunner qr = new QueryRunner();

	/**
	 * 添加方法
	 */

	@Override
	public boolean addProdect(Product product) throws  DaoException{
		Connection conn = null;

		try {
			conn = ConnectionFactory.getConnection();
			// sql语句
			String sql = "insert into product (id,pname,pno,pic,price,pdetail) values(?,?,?,?,?,?)";
			Object[] params = { product.getId(),product.getPname(), product.getPno(), product.getPic(),
					product.getPrice(),product.getPdetail() };
			int count = qr.update(conn, sql, params);
			if (count > 0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new DaoException("添加商品失败", e);
		} finally {
			DbUtils.closeQuietly(conn);
		}

		return false;
	}

	/**
	 * 修改方法
	 */
	@Override
	public boolean updateProdect(Product product) throws  DaoException{
		Connection conn = null;
		try {
			conn = ConnectionFactory.getConnection();
			String sql = "update product set pname=?,cid=? where id=?";
			Object[] params = { product.getPname(), product.getCid(), product.getId() };
			int count = qr.update(conn, sql, params);

			if (count > 0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new DaoException("修改商品失败", e);
		} finally {
			DbUtils.closeQuietly(conn);
		}

		return false;
	}

	
	/**
	 * 删除商品
	 */
	@Override
	public boolean deleteProdect(int id) throws  DaoException {
		Connection conn = null;
		try {
			conn = ConnectionFactory.getConnection();
			String sql = "delete from product where id=?";

			int count = qr.update(conn, sql, id);

			if (count > 0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new DaoException("删除商品失败", e);
		} finally {
			DbUtils.closeQuietly(conn);
		}

		return false;
	}

	/**
	 * 根据id查看
	 */

	@Override
	public Product getlistProdect(int id) throws DaoException{
		// TODO Auto-generated method stub
		Connection conn = null;
		Product product = null;
		try {
			conn = ConnectionFactory.getConnection();
			String sql = "select * from product where id=?";
			ResultSetHandler<Product> rsh = new BeanHandler<Product>(Product.class);

			product = qr.query(conn, sql, rsh, id);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new DaoException("查看商品失败", e);
		}

		return product;
	}
	/**
	 * 全部查看
	 */
	public List<Product> getlistProdectAll() throws DaoException{
		// TODO Auto-generated method stub
		Connection conn = null;
		Product product = null;
		List<Product> list= new ArrayList<Product>();
		try {
			conn = ConnectionFactory.getConnection();
			String sql = "select * from product order by id desc";
			ResultSetHandler<List<Product>> rsh = new BeanListHandler<Product>(Product.class);
		
			list = qr.query(conn, sql, rsh);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new DaoException("查看商品失败", e);
		}

		return list;
	}

}
