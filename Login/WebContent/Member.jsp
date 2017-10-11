<%@ page import="com.neusoft.services.CateService"%>

<%@ page import="java.util.*"%>
<%@ page import="com.neusoft.entity.*" %>
<%@page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>>
<!DOCTYPE html>

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
	
	
	
		<%-- <c:forEach [var="list1"] [items="list"] [varStatus="status"]>
						<input type="checkbox">
						<c:out value="${status.id}"></c:out>
						<c:out value="${status.cname}"></c:out>
						<c:out value="${status.pid}"></c:out>
			</c:forEach>	 --%>
	
	
	
	
		<%--	<table class="table table-hover table-bordered table-condensed table-striped">
			
			<!-- <thead> -->
				<tr class="info	">
					<th>操作</th>
					<th>会员ID</th>
					<th>用户类型</th>
					<th>用户名</th>
					<th>已完成订单金额</th>
					<th>已完成订单数</th>
					<th>折扣积分</th>
					<th>最近消费</th>
					
				</tr>
			<!-- </thead> -->
	 <tbody>
			
				<c:forEach [var="list1"] [items="list"] [varStatus="status"]>
						<input type="checkbox">
						<c:out value="${status.id}"></c:out>
						<c:out value="${status.cname}"></c:out>
						<c:out value="${status.pid}"></c:out>
						<a action="">修改</a>
						<a action="">删除</a>
		
			</c:forEach>	
			</tbody>
			
			  <%
				CateService cs = new CateService();
		
				List<Cate> li = cs.showCate();
				if(li!=null)
				{
					for(int i=0;i<li.size();i++)
					{
			%>
			  	<tr class="success">
				    <td><%=li.get(i).getCid() %></td>
				    <td><%=li.get(i).getCname() %></td>
				    <td><%=li.get(i).getPid() %></td>
 				 </tr>
 				 	<% 
		}
	}
		%>
			
			
			
			
		</table>
	--%>		
	</body>
</html>
