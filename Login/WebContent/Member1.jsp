<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="java.util.*"%>
<%@ page import="com.neusoft.entity.*" %>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>添加商品规格</title>
	</head>
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
	<script type="text/javascript" src="ckeditor/ckeditor.js"></script>
	<body>
		<form action="AddProductServlet" method="post" style="margin: 10px" id="form"  >
					<div class="form-group has-error">
				<label for="">商品名称:</label>
				<input type="text" id="pname"  name="pname"  class="form-control input-sm " placeholder="例:安踏男装"/>
			</div>
			
			<!--form-inline水平排列-->
			<div class="form-group form-inline">
				<label for="">所属类别:</label>
				<select name="" class="form-control">
					<option value="">衣服1</option>
					<option value="">衣服1</option>
					<option value="">衣服1</option>
					<option value="">衣服1</option>
					<option value="">衣服1</option>
					<option value="">衣服1</option>
					<option value="">衣服1</option>
				</select>
				<select name="" class="form-control">
					<option value="">衣服1</option>
					<option value="">衣服1</option>
					<option value="">衣服1</option>
					<option value="">衣服1</option>
					<option value="">衣服1</option>
					<option value="">衣服1</option>
					<option value="">衣服1</option>
				</select>
				
			</div>
			
			
			
			
			<div class="form-group has-feedback">
				<label for="">货号:</label>
				<input type="text"  id="pno" name="pno" class="form-control input-sm " placeholder="1"/>
			</div>
			<div class="form-group has-success">
				<label for="">衣服尺码:</label>
				<input type="text"  class="form-control input-sm " placeholder="衣服尺码"/>
			</div>
			<div class="form-group has-warning">
				<label for="">价格:</label>
				<input type="text"  id="price"  name="price" class="form-control input-sm " placeholder="100"/>
			</div>
			<div class="form-group" class="form-group has-warning">
				<label for="">上传图片:</label>
				<input type="file" id="pic"  name="pic" class="active btn"/>
			</div>
			<div class="form-group has-warning">
				<label for="">是否上线:</label>
				<input type="checkbox"   name="checkbox1" value="是"/>是
				<input type="checkbox"   name="checkbox1" value="否"/>否
			</div>
			<div class="form-group">
				<label for="">商品详情:</label>
				<textarea  id="msg_content"  name="msg_content" class="form-control input-lg "	></textarea>
			</div>
			<div class="form-group">
				<button type="submit" class="btn-danger btn"  >提交</button></a>
				<button type="reset" class="btn-danger btn"   onclick="_tijiao()">重置</button>
				
			</div>
		</form>
		<script type="text/javascript">
    CKEDITOR.replace("msg_content");
    </script>
		
	</body>
</html>
