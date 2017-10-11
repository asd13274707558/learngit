package com.neusoft.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.services.ProductService;

/**
 * Servlet implementation class DeleteProducServlet
 */
@WebServlet("/DeleteProducServlet")
public class DeleteProducServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteProducServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String _id= request.getParameter("id");
		Integer id =Integer.parseInt(_id);
		ProductService  ps  = new ProductService();
	    boolean b=	ps.DeleteProducService(id);
	   
	    
	    if(b) {
	    	System.out.println("修改成功");
	    	request.getRequestDispatcher("ShowProducServlet").forward(request, response); 
	    }else {
	    	System.out.println("修改失败");
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
