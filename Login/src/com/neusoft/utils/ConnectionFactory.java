package com.neusoft.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.DataSources;

/**
 * 获取数据库连接
 * 连接池
 * */
public class ConnectionFactory {
	private ConnectionFactory(){}

	static DataSource ds = null;


	private static Properties ps = new Properties();

	static {

		InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("jdbc.properties");// 返回读取指定资源的输入流。

		try {
			ps.load(is);// 从输入流中读取属性列表(键和元素对)

			// 1 加载类驱动

			Class.forName(ps.getProperty("driver"));

			/**
			 * c3p0
			 */
			DataSource dataSource = DataSources.unpooledDataSource(ps.getProperty("url"), ps.getProperty("username"),
					ps.getProperty("password"));
			ds = DataSources.pooledDataSource(dataSource);

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 获取连接
	 */
	public static Connection getConnection() throws SQLException {
		// 获取连接
		return ds.getConnection();

	}
		/*public static void main(String[] args) {
			try {
				System.out.println(ConnectionFactory.getConnection());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
}
