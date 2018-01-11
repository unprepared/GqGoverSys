<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=device-width,initial-scale=1">
        <title>共青政务系统</title>
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.min.css" />
    </head>
    <style>
    	.head{
    		
    	}
    	#box{
    		width:300px;
    		height: 200px;
    		background: #ededed;
    		margin: 0 auto;
    		border-radius: 5px;
    		margin-top: 50px;
    		box-shadow: 0px 1px 0px rgba(0,0,0,0.4);
    		padding-top: 20px;
    	}
    	.link-a a,.link-b a{
    		display: block;
    		width:250px;
    		height: 40px;
    		line-height: 40px;
    		text-align: center;
    		font-size: 20px;
    		margin:25px;
    		background: #337AB7;
    		color: #DAF1FC;
    		text-decoration: none;
    		border-radius: 5px;
    		cursor:pointer;
    	}
    </style>
    <body>
    	<h2 class="head text-center"><strong>港澳团队旅游签注申请</strong></h2>
    	<div id="box">
    		<div class="link-a"><a onclick="tz1()">申请二次签注</a></div>
    		<div class="link-b"><a onclick="tz2()">查看申请记录</a></div>
    	</div>
    	<script>
    		function tz1(){
    			window.location.href="/GqGoverSys/SecondVisaJsp";
    		}
    		function tz2(){
    			window.location.href="/GqGoverSys/SecondSkipJsp";
    		}
    	</script>
 	</body>
</html>