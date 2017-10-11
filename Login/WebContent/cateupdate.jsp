<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*"%>
<%@ page import="com.neusoft.entity.*" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta charset="UTF-8">
		<title>会员管理</title>
	</head>
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
	<script type="text/javascript" src="js/jquery.min.js">
		
	</script>
	<script type="text/javascript" src="js/bootstrap.min.js">
		
	</script>
	<body>
		<label for="" class="form-group form-inline">修改子类:</label>
	<input type="text"  class="form-control input-sm " placeholder="例:安踏男装"//>
	<label for="" class="form-group form-inline">修改父类:</label>
				<select name="" class="form-control"">
				<%
					List<Cate> list1=(List<Cate>)request.getAttribute("list");
					System.out.println(list1);
					for (int i = 0; i < list1.size(); i++) {%>
					<option value=""><%= list1.get(i).getCname()%></option>
					<%}
					%>


				</select>
		<div class="form-group">
			<a href="ShowCateServlet">	<button type="submit" class="btn-danger btn" onclick="_tijiao()" >提交</button></a>
				<button type="reset" class="btn-danger btn" >重置</button>
				
			</div>
		
	</body>
</html>
