package com.neusoft.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.entity.Account;

/**
 * Servlet implementation class homeservlet
 */
@WebServlet("/home")
public class homeservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public homeservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//設置編碼格式
		response.setContentType("text/html;charset=UTF-8");
		//設置請求編碼格式
		response.setCharacterEncoding("UTF-8");
	
		Object obj=request.getAttribute("acc");
		if(obj!=null&&obj instanceof Account){
			Account acc	=(Account) obj;
			response.getWriter().append("登录成功界面:");
			System.out.println("用户登录成功界面");
			response.getWriter().append("<br/>"+"用户名:"+acc.getUsername()+ "<br/>"+"密    码:"+acc.getPassword());
		}else{
		
			response.getWriter().append("未成功的登录页面");
			System.out.println("用户登录未成功界面");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
