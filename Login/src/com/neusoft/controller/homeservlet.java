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
		//�O�þ��a��ʽ
		response.setContentType("text/html;charset=UTF-8");
		//�O��Ո�󾎴a��ʽ
		response.setCharacterEncoding("UTF-8");
	
		Object obj=request.getAttribute("acc");
		if(obj!=null&&obj instanceof Account){
			Account acc	=(Account) obj;
			response.getWriter().append("��¼�ɹ�����:");
			System.out.println("�û���¼�ɹ�����");
			response.getWriter().append("<br/>"+"�û���:"+acc.getUsername()+ "<br/>"+"��    ��:"+acc.getPassword());
		}else{
		
			response.getWriter().append("δ�ɹ��ĵ�¼ҳ��");
			System.out.println("�û���¼δ�ɹ�����");
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
