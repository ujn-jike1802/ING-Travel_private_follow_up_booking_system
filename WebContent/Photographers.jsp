<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
    <link rel="shortcut icon" href="images/personal.svg" type="image/x-icon">
    <title>Photographers</title> 
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">  
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/first.css">
    <link rel="stylesheet" type="text/css" href="css/graphers.css">
    <style type="text/css" media="screen">
.single-member{width: 280px; float: left; margin: 30px 2.5%; background-color: #fff; text-align: center; position: relative;}
        .single-member{width: 280px; float: left; margin: 30px 2.5%; background-color: #fff; text-align: center; position: relative;}
.member-image img{max-width: 100%; vertical-align: middle;}
h3 {font-size: 24px; font-weight: normal; margin: 10px 0 0; text-transform: uppercase;}
h5 {font-size: 16px; font-weight: 300; margin: 0 0 15px; line-height: 22px;}
p {font-size: 14px; font-weight: 300; line-height: 22px; padding: 0 30px; margin-bottom: 10px;}
.social-touch a{display: inline-block; width: 27px; height: 26px; vertical-align: middle; margin: 0 2px; background-image: url(../images/social-icons.png); background-repeat: no-repeat; opacity: 0.7; transition: 0.3s;}
.social-touch a:hover{opacity: 1; transition: 0.3s;}
.fb-touch{background-position: 0 0;}
.tweet-touch{background-position: -35px 0;}
.linkedin-touch{background-position: -71px 0;}
.icon-colored .fb-touch{background-position: 0 -27px;} 
.icon-colored .tweet-touch{background-position: -35px -27px;}
.icon-colored .linkedin-touch{background-position: -71px -27px;}
.effect-6{max-height: 289px; min-height: 289px; overflow: hidden;}
.effect-6 .member-info {background-color: #fff; position: absolute; width: 100%; top: 0; left: 0; height: 82px; transition: 0.3s; z-index: 2;}
.effect-6 .member-image{margin-top: 82px; float: left; width: 100%; position: relative; transition: 0.3s; z-index: 4; overflow: hidden;}
.effect-6 .member-image img{width: 100%;}
.effect-6:hover .member-info{height: 215px; transition: 0.3s; z-index: 6; border-radius: 0 0 50% 50%; overflow: hidden;}
.effect-6:hover .member-image{margin-top: 100px; transition: 0.3s; border-radius: 0;}
.effect-6{
    border-radius: 15px;
    border: 2px solid yellow;
    border-width: 7px;}
    
.container1 {
    height: 50px;
    width: 800px;
    margin-right: 20px;
    margin-top: 40px;
}
.parent {
    position: relative;
}
.search {
    width: 300px;
    height: 40px;
    border-radius: 18px;
    outline: none;
    border: 1px solid #ccc;
    padding-left: 20px;
    position: absolute;
}
.btn {
    height: 35px;
    width: 35px;
    position: absolute;
    background: url("images/topbar.png") no-repeat -2px -99px;
    top: 6px;
    left: 285px;
    border: none;
    outline: none;
    cursor: pointer;
}

/* effect-5 css */
.port-5{float: left; width: 100%; position: relative; overflow: hidden; text-align: center; border: 4px solid rgba(255, 255, 255, 0.9); overflow: visible;}

.port-5.effect-1{z-index: 9;}
.port-5.effect-1 img{transition: 0.5s;}
.port-5.effect-1:hover img{transform: scale(0.5) translateX(-100%); position: relative; z-index: 9; border: 6px solid rgba(255, 255, 255, 0.9);}
.port-5.effect-1 .text-desc{transform: translateX(100%); opacity: 0; padding: 40px 20px 20px 90px; transition: 0.5s;}
.port-5.effect-1:hover .text-desc{transform: translateX(0px); opacity: 1;}

.port-5.effect-2{z-index: 10;}
.port-5.effect-2 img{transition: 0.5s; transform: none);}
.port-5.effect-2:hover img{transform: scale(0.5) translateY(100%); position: relative; z-index: 9; border: 6px solid rgba(255, 255, 255, 0.9);}
.port-5.effect-2 .text-desc{transform: translateY(-100%); opacity: 0; padding: 20px; transition: 0.5s;}
.port-5.effect-2:hover .text-desc{transform: translateY(0px); opacity: 1;}

.port-5.effect-3 img{transition: 0.5s;}
.port-5.effect-3:hover img{transform: scale(0.5) translateX(100%); position: relative; z-index: 9; border: 6px solid rgba(255, 255, 255, 0.9);}
.port-5.effect-3 .text-desc{transform: translateX(-100%); opacity: 0; padding: 40px 90px 20px 20px; transition: 0.5s;}
.port-5.effect-3:hover .text-desc{transform: translateX(0px); opacity: 1;}
/* effect-5 css end */

/*= Media Screen CSS
==================== */
@media only screen and (max-width: 1090px){
	ul{width: 340px; margin: 0 auto;}
	li{width: 100%; margin: 20px 0;}
	.port-5.effect-1 {z-index: 19;}
}

@media only screen and (max-width: 360px){
	ul{width: 300px;}
	.text-desc{padding: 7px;}
	.port-5.effect-1 .text-desc{padding: 13px 20px 20px 90px;}
	.port-5.effect-2 .text-desc{padding: 10px;}
	.port-5.effect-3 .text-desc{padding: 16px 90px 20px 20px;}
}
/*= Media Screen CSS End
    </style>
</head>

<body>
        <div class="container" style="background-image: url(images/wood1.png);">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <nav class="navbar navbar-default navbar-fixed-top" role="navigation" style="background-color: rgb(0,0,0,0.2);">
                <div class="navbar-header single">
                     <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"> <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button> 
                     <span class="Shouye">
                     <a class="navbar-brand shouye" href="first.html" ><span style="color: white;">首页</span></a></span>
                </div>
                
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">       
                    <ul class="nav navbar-nav navbar-right navblock">
                       

                   
                          <li>
                             <a href="ComSen.html"><span class="block" style="color: white;">旅游贴士</span></a>
                        </li>
                        <li>
                             <a href="showattraction.jsp"><span class="block" style="color: white;">景点推荐</span></a>
                        </li>
                       <li>
                             <a href="Photographers.jsp"><span class="block" style="color: white;">预约摄影</span></a>
                        </li>
                        <li>
                             <a href="Form.jsp"><span class="block" style="color: white;" >信息反馈</span></a>
                        </li>
                        
                    </ul>
                </div>      
            </nav>
        </div>
    </div>
    <div style="height: 80px;">
        
    </div>
              <div class="container1">
                         <form action="" class="parent">
                           <input type="text" class="search" placeholder="搜索摄影师">
                         <input type="button" name="" id="" class="btn">
                        </form>
              </div>

    <div class="jumbotron text-center sky">
            <div class="clouds_one"></div>
            <div class="clouds_two"></div>
            <div class="clouds_three"></div>
       
        <div class="row clearfix">
        <div class="col-md-12 column" style="text-align:center;">
                   <!-- 代码部分 begin -->
           <div class="container2" align="center">
                   <!-- Team members structure start -->
	               <div class="team-members row">
		           <div class="single-member effect-1">
		         	<div class="member-image">
					<img src="images/member_140x145.jpg" alt="Member">
					</div>
						<div class="member-info">
						<h3>Sophia</h3>
						<h5>ShowGilr</h5>
						<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
				<div class="social-touch">
					<a href="#"><img src="images/yuyuea.png"></a>
				</div>
			</div>
		</div>
		
	</div>
<!-- Team members structure start -->
</div>
<!-- 代码部分end -->
                   </div>  
             
       </div>
        
       <div class="row clearfix"  style="margin:20px 20px 20px 0px;">
		<div class="col-md-12 column">
			<div class="row clearfix">
				<div class="col-md-6 column">
				
				<div class="port-5 effect-1">
		                	<div class="image-box">
		                    	<img src="images/img-1.jpg" alt="Image-1">
		                    </div>
		                    <div class="text-desc">
		                    	<h3>Your Title</h3>
		                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
		                    	<a href="#" class="btn">Learn more</a>
		                    </div>
		                </div>
				</div>
				<div class="col-md-6 column">
				<div class="port-5 effect-1">
		                	<div class="image-box">
		                    	<img src="images/img-1.jpg" alt="Image-1">
		                    </div>
		                    <div class="text-desc">
		                    	<h3>Your Title</h3>
		                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
		                    	<a href="#" class="btn">Learn more</a>
		                    </div>
		                </div>
				</div>
			</div>
		</div>
	</div>
       
       </div>
      
       
       
    <div class="row clearfix" style="background-image: url(images/wood1.png);
  ">
        <div class="col-md-12 column" align="center">
            <ul class="breadcrumb" style="background-color: white;">
                        <li  class="active">
                             当前路径
                        </li>
                        <li  class="active">
                            <a href="first.html">首页</a>
                        </li>
                        <li  class="active">
                            <a href="#">预约摄影</a>
                        </li>
                    </ul>
            <div class="row clearfix">
                <div class="col-md-6 column" align="center">
                   <p style="line-height: 10px;"> <address> <strong>友情链接</strong>
                        <br/><a href="https://www.ujn.edu.cn" title="">校园官网: https://www.ujn.edu.cn/</a>
                        <br/><a href="https://ujn-lh.github.io/" title="">个人博客: https://ujn-lh.github.io/</a>
                        <br/><a href="https://aidn.jp/mikutap/" title="">娱乐放松: https://aidn.jp/mikutap/</a></address></p>
                </div>
                <div class="col-md-6 column" align="center">
                    <p><address> <strong>详细参照</strong><br/>School:China-UJN<br />信息科学与工程学院<br/><abbr title="Phone">Phone:</abbr>19861823401 <br>QQ：1181576074<br>&copy;2020&nbsp;济南大学</address>
                        </p>
                </div>
                
            </div>
        </div>
     </div>
 </div>
</body>
</html>