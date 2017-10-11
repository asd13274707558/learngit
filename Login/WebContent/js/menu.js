// JavaScript Document


//导航菜单
function navList(id) {
    var $obj = $("#nav_dot"), $item = $("#J_nav_" + id);
    $item.addClass("on").parent().removeClass("none").parent().addClass("selected");
    $obj.find("h4").hover(function () {
        $(this).addClass("hover");
    }, function () {
        $(this).removeClass("hover");
    });
    $obj.find("p").hover(function () {
        if ($(this).hasClass("on")) { return; }
        $(this).addClass("hover");
    }, function () {
        if ($(this).hasClass("on")) { return; }
        $(this).removeClass("hover");
    });
    $obj.find("h4").click(function () {
        var $div = $(this).siblings(".list-item");
        if ($(this).parent().hasClass("selected")) {
            $div.slideUp(600);
            $(this).parent().removeClass("selected");
        }
        if ($div.is(":hidden")) {
            $("#nav_dot li").find(".list-item").slideUp(600);
            $("#nav_dot li").removeClass("selected");
            $(this).parent().addClass("selected");
            $div.slideDown(600);

        } else {
            $div.slideUp(600);
        }
    });
}

/****表格隔行高亮显示*****/
window.onload=function(){
	oTable=document.getElementById("tab");//找表格
	aTr=document.getElementsByTagName("tr");//找所有的行
	for(i=0;i<aTr.length;i++){
		if(i%2==0){
			aTr[i].style.background="#fff";	
		}else{
			aTr[i].style.background="#ccc";	
		};
	};
};




var news=[
{"shangpinmingcheng":"珍珠翡翠白玉堂","suoshuleibie":"食品","huohao":"a001","shangchuantupian":"","shangpinjiage":"100","tejia":"on","xiangqing":"一人我印皆醉,巴拉巴拉我不会"},
{"shangpinmingcheng":"珍珠翡翠白玉堂","suoshuleibie":"食品","huohao":"a001","shangchuantupian":"","shangpinjiage":"100","tejia":"on","xiangqing":"一人我印皆醉,巴拉巴拉我不会"},
{"shangpinmingcheng":"珍珠翡翠白玉堂","suoshuleibie":"食品","huohao":"a001","shangchuantupian":"","shangpinjiage":"100","tejia":"on","xiangqing":"一人我印皆醉,巴拉巴拉我不会"},

{"shangpinmingcheng":"珍珠翡翠白玉堂","suoshuleibie":"食品","huohao":"a001","shangchuantupian":"","shangpinjiage":"100","tejia":"on","xiangqing":"一人我印皆醉,巴拉巴拉我不会"},
{"shangpinmingcheng":"珍珠翡翠白玉堂","suoshuleibie":"食品","huohao":"a001","shangchuantupian":"","shangpinjiage":"100","tejia":"on","xiangqing":"一人我印皆醉,巴拉巴拉我不会"},
{"shangpinmingcheng":"珍珠翡翠白玉堂","suoshuleibie":"食品","huohao":"a001","shangchuantupian":"","shangpinjiage":"100","tejia":"on","xiangqing":"一人我印皆醉,巴拉巴拉我不会"},
{"shangpinmingcheng":"珍珠翡翠白玉堂","suoshuleibie":"食品","huohao":"a001","shangchuantupian":"","shangpinjiage":"100","tejia":"on","xiangqing":"一人我印皆醉,巴拉巴拉我不会"},
{"shangpinmingcheng":"珍珠翡翠白玉堂","suoshuleibie":"食品","huohao":"a001","shangchuantupian":"","shangpinjiage":"100","tejia":"on","xiangqing":"一人我印皆醉,巴拉巴拉我不会"},
{"shangpinmingcheng":"珍珠翡翠白玉堂","suoshuleibie":"食品","huohao":"a001","shangchuantupian":"","shangpinjiage":"100","tejia":"on","xiangqing":"一人我印皆醉,巴拉巴拉我不会"}
	

];



function _shangpinliebiao(){
	
	var main=document.getElementById("main");//找到右侧的div
	var _img1=document.getElementById("_img1");
	_img1.innerHTML="商品管理→商品列表"
	if(main.style.display.match("none")){
		main.style.display="block";
	}else if(main.style.display.match("block")){
		main.style.display.match("none");
	}
	/*解决了无限建造的问题*/
	main.innerHTML="";
	for(var i=0;i<news.length;i++){
		
		/*循环创建一个div*/
		var _div=document.createElement("div");
		/*div起名id*/
		_div.setAttribute("id","_div"+i);
		/*div样式*/
		var _div_style="width:100%;height:80px;box-shadow: 0 10px 10px 0 rgba(7,17,27,.1);padding: 10px; ";
		_div.setAttribute("style",_div_style);
		main.appendChild(_div);
		
		var _title_p=document.createElement("p");			
		var _p_title_text=document.createTextNode(news[i].shangpinmingcheng);
		/*传进来的P标签设置*/
		_title_p.setAttribute("style","display: inline; text-align: center;margin:60px;line-height: 80px;");
		_title_p.appendChild(_p_title_text);
		_div.appendChild(_title_p);
		var _title_p=document.createElement("p");			
		var _p_title_text=document.createTextNode(news[i].suoshuleibie);
		
		/*传进来的P标签设置*/
		_title_p.setAttribute("style","display: inline;text-align: center;margin:60px;line-height: 80px;");
		_title_p.appendChild(_p_title_text);
		_div.appendChild(_title_p);
		var _title_p=document.createElement("p");			
		var _p_title_text=document.createTextNode(news[i].huohao);
		/*传进来的P标签设置*/
		_title_p.setAttribute("style","display: inline;text-align: center;margin:60px;line-height: 80px;");
		_title_p.appendChild(_p_title_text);
		_div.appendChild(_title_p);
		var _title_p=document.createElement("p");			
		var _p_title_text=document.createTextNode(news[i].shangpinjiage);
		/*传进来的P标签设置*/
		_title_p.setAttribute("style","display: inline;text-align: center;margin:60px;line-height: 80px;");
		_title_p.appendChild(_p_title_text);
		_div.appendChild(_title_p);
		var _title_p=document.createElement("p");			
		var _p_title_text=document.createTextNode(news[i].tejia);
		/*传进来的P标签设置*/
		_title_p.setAttribute("style","display: inline;text-align: center;margin:60px;line-height: 80px;");
		_title_p.appendChild(_p_title_text);
		_div.appendChild(_title_p);
		var _title_p=document.createElement("p");			
		var _p_title_text=document.createTextNode(news[i].xiangqing);
		/*传进来的P标签设置*/
		_title_p.setAttribute("style","display: inline;text-align: center;margin:60px;line-height: 80px;");
		_title_p.appendChild(_p_title_text);
		_div.appendChild(_title_p);
	
	
}
}



function _shangpinleibieweihu(){
	var _img1=document.getElementById("_img1");
	_img1.innerHTML="商品管理→商品类别维护"
	var main=document.getElementById("main");
	main.innerHTML="";
if(main.style.display.match("none")){
		main.style.display="block";
	}else if(main.style.display.match("block")){
		main.style.display.match("none");
	}
		/*创建一个div*/
		var _div=document.createElement("iframe");
		/*div起名id*/
		_div.setAttribute("id","_div_2");
		/*div样式*/
		
		_div.setAttribute("src","Member1.jsp");
		_div.setAttribute("style","width:100%;height:620px;");
		main.appendChild(_div);
}




function _shangpinguigeshuxing(){
	var _img1=document.getElementById("_img1");
	_img1.innerHTML="商品管理→商品规格属性"
		var main=document.getElementById("main");
		main.innerHTML="";
		/*创建一个div*/
		var _div=document.createElement("iframe");
		/*div起名id*/
		_div.setAttribute("id","_div_3");
		/*div样式*/
		_div.setAttribute("src","ShowCateServlet");
		_div.setAttribute("style","width:100%;height:620px;");
		main.appendChild(_div);
}




/*提交*/
function _tijiao(){
	var _img1=document.getElementById("_img1");
	_img1.innerHTML="商品管理→商品规格属性"
		var main=document.getElementById("main");
	main.innerHTML="";
	/*创建一个iframe*/
	var _div=document.createElement("iframe");
	/*div起名id*/
	_div.setAttribute("id","_div_3");
	/*div样式*/
	_div.setAttribute("src","http://localhost:7878/Login/ShowCateServlet");
	_div.setAttribute("style","width:100%;height:620px;");
	main.appendChild(_div);
}



function _huiyuanguanli1(){
		var _img1=document.getElementById("_img1");
	_img1.innerHTML="会员管理→会员管理1"
	
	
	
	
	var main=document.getElementById("main");
	main.innerHTML="";
		if(main.style.display.match("none")){
		main.style.display="block";
	}else if(main.style.display.match("block")){
		main.style.display.match("none");
	}
		/*创建一个div*/
		var _div=document.createElement("iframe");
		/*div起名id*/
		_div.setAttribute("id","_div_3");
		/*div样式*/
		
		_div.setAttribute("src","Member.html");
		_div.setAttribute("style","width:100%;height:620px;");
		main.appendChild(_div);
}


function selectAll(){
	 var checklist = document.getElementsByName("Son");
	   if(document.getElementById("controlAll").checked)
	   {
	   for(var i=0;i<checklist.length;i++)
	   {
	      checklist[i].checked = 1;
	   }
	 }else{
	  for(var j=0;j<checklist.length;j++)
	  {
	     checklist[j].checked = 0;
	  }
	 }
	}



