<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>${player.pName}_世界杯球星</title>
<link type="text/css" rel="stylesheet" href="r.img.cctvpic.com/worldcup/2018/star/Messi/style/style.css-3673e98d69f4cedf2ee01d64ff5b3def.css" />
<link type="text/css" rel="stylesheet" href="r.img.cctvpic.com/worldcup/2018/include/sqnav/style/style.css-7e2cc264e5277cb6b4bbca73c732b556.css"/>
<link type="text/css" rel="stylesheet" href="r.img.cctvpic.com/worldcup/2018/include/sqbanner/style/style.css-fafb0e849bb3f254505034cc2446336b.css"/>
<style>
	.item{
		font-size:25px;
		color:#15467a;
	}
	.val{
		font-size:25px;
		color:#15467a;
	}
	.banner a{
		text-decoration:none;
		margin-left:170px;
		color:#ede9c3;
		font-size:30px;
	}
	.box-img{
		 width:22px;
		 height:22px; 
		 margin-left:30px;
	}
	.zan-number{
		margin-left:8px;
		font-size:20px;
		color:#15467a;
	}
</style>
</head>

<body>
	<div class="bg_center_v_tile">
	  <div class="bg_top_h_tile">
	    <div class="bg_top_owner">
	      <div class="bg_bottom_h_tile">	      
	        <div class="bg_bottom_owner">
	          <div id="page_head">	          
				<div class="qianban17886_banner_xq17886_20180425">
			 		<div class="banner">
						<a href="index.jsp">首页</a>
				  		<a href="news.jsp">赛事快讯</a>
				  		<a href="queryAllTeamInfo">球队</a>
				  		<a href="allstar.jsp">球星</a>
				  		<a href="queryAllGame2.jsp">世界杯GOAL</a>
				  		<a href="login.jsp">登录</a>
					</div>
				</div>
			  </div>
	
				<div id="page_body">
					<div class="column_wrapper_13292">
						<div id="SUBD1526869985062680">
							<div class="qiuxing17931_ind01">
							<!-- 信息 -->
							<div class="intro" style="margin-left:180px;">
							<div class="name">
								<div class="brief" id="playerdata">
									<ul>
										<li>
											<span style="font-size:50px;color:#15467a;">${player.pName}</span>
											<img class="box-img" src="img/zan.png" onclick="like(${player.pId})"/>
										
												<span class="zan-number" id="good${player.pId }">${player.pLike}</span>
											
										</li>
											<div class="vspace" style="height:40px;"></div>
										<li>
											<span class="item">球队：</span>
											<span class="val">${player.pTname}</span>
										</li>
										<div class="vspace" style="height:30px;"></div>
										<li>
											<span class="item">出生日期：</span>
											<span class="val">${player.pBirth}</span>
										</li>
										<div class="vspace" style="height:30px;"></div>
										<li>
											<span class="item">身高：</span>
											<span class="val">${player.pHeight}米</span>
										</li>
										<div class="vspace" style="height:30px;"></div>
										<li>
											<span class="item">体重：</span>
											<span class="val">${player.pWeight}公斤</span>
										</li>
										<div class="vspace" style="height:30px;"></div>
										<li>
											<span class="item">球衣号：</span>
											<span class="val">${player.pNumber}</span>
										</li>
										<div class="vspace" style="height:30px;"></div>
										<li>
											<span class="item">场上位置：</span>
											<span class="val">${player.pPosition}</span>
										</li>
										<div class="vspace" style="height:30px;"></div>
									</ul>
								</div>
							</div>
							</div>
								<div class="right">
									<div class="star" id="star">
										<img src="${player.pPic}" alt=""/>
										<!--模糊效果-->
										<span class="cover"></span>
									</div>
								</div>
							</div>
						</div>
						<div class="ELMTbGFXR7xZpGyitu2HkRXy180522">
							<div class="vspace_jj"></div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<!--引入jquery-->
<script src="js/jquery.js"></script>

<script type="text/javascript">
			//点赞
			function like(pId) {
				document.getElementById("good"+pId).innerText=parseInt(document.getElementById("good"+pId).innerText)+1;
				$.ajax({
					url:"updateLike",
					type:"post",
					data:{
						"pId":pId
					}
				});
					
			}
	</script>
</body>
</html>