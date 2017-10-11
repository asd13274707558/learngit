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
 * ��ȡ���ݿ�����
 * ���ӳ�
 * */
public class ConnectionFactory {
	private ConnectionFactory(){}

	static DataSource ds = null;


	private static Properties ps = new Properties();

	static {

		InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("jdbc.properties");// ���ض�ȡָ����Դ����������

		try {
			ps.load(is);// ���������ж�ȡ�����б�(����Ԫ�ض�)

			// 1 ����������

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
	 * ��ȡ����
	 */
	public static Connection getConnection() throws SQLException {
		// ��ȡ����
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
