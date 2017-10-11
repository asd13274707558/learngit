package com.neusoft.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.services.Cate1Service;
import com.neusoft.services.ProductService;

/**
 * Servlet implementation class DeleteCateServlet
 */
@WebServlet("/DeleteCateServlet")
public class DeleteCateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteCateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String _id= request.getParameter("id");
		Integer cid =Integer.parseInt(_id);
		Cate1Service  ps  = new Cate1Service();
	    boolean b=	ps.DeleteCateService(cid);
	   
	    
	    if(b) {
	    	System.out.println("修改成功");
	    	request.getRequestDispatcher("ShowCateServlet").forward(request, response); 
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
