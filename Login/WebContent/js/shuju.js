/*定义个数组存放数据
 */
var news=[
{"title":"测试标题1","title1":"测试文本1"},
{"title":"测试标题2","title1":"测试文本2"},
{"title":"测试标题3","title1":"测试文本3"},

{"title":"测试标题4","title1":"测试文本4"},
{"title":"测试标题5","title1":"测试文本5"},
{"title":"测试标题6","title1":"测试文本6"},
{"title":"测试标题7","title1":"测试文本7"},
{"title":"测试标题8","title1":"测试文本8"},
{"title":"测试标题9","title1":"测试文本9"},
{"title":"测试标题j","title1":"测试文本j"},
{"title":"测试标题q","title1":"测试文本q"},
{"title":"测试标题q","title1":"测试文本q"}
	

];
var j = 1;

function _onload(){
	_zidong();
	
	var dom=document.getElementById("dom");
	for(var i=0;i<news.length;i++){
		/*循环创建一个div*/
		var _div=document.createElement("div");
		/*div起名id*/
		_div.setAttribute("id","_div"+i);
		/*div样式*/
		var _div_style="width:14%;height:250px;position:relative;border-radius: 10px;margin-left:60px;margin-bottom: 50px;box-shadow: 0 20px 20px 0 rgba(7,17,27,.1); ";
		
		_div.setAttribute("style",_div_style);
		
		
		dom.appendChild(_div);
		
		var _img_div=document.createElement("div");
		_img_div.setAttribute("id","_img"+i);	
		_img_div.setAttribute("style",_img_style);
		var _img_style="width:100%;height:100px;";
		_div.appendChild(_img_div);
		var _img_div_img=document.createElement("img");
		
		
		_img_div_img.setAttribute("id","_img_div_img"+i);
		
	/*	var _h=document.getElementById("_img_div_img"+i).src;
		
		if(_h.match("img/img_1.jpg")){
			_h="img/img_2.jpg";
			
		}else if(_h.match("img/img_2.jpg")){
			_h="img/img_3.jpg";
		}else{
			_h="img/img_1.jpg";
		}*/
		
		
		_img_div_img.setAttribute("src","img/img_"+ j +".jpg");
		j++;
		if(j==4){
			j=1;
		}
		_img1_style="border-radius:10px"
		_img_div_img.setAttribute("style",_img1_style);	
		_img_div.appendChild(_img_div_img);
		/*取得换图片的id*/
		

		
		
		
		
		/*p标签部分*/
		
		
		
			var _title_p=document.createElement("p");
			_title_p.setAttribute("style","text-align:center;")
						
			var _p_title_text=document.createTextNode(news[i].title);
			_title_p.appendChild(_p_title_text);
			_div.appendChild(_title_p);
			
			
			var _title1_p=document.createElement("p");
			_title1_p.setAttribute("style","text-align:center;")
		
			var _p_title1_text=document.createTextNode(news[i].title1);
			_title1_p.appendChild(_p_title1_text);
			_div.appendChild(_title1_p);
	}
	
	
	
	
	
}
