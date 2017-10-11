package com.neusoft.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.entity.Product;
import com.neusoft.services.ProductService;

/**
 * Servlet implementation class AddProductServlet
 */
@WebServlet("/AddProductServlet")
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String pname= request.getParameter("pname");
	
		String pno = request.getParameter("pno");
		String pic= request.getParameter("pic");
		String _price = request.getParameter("price");
		Double price  =Double.parseDouble(_price);
	
		String padetail = request.getParameter("msg_content");
		 ProductService  ps =   new ProductService();
		Product product=new Product();
		product.setPname(pname);
		product.setPno(pno);
		product.setPic(pic);
		product.setPrice(price);
		product.setPdetail(padetail);
		
		
		
		
		
		boolean result=  ps.addproduct(product);
		if(result) {
			System.out.println("添加成功");
			request.getRequestDispatcher("ShowProducServlet").forward(request, response);
		}else {
			System.out.println("添加失败");
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
