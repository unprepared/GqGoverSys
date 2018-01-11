<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width,initial-scale=1">
        <title>共青政务系统</title>
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.min.css" />
       	<style>
       		.container{
       			margin-top: 50px;
       		}
       		.bt{
       			font-size: 22px;
       			font-weight: bold;
       		}
       		.sh{
       			background: #ededed;
       			margin: 30px 0;
       			padding: 20px 0;
       			font-size: 20px;
       		}
       		.state{
       			color: red;
       		}
       		#jf{
       			display: none;
       		}
       		#jf a{
       			display: block;
       			
       			text-decoration: none;
       			width:200px;
       			margin: 0 auto;
       			height: 30px;
       			line-height: 30px;
       			background:cornflowerblue;
       			color: #fff;
       			margin-top: 20px;
       			
       		}
       		#jf a:hover{
       			
       			background:dodgerblue ;
       		}
       		#remark,.xgAndAmMuch{
       			font-size:16px;
       			
       		}
       		
       	</style>
    </head>
    <body>
    	<div class="container">
    		<div class="row bt text-center">
    			二次签注申请记录
    		</div>
    		<div class="row sh">
    			<div class="col-xs-6 text-center">
			    	<strong>二次签注申请</strong>
		    	</div>
		    	<div class="col-xs-6 text-center">
			    	<strong class="state"></strong>
		    	</div>
	    	</div>
	    	<div id="remark"></div>
	    	<div class="xgAndAmMuch"></div>
	    	<div id="jf" class="text-center"><a href="#">点击进入缴费窗口</a></div>
    	</div>
    	<script type="text/javascript" src="js/jquery-1.9.1.min.js" ></script>
    	<script type="text/javascript">
    		$(function(){
    			var sCode = localStorage.getItem("sCode");
    			$.ajax({
    				url:'/GqGoverSys/secondVisa/queryState',
    				type:'POST',
    				data:{'sCode':sCode},
    				dataType:'json',
    				beforreSend:loadFunction,//加载执行方法
    				success:succFunction,//成功执行方法
    				error:erryFunction//错误执行方法
    			})
    			function loadFunction(){
    				//$("#box").html('加载中...');
    			}
    			function erryFunction(){
    				alert("error");
    			}
    			function succFunction(tt){
    				console.log(tt);
    				var state=tt.resultData.state;
    				var remark=tt.resultData.remark;
    				var xgAndAmMuch=tt.resultData.xgAndAmMuch;
    				console.log(state);
    				if(state==0){
    					console.log("未审核");
    					$('.state').html('未审核');
    				}else if(state==1){
						console.log("审核成功,请前往缴费窗口缴费");
						$('.state').html('审核成功');
						$('.xgAndAmMuch').html('本次申请共需缴费'+xgAndAmMuch+'元。');
						$("#jf").show();
    				}else if(state==2){
    					console.log("审核失败");
    					$('.state').html('审核失败');
    					$('#remark').html("审核失败原因："+remark);
    					//remark显示错误显示
    				}
    				}
//  				//var jsontt=eval(tt);
//  				var errCode=tt.errcode;
//  				var cCode=tt.resultData.cCode;
//  				var massage=tt.massage;
//					var tt="";
//					tt+=errCode+"---"+cCode+"---"+massage+"<br>";
//  				$("#box").html('');
//  				$("#box").html(tt);
    		
    			
    		})
    	</script>
 	</body>
</html>