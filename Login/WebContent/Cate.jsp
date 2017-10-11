<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ page import="java.util.*"%>
<%@ page import="com.neusoft.entity.*" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>添加类别</title>
	</head>
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
	<body>
		<form action="CateServlet" style="margin: 10px" id="form">
		
		
		<div class="form-group has-error">
				<label for="">添加子类:</label>
				<input type="text"  name="cate_nickname"  id="cate_nickname" class="form-control input-sm " placeholder="例:男装"/>
			</div>

		
		<div class="form-group form-inline">
				
				<label for="" class="form-group form-inline">添加父类:</label>
				<select name="" class="form-control"">
				<%
					List<Cate> list1=(List<Cate>)request.getAttribute("list");
					System.out.println(list1);
					for (int i = 0; i < list1.size(); i++) {%>
					<option value=""><%= list1.get(i).getCname()%></option>
					<%}
					%>


				</select>
				
		</div>	
		
		<div class="form-group">
		<a herf="ShowCateServlet">		<button type="submit" name="tijiao" class="btn-danger btn"    >添加</button></a>
			<a herf="ShowCateServlet">	<button type="reset"  class="btn-danger btn" >重置</button></a>
				
		</div>
		</form>
	</body>

		
</html>
