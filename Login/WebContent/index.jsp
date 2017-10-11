<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>后台管理系统</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="js/menu.js"></script>
</head>

<body >
<div class="top"></div>
<div id="header">
	<div class="logo"><a href="index.html">后台管理系统</a></div>
	<div class="navigation">
		<ul>
		 	<li>欢迎您！</li>
			<li><a href="">admin</a></li>
			<li><a href="">修改密码</a></li>
			<li><a href="">设置</a></li>
			<li><a href="">退出</a></li>
		</ul>
	</div>
</div>
<div id="content">
	<div class="left_menu">
				<ul id="nav_dot">
      <li>
          <h4 class="M1"><span></span>商品管理</h4>
          <div class="list-item none" >
            <a href='#' onclick="_shangpinliebiao()">商品列表</a>
            <a href="#" onclick="_shangpinleibieweihu()">商品类别维护</a>
           <!-- onclick="_shangpinleibieweihu()"  onclick="_shangpinguigeshuxing()"-->
            
            <a href="#"   onclick="_shangpinguigeshuxing()"> 商品规格属性</a>
            
            
          </div>
        </li>
    
				<li>
          <h4 class="M4"><span></span>前台管理</h4>
          <div class="list-item none">
            <a href='#'onclick="_shangpinguigeshuxing()">前台管理1</a>
            <a href='#'onclick="_huiyuanguanli1()">前台管理2</a>
            <a href='#'onclick="_huiyuanguanli1()">前台管理3</a>
          </div>
        </li>
	
        </li>
				<li>
          <h4  class="M7"  ><span></span>会员管理</h4>
          <div class="list-item none">
            <a href='#' onclick="_huiyuanguanli1()">会员管理1</a>
            <a href='#' onclick="_huiyuanguanli1()">会员管理2</a>
            <a href='#' onclick="_huiyuanguanli1()">会员管理3</a>
          </div>
        </li>
		
				<li>
          <h4  class="M9"><span></span>权限管理</h4>
          <div class="list-item none">
            <a href='#' onclick="_huiyuanguanli1()">权限管理1</a>
            <a href='#' onclick="_huiyuanguanli1()">权限管理2</a>
            <a href='#' onclick="_huiyuanguanli1()">权限管理3</a>
          </div>
        </li>
				<li>
          <h4   class="M10"><span></span>系统管理</h4>
          <div class="list-item none">
            <a href='#' onclick="_huiyuanguanli1()">系统管理1</a>
            <a href='#' onclick="_huiyuanguanli1()">系统管理2</a>
            <a href='#' onclick="_huiyuanguanli1()">系统管理3</a>
          </div>
        </li>
  </ul>
		</div>
		<div class="m-right">
			<div class="right-nav">
					<ul>
							<li><img src="images/home.png" style="position: relative;top:1px;"></li>
								<li style="margin-left:25px;">您当前的位置：</li>
								<!--能动的公告 marquee-->
								<li><a href=""><marquee ><p id="_img1">商品管理</p></marquee></a></li>
								<!--li>></li>
								<li><a href="#">最新公告</a></li>-->
						</ul>
			</div>
			<div class="main" id="main"style="width:100%;height:650px;">
			
								
			
			</div>
			
			
			<div class="Member" id="Member"style="width:100%;height:650px; background-color:blue;">
				
				
			</div>
			
			
		</div>
</div>
<div class="bottom"></div>
<div id="footer"><p><a href="" target="_blank"></a></p></div>
<script>navList(12);</script>
</body>
</html>
