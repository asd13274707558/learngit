<%@ page language="java" contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8"%>
 <%@ page import="java.util.*"%>
<%@ page import="com.neusoft.entity.*" %>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
		<script type="text/javascript" src="js/menu.js">
		
	</script>
	
	<script type="text/javascript">
	
	function delte(){	
		var arrSon = document.getElementsByName("Son");
		
		for(var i=0;i<arrSon.length;i++){
		
			if(arrSon[i].checked == true){
				
				 
				
				window.self.location = "DeleteProducServlet?id=" + arrSon[i].value;
			}
		}		
	}

	function update(){
	var arrSon = document.getElementsByName("Son");
		
		for(var i=0;i<arrSon.length;i++){
		
			if(arrSon[i].checked == true){
				
				 
				
				window.self.location = "DeleteCateServlet?id=" + arrSon[i].value;
			}
		}
		
	}
			
		
		
	</script>
	
	<body>
		<form>
		<!-- <a href="AddCateServlet"><input type="button" class="btn-danger btn" value="添加类别"/></a> -->
			<table class="table table-hover table-bordered table-condensed table-striped">
			
					<tr class="info	">
						<th><input onclick="selectAll()" type="checkbox"   name="controlAll" style="controlAll" id="controlAll"/></th>
						<th>编号</th>
						<th>名称</th>
						<th>库存</th>
						<th>上架</th>
						<th>已完成订单数</th>			
						<th>操作</th>
					
				</tr>
			
					<%
					List<Cate> list1=(List<Cate>)request.getAttribute("list");
					System.out.println(list1);
					for (int i = 0; i < list1.size(); i++) {%>
					<tr>
					<td><input name="Son" id="Son1" type="checkbox" style="zoom: 1.6;"" value="<%=list1.get(i).getCid()%>"  /></td>
					<td><%= list1.get(i).getCid()%></td>
					<td><%= list1.get(i).getCname()%></td>	
					<td>100</td>
					<td>是</td>
					<td>32</td>				
					<td><a href=""  onclick="update()" >修改</a> <a href="#" onclick="delte()">删除</a></td>
					</tr>
					<br/>
						<%}
					%>
				

		</table>
		</form>
	</body>
</html>
