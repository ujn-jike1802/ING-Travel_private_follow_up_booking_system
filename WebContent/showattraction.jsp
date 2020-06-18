<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
	<link rel="shortcut icon" href="images/humanities.svg" type="image/x-icon">
	<title>Humanities</title> 
	<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">  
	<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/first.css">
    <link rel="stylesheet" href="css/humanities.css">
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <link rel="stylesheet" type="text/css" href="css/starability.css"/>
    <style type="text/css" media="screen">
        .pic1,.pic2,.pic3{
             transition: all;
    transition-duration: 0.5s;
    -webkit-transition: all;
    -webkit-transition-duration: 0.5s;
        }
        .pic1:hover{
            transform: skew(-15deg);
    -ms-transform: skew(-15deg); /* IE 9 */
    -webkit-transform: skew(-15deg);/* Safari and Chrome */
        }
        .pic2:hover{
            transform: rotate(360deg);
    -ms-transform: rotate(360deg); /* IE 9 */
    -webkit-transform: rotate(360deg); /* Safari and Chrome */
        }
        .pic3:hover{
           transform: rotate(360deg);
    -ms-transform: rotate(360deg); /* IE 9 */
    -webkit-transform: rotate(360deg); /* Safari and Chrome */
        }
.port-5.effect-2{z-index: 10;}
.port-5.effect-2 img{transition: 0.5s; transform: none);}
.port-5.effect-2:hover img{transform: scale(0.5) translateY(100%); position: relative; z-index: 9; border: 6px solid rgba(255, 255, 255, 0.9);}
.port-5.effect-2 .text-desc{transform: translateY(-100%); opacity: 0; padding: 20px; transition: 0.5s;}
.port-5.effect-2:hover .text-desc{transform: translateY(0px); opacity: 1;}
.btn{display: inline-block; padding: 5px 10px; font-size: 14px; color: #fff; border: 2px solid #4d92d9; background-color: #4d92d9; text-decoration: none; transition: 0.4s;}
.btn:hover{background-color: transparent; color: #4d92d9; transition: 0.4s;}
@media only screen and (max-width: 360px){
    .port-5.effect-2 .text-desc{padding: 10px;}

}
    </style>
</head>

<body>
   <div class="container" style="background-image: url(images/wood1.png); margin-bottom: 0;">
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
                             <a href="Humanities.html"><span class="block" style="color: white;">景点推荐</span></a>
                        </li>
                       <li>
                             <a href="Gay.html"><span class="block" style="color: white;">预约摄影</span></a>
                        </li>
                        <li>
                             <a href="Form.html"><span class="block" style="color: white;" >信息反馈</span></a>
                        </li>
                        
                    </ul>
                </div>      
            </nav>
        </div>

 

 

    <div class="jumbotron text-center sky" style="height: 50px">
            <div class="clouds_one"></div>
            <div class="clouds_two"></div>
            <div class="clouds_three"></div>
    </div>   

  
<div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    人文社区 <small><a href="Natural.html" title="">自然风景</a></small>
                </h1>
                    
            </div>
            <div class="row clearfix">
                <div class="col-md-6 column">
                    <img alt="140x140" src="images/luanzhougucheng.jpg" style="width: 100%; margin:5px;"/> 
                    <address align="center"> <strong>中国河北省唐山市滦州市滦州古城</strong> </address>
                   <table class="table table-condensed table-striped">
                <tbody>
                    <tr>
                       <td>
                            开放时间:
                        </td>
                        <td>
                            全天
                        </td>
                        
                        <td>
                            建议游玩时长:
                        </td>
                        <td>
                 3小时
                        </td>
                    </tr>
                    
                    <tr class="success">
                        <td>
                            适合游玩季节:
                        </td>
                        <td>
                            四季皆可
                        </td>
                        <td>
                            景区等级:
                        </td>
                        <td>
                 AAAA
                        </td>
                    </tr>
                </tbody>
            </table>
                </div>
                <div class="col-md-6 column">
                      <div class="row">
                        <div class="col-md-12">
                            
                <video width="90%" controls>
                 <source src="movie.mp4" type="video/mp4">
                 <source src="movie.ogg" type="video/ogg">
                您的浏览器不支持 HTML5 video 标签。
                </video>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-4">
                            <div class="thumbnail">
                                <img alt="300x200"class="pic1" src="images/guchengshaokao.jpg"style="width: 90%; margin:auto;" />
                                <div class="caption"align="center">
                                    <h3>
                                        攻略一：烧烤
                                    </h3>
                                    
                                </div>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <div class="thumbnail">
                                <img alt="300x200"class="pic2" src="images/guchengdengjie.jpg"style="width: 90%; margin:auto;"/>
                                <div class="caption" align="center">
                                    <h3>
                                        攻略二:灯节
                                    </h3>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <div class="thumbnail">
                                <img alt="300x200" class="pic3" src="images/guchegnmeishi.jpg"style="width: 90%; margin:auto;"/>
                                <div class="caption" align="center">
                                    <h3>
                                        攻略三:古城美食
                                    </h3>
                                </div>
                            </div>
    <fieldset class="starability-checkmark"> 
          <legend>您的评价:</legend>

          <input type="radio" id="rate5-6" name="rating" value="5" />
          <label for="rate5-6" title="Amazing">5 stars</label>

          <input type="radio" id="rate4-6" name="rating" value="4" />
          <label for="rate4-6" title="Very good">4 stars</label>

          <input type="radio" id="rate3-6" name="rating" value="3" />
          <label for="rate3-6" title="Average">3 stars</label>

          <input type="radio" id="rate2-6" name="rating" value="2" />
          <label for="rate2-6" title="Not good">2 stars</label>

          <input type="radio" id="rate1-6" name="rating" value="1" />
          <label for="rate1-6" title="Terrible">1 star</label>
        </fieldset>
    </form>
                        </div>
                    </div>
                  
                </div>
            </div>
            
        </div>
    </div>
    
    	<div style="text-align:center; margin:20px;">
        	    
        		
                            首页	      上一页        当前页数   一共多少页   下一页      尾页
               <form method="POST" action="selectAll.yb?do=no">
                 <input type="number" name="page" min="1"  max=7 step="1" />
                 <input type="submit" value="跳转"/>
                </form>
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
                            <a href="#">人文社区</a>
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
    </div>
</body>
</html>
