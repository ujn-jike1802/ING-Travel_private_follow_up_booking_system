<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
	<link rel="shortcut icon" href="images/form.svg" type="image/x-icon">
	<title>Form</title> 
	<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">  
	<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
      <link rel="stylesheet" href="css/first.css">
    <link rel="stylesheet" href="css/form.css">
    <style type="text/css" media="screen">
        #table td+td{
           text-align: left;
           padding: 5px 5px 5px 10px;
        }
        #table td{
            text-align: right;
            padding: 5px 10px 5px 5px;
        }
    </style>
</head>
    
<body>
    
    <div class="container" style="background-image: url(images/wood1.png);">
<div class="jumbotron text-center sky" style="margin-bottom:0">
            <div class="clouds_one"></div>
            <div class="clouds_two"></div>
            <div class="clouds_three"></div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <nav class="navbar navbar-default navbar-fixed-top" role="navigation" style="background-color: #565656;">
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

    <div class="row clearfix" >
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    Information <small>-about our team</small>
                </h1>
            </div>
            <div class="row clearfix" style="background-image: url(images/leaves.png);border-radius: 20px;">
                <div class="col-md-12 column"style="border:3px solid #565656;
                border-radius: 30px;margin: auto;">
                    <div class="tabbable" id="tabs-210597" >
                        <ul class="nav nav-tabs">
                            <li class="active">
                                 <a href="#panel-548574" data-toggle="tab">简介</a>
                            </li>
                            <li>
                                 <a href="#panel-891903" data-toggle="tab">自然景物</a>
                            </li>
                            <li>
                                 <a href="#panel-900000" data-toggle="tab">人文社区</a>
                            </li>
                            <li>
                                 <a href="#panel-900001" data-toggle="tab">提出建议</a>
                            </li>
                             <li>
                                 <a href="feedback.jsp" target="new_block">我要推荐</a>
                            </li>
                        </ul>
                        <div class="tab-content" style="line-height: 3em;text-indent: 2em;">
                            <div class="tab-pane active jianjie" id="panel-548574" style="margin: 5px 250px;">
                                <p>
                                    本站致力于为顾客提供私人旅游摄影服务，总体上分为两类场景:自然风景场地摄影，人文社区场地摄影。请预约的顾客尽量把您的信息完整的发送给我们，本站担保不会泄露您的个人隐私，请您放心，在此欢迎您的光临。
                                </p>
                            </div>
                            <div class="tab-pane jianjie" id="panel-891903"  style="margin: 5px 250px;">
                                <p>
                                   自然风景区摄影师是专门在户外自然风景区进行摄影工作的专业人士。可以为您提供诸多摄影拍照服务，如景区摆拍，旅游抓拍，短视频长视频制作以及力所能及之类的拍摄任务等。
                                </p>
                            </div>
                            <div class="tab-pane jianjie" id="panel-900000"  style="margin: 5px 250px;">
                                <p>
                                    人文社区摄影师是专门在公共室内或街区进行摄影的专业人士。可以为您提供诸多摄影拍照服务，如街道抓拍，合法室内(类咖啡厅)摆拍，短视频长视频制作以及力所能及的拍摄任务等。
                                </p>
                            </div>
                            <div class="tab-pane jianjie" id="panel-900001">
                   <form role="form" action="#" style="margin: auto;">
         <table id="table">
        <tr><td>姓名:</td><td width="750px"><input type="text" name="name" placeholder="" required></td></tr>
        <tr><td>电话:</td><td><input type="number" name="number" required placeholder=""></td></tr>
        <tr><td>邮箱:</td><td><input type="email" name="email" required placeholder="" required></td></tr>
        <tr><td><label>您的建议:</label></td><td>
            <textarea style="width: 300px; height: 60px;" placeholder="请在此输入您的留言!"></textarea>
            </td></tr>
        <tr><td height="60px"  width="180px"><input type="submit" name="提交" value="提交"/></td><td  height="60px"><input type="reset" name="重置" id="reset1"/>&nbsp;&nbsp;&nbsp;请加入我们的讨论QQ群或关注微信公众号：***</td></tr>
    </table>
                    </form>
                            </div>
                        </div>
                    </div>
                </div>

               
            </div>
        </div>
    </div>

        </div>
         <div class="row clearfix" style="background-image: url(images/wood1.png);border-radius: 15px;margin-top: 25px;
  ">
        <div class="col-md-12 column" align="center">
            <ul class="breadcrumb" style="background-color: white;">
                        <li class="active">
                             当前路径
                        </li>

                        <li class="active">
                            <a href="first.html">首页</a>
                        </li>

                        <li class="active">
                            <a href="Form.jsp">信息反馈</a>
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
