package com.neusoft.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.entity.Account;
import com.neusoft.services.LoginService;
import com.neusoft.utils.MD5Utils;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		// 設置編碼格式
		
		response.setContentType("text/html;charset=UTF-8");
		// 設置請求編碼格式
		response.setCharacterEncoding("UTF-8");
		// 獲取用戶名密碼
		String _username = request.getParameter("username");
		String _password = request.getParameter("password");
		
		
		String type = request.getParameter("type");

		boolean b = false;
		if(_username != null && _password != null){
			//自定义的业务逻辑
			LoginService l = new LoginService();
			b = l.doLogin(_username, MD5Utils.GetMD5Code(_password));
			System.out.println(b);
			System.out.println("用戶名" + _username);
			System.out.println("密    碼" + _password);
		}
		
		// 7天自动登录 获取的是名字
		String[] str = request.getParameterValues("remember");

		if (str != null) {
			for (String string : str) {
				System.out.println("记住密码:" + string);
				if (string != null && string.equals("on")) {
					// URLEncoder.encode 帐号
					Cookie username_cookie = new Cookie("username_cookie", URLEncoder.encode(_username, "utf-8"));
					// 7天自动登录
					username_cookie.setMaxAge(604800);
					// URLEncoder.encode 密码
					Cookie password_cookie = new Cookie("password_cookie", MD5Utils.GetMD5Code(_password));
					System.out.println(MD5Utils.GetMD5Code(_password));
					password_cookie.setMaxAge(604800);
					  
					// 将cookie存到浏览器的方法
					response.addCookie(username_cookie);
					response.addCookie(password_cookie);

				}
			}

		}
			//准备写
		PrintWriter pw = response.getWriter();

		pw.append("<!DOCTYPE html>");
		pw.append("<html> ");
		pw.append("<head> ");

		pw.append("<meta charset=\"UTF-8\">");
		pw.append("<title> ");
		pw.append("用户登录");
		pw.append("</title> ");

		pw.append("<style>");
		pw.append(
				"html,body,div,span,applet,object,iframe,h1,h2,h3,h4,h5,h6,p,blockquote,pre,a,abbr,acronym,address,big,cite,code,del,dfn,em,img,ins,kbd,q,s,samp,small,strike,strong,sub,sup,tt,var,b,u,i,center,dl,dt,dd,ol,ul,li,fieldset,form,label,legend,table,caption,tbody,tfoot,thead,tr,th,td,article,aside,canvas,details,embed,figure,figcaption,footer,header,hgroup,menu,nav,output,ruby,section,summary,time,mark,audio,video{margin:0;padding:0;border:0;font-size:100%;font:inherit;vertical-align:baseline}article,aside,details,figcaption,figure,footer,header,hgroup,menu,nav,section{display:block}body{line-height:1}ol,ul{list-style:none}blockquote,q{quotes:none}blockquote:before,blockquote:after,q:before,q:after{content:'';content:none}table{border-collapse:collapse;border-spacing:0}");
		pw.append("</style>");
		pw.append("<style>");
		pw.append("* {box-sizing: border-box;}");
		pw.append(
				"body { font-family: \"HelveticaNeue-Light\",\"Helvetica Neue Light\",\"Helvetica Neue\",Helvetica,Arial,\"Lucida Grande\",sans-serif;color: white; font-size: 12px; background: #333333 url(/images/classy_fabric.png);position: relative;top: 157px;left: 0px; }");

		pw.append(
				"form { background: #111;width: 300px; margin: 30px auto; border-radius: 0.4em; border: 1px solid #191919; overflow: hidden; position: relative; box-shadow: 0 5px 10px 5px rgba(0, 0, 0, 0.2);}");
		pw.append(
				"form:after {content: \"\";display: block; position: absolute; height: 1px; width: 100px; left: 20%; background: linear-gradient(to right, #111111, #444444, #b6b6b8, #444444, #111111); top: 0;}");
		pw.append(
				"form:before {content: \"\"; display: block; position: absolute; width: 8px; height: 5px; border-radius: 50%; left: 34%; top: -7px; box-shadow: 0 0 6px 4px #fff;}");
		pw.append(".inset { padding: 20px; border-top: 1px solid #19191a;}");
		pw.append(
				"form h1 {font-size: 18px; text-shadow: 0 1px 0 black;text-align: center; padding: 15px 0;border-bottom: 1px solid black; position: relative;}");
		pw.append(
				"form h1:after { content:\"\";display: block; width: 250px;height: 100px; position: absolute; top: 0; left: 50px;pointer-events: none;transform: rotate(70deg); background: linear-gradient(50deg, rgba(255, 255, 255, 0.15), rgba(0, 0, 0, 0));}");
		pw.append("label { color: #666; display: block; padding-bottom: 9px;}");

		pw.append("input[type=text],");
		pw.append(
				"input[type=password] {width: 100%; padding: 8px 5px; background: linear-gradient(#1f2124, #27292c); border: 1px solid #222; box-shadow: 0 1px 0 rgba(255, 255, 255, 0.1); border-radius: 0.3em; margin-bottom: 20px;}");
		pw.append("label[for=remember] {color: white; display: inline-block;padding-bottom: 0;padding-top: 5px;}");
		pw.append("input[type=checkbox] { display: inline-block; vertical-align: top;}");
		pw.append(".p-container { padding: 0 20px 20px 20px;}");
		pw.append(".p-container:after { clear: both; display: table;content: \"\";}");
		pw.append(".p-container span { display: block; float: left;color: #0d93ff; padding-top: 8px;}");
		pw.append(
				"input[type=submit] {padding: 5px 20px;border: 1px solid rgba(0, 0, 0, 0.4);text-shadow: 0 -1px 0 rgba(0, 0, 0, 0.4);box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.3), inset 0 10px 10px rgba(255, 255, 255, 0.1); border-radius: 0.3em;background: #0184ff;color: white;float: right;font-weight: bold;cursor: pointer;font-size: 13px;}");
		pw.append(
				"input[type=submit]:hover { box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.3), inset 0 -10px 10px rgba(255, 255, 255, 0.1);}");
		pw.append("input[type=text]:hover,");
		pw.append("input[type=password]:hover,");
		pw.append("label:hover ~ input[type=text],");

		pw.append("label:hover ~ input[type=password] { background: #27292c;}");

		pw.append("</style>");

		pw.append("<script src=\"js/prefixfree.min.js\"></script>");
		pw.append("<script src=\"js/modernizr.js\"></script>");
		pw.append("</head> ");
		pw.append("<body> ");
		pw.append("<div id=\"\" style=\"margin: 50px auto;width: 300px; \">");
		pw.append("<form>");
		pw.append("<h1>欢迎使用登录系统</h1> ");
		// 登录开始
		pw.append("<div class=\"inset\"> ");
		pw.append("<p> <label for=\"email\">用户名</label><input type=\"text\" name=\"username\" id=\"email\"></p>");
		pw.append(
				" <p> <label for=\"password\">密&nbsp;&nbsp;&nbsp;&nbsp;码</label><input type=\"password\" name=\"password\" id=\"password\" </p> ");

		pw.append(
				"<p> <input type=\"checkbox\" name=\"remember\" id=\"remember\"><label for=\"remember\">7天自动登录</label></p>");

		pw.append("<input type=\"hidden\" name=\"type\" value=\"1\"/>");

		pw.append("</div> ");
		pw.append(
				"<p class=\"p-container\"><span>忘记密码</span><input type=\"submit\" name=\"go\" id=\"go\" value=\"登录\"></p>");
		pw.append("</form>");

		pw.append("<script src='js/jquery.js'></script>");
		pw.append("<div style=\"text-align:center;clear:both;\">");
		pw.append("<script src=\"/gg_bd_ad_720x90.js\" type=\"text/javascript\"></script>");
		pw.append("<script src=\"/follow.js\" type=\"text/javascript\"></script>");
		pw.append("</div>");
		pw.append("</div>");

		pw.append("</body> ");
		pw.append("</html> ");

		Account acc = new Account(_username, _password);
		if (null != type) {

			if (b) {
				// 登录成功后重定向到本网页
				request.setAttribute("acc", acc);
				request.getRequestDispatcher("index.jsp").forward(request, response);

			} else if (_username == "" || null == _username) {
				pw.append("<script>alert(\"用户名不能为空\")</script>");
			} else if (_password == "" || null == _password) {
				pw.append("<script>alert(\"密码不能为空\")</script>");
			} else {
				// 登录失败后重定向到本网页
				response.sendRedirect("home");
				ServletContext s = this.getServletContext();

			}
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
