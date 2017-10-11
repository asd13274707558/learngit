package com.neusoft.services;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.neusoft.dao.DaoException;
import com.neusoft.dao.impl.CateDaoImpl;
import com.neusoft.entity.Cate;
import com.neusoft.utils.ConnectionFactory;
import com.neusoft.utils.DaoFactory;
import com.neusoft.utils.DbUtil;


/**
 * 业务逻辑层
 * 
 * 门面设计模式

 * */
public class CateService {

	Cate cd=DaoFactory.getInstance("cateDao");
	 
	/**
	 * 处理添加业务逻辑
	 * */
	
	
	
	
	public boolean removeCate(int cid){
		CateDaoImpl cd = new CateDaoImpl();
		return cd	.deleteCate(cid);
	}
	
	
	public void  addCate(HttpServletRequest request,HttpServletResponse response){
		String nickname= request.getParameter("cate_nickname");
		 if(nickname==null||nickname.equals("")) {
			 throw new DaoException("分类名称不能为空");
		 }
		 Integer type= Integer.parseInt( request.getParameter("cate_type"));
		 if(type==null||type.equals("")) {
			 throw new DaoException("顶级类不能为空");
		 }
		 Cate cate=new Cate(nickname,type);
			addCate(cate);
			boolean flag= addCate(cate);
		 System.out.println(flag);
			try {
				request.getRequestDispatcher("index.jsp").forward(request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
	}
	
	
	/**
	 * 查看
	 * @return
	 */
	public List<Cate>  showCate(){
		CateDaoImpl cd = new CateDaoImpl();
		return cd.getAllCate();
	}
	
	
	
	
	
	
	
	
/*	public void  addCateLogic(HttpServletRequest request,HttpServletResponse response) throws DaoException,ServletException,IOException{
		
		String nickname= request.getParameter("cate_nickname");
		 if(nickname==null||nickname.equals("")) {
			 throw new DaoException("分类名称不能为空");
		 }
		String type= request.getParameter("cate_type");
		 if(type==null||type.equals("")) {
			 throw new DaoException("顶级类不能为空");
		 }
		 
	
		 
			Cate cate=new Cate(nickname,type);
					addCate(cate);
		 boolean flag= addCate(cate);
		
		request.getRequestDispatcher("addmsg.do?reqType=2&pageNo=1&pageSize=5").forward(request, response);
	}*/
	
	public Map<Integer,String> showCate(int pid) throws DaoException{
		Connection conn = null;
		QueryRunner qr = new QueryRunner();
		String sql="select  cid,cname from cate where pid=?";
		Map<Integer,String> map =new HashMap();
		try {
			conn = ConnectionFactory.getConnection();
			List<Cate> list=qr.query(conn, sql, new BeanListHandler<Cate>(Cate.class), pid);
			if(list.size()>0){
				for(int i=0;i<list.size();i++){
					Cate ca=list.get(i);
					map.put(ca.getCid(), ca.getCname());
				}
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new DaoException("查询二级类别失败!",e);
		}
		
		
		return map;
		
	}
	
	
	/**
	 * 添加类别
	 * */
	
	private  boolean addCate(Cate cate) throws DaoException{
		 CateDaoImpl	c=new CateDaoImpl();
		 c.addCate(cate);
		return  c.addCate(cate);
		
	}
	
	
	/**
	 * 查询业务逻辑
	 * */
	/*public void getMsgsLogic(HttpServletRequest request,HttpServletResponse response) throws DaoException,ServletException,IOException{
		
		
		String pageNo=request.getParameter("pageNo");
		String pageSize=request.getParameter("pageSize");
		
		try {
			int _pageNo=Integer.parseInt(pageNo);
			int _pageSize=Integer.parseInt(pageSize);
			
			PageModel<Msg>  msgs=getMsgsByPage(_pageNo,_pageSize);
			if(msgs!=null) {
				int totalPageSize= (msgs.getTotalcount()%_pageSize==0?msgs.getTotalcount()/_pageSize:msgs.getTotalcount()/_pageSize+1);
				msgs.setTotalPageSize(totalPageSize);
				msgs.setPageNo(_pageNo);
			}
			
			request.setAttribute("msgs", msgs);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	*//**
	 * 分页查询
	 * *//*
	
	
	
	public  PageModel<Msg>  getMsgsByPage(int pageNo,int pageSize) throws DaoException{
		
		
		
		return msgDao.getPageModel(pageNo, pageSize);
	
		
	}
	*/
}
