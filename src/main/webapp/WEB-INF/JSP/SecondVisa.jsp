<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<meta content="yes" name="apple-mobile-web-app-capable">
<meta name="viewport"content="width=device-width,height=device-height,maximum-scale=1.0,user-scalable=no">
<title>共青政务系统</title>
<link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.min.css" />
<link rel="stylesheet" href="css/fuqi.css" />
<style>
form.registration-form fieldset {
	display: none;
	padding: 0 10px;
}
</style>
</head>

<body>
	<div class="container">
		<form role="form"action="/GqGoverSys/secondVisaController"method="post" class="registration-form" id="form"enctype="multipart/form-data">

			<fieldset>
				<div class="form-top">
					<div class="form-top-center">
						<h3 class="text-center">港澳团队旅游签注申请条例：</h3>
						<strong>一、申请协议书</strong>
						<p>1、申请人必须如实、正确填写申请表的内容。</p>
						<p>2、网上申请办证时限为7个工作日（不含速递时间）。</p>
						<p>3、邮政速递能投递的省份均在服务范围内。</p>
						<p>4、网上申请一旦获批并制作证件，不管申请人是否使用本次证件，均须按规定交纳证件费。</p>
						<p>5、已向公安部门通报出境备案的国家机关工作人员、国有企业单位领导及银行、金融部门工作人，须提交工作单位按人事管理权限出具的书面意见，所申请的港澳签注前往地、次数、时限必须与单位出具的书面意见一致。</p>
						<p>6、往来港澳通行证内不得同时拥有两个（含）以上同一前往地的有效签注。</p>
						<p>7、所申请签注的有效期不能超过往来港澳通行证有效期。</p>
						<p>8、每次申请成功都需缴纳相应的签注费用，收费方式只接受网银支付。</p>
					</div>
					<div class="form-top-right">
						<i class="fa fa-key"></i>
					</div>
				</div>
				<div class="form-bottom text-center">
					<div class="form-group">
						<input type="checkbox" class="form-read" id="ck" /> <label
							for="form-read">我已阅读以上协议</label>

					</div>
					<button type="button" class="btn btn-primary btn-next" id="bt"
						disabled />
					下一步
					</button>

				</div>
			</fieldset>

			<fieldset>
				<div class="form-top">
					<div class="form-top-left">
						<h3>第一步</h3>
						<p>请输入你的个人基本信息:</p>
					</div>
					<div class="form-top-right">
						<i class="fa fa-key"></i>
					</div>
				</div>
				<div class="form-bottom">


					<div class="row">

						<div class="col-xs-6">
							<div class="form-group">
								<label for="form-firstName">姓氏</label> <input type="text"
									name="firstName" placeholder="请输入您的姓"
									class="form-firstName form-control" id="form-firstName" value="小"/>
							</div>
						</div>
						<div class="col-xs-6">
							<div class="form-group">
								<label for="form-lastName">名字</label> <input type="text"
									name="lastName" placeholder="请输入您的名"
									class="form-lastName form-control" id="form-lastName" value="明"/>
							</div>
						</div>
					</div>




					<div class="row">
						<div class="col-xs-6">
							<div class="form-group">
								<label for="form-surname">拼音姓</label> <input type="text"
									name="surname" placeholder="请输入拼音姓"
									class="form-surname form-control" id="form-surname" value="xiao" />
							</div>
						</div>
						<div class="col-xs-6">
							<div class="form-group">
								<label for="form-spellName">拼音名</label> <input type="text"
									name="spellName" placeholder="请输入拼音名"
									class="form-spellName form-control" id="form-spellName"value="ming" />
							</div>
						</div>
					</div>
					
					<div class="row">
						<div class="col-xs-6">
							<div class="form-group">
								<label for="form-sex">性别</label><br /> <select name="sex"
									class="form-sex form-control" id="form-sex">
									<option>男</option>
									<option>女</option>
								</select>
							</div>
						</div>
						<div class="col-xs-6">
							<div class="form-group">
								<label for="form-nation">名族</label><br /> <select name="nation"
									class="form-control" id="form-nation">

									<option selected="selected" value="汉族">汉族</option>
									<option value="蒙古族">蒙古族</option>
									<option value="回族">回族</option>
									<option value="藏族">藏族</option>
									<option value="维吾尔族">维吾尔族</option>
									<option value="维吾尔族">维吾尔族</option>
									<option value="苗族">苗族</option>
									<option value="彝族">彝族</option>
									<option value="壮族">壮族</option>
									<option value="布依族">布依族</option>
									<option value="朝鲜族">朝鲜族</option>
									<option value="满族">满族</option>
									<option value="侗族">侗族</option>
									<option value="瑶族">瑶族</option>
									<option value="白族">白族</option>
									<option value="土家族">土家族</option>
									<option value="哈尼族">哈尼族</option>
									<option value="哈萨克族">哈萨克族</option>
									<option value="傣族">傣族</option>
									<option value="黎族">黎族</option>
									<option value="傈僳族">傈僳族</option>
									<option value="佤族">佤族</option>
									<option value="畲族">畲族</option>
									<option value="高山族">高山族</option>
									<option value="拉祜族">拉祜族</option>
									<option value="水族">水族</option>
									<option value="东乡族">东乡族</option>
									<option value="纳西族">纳西族</option>
									<option value="景颇族">景颇族</option>
									<option value="柯尔克孜族">柯尔克孜族</option>
									<option value="土族">土族</option>
									<option value="达斡尔族">达斡尔族</option>
									<option value="仫佬族">仫佬族</option>
									<option value="羌族">羌族</option>
									<option value="布朗族">布朗族</option>
									<option value="撒拉族">撒拉族</option>
									<option value="毛南族">毛南族</option>
									<option value="仡佬族">仡佬族</option>
									<option value="锡伯族">锡伯族</option>
									<option value="阿昌族">阿昌族</option>
									<option value="普米族">普米族</option>
									<option value="塔吉克族">塔吉克族</option>
									<option value="怒族">怒族</option>
									<option value="乌孜别克族">乌孜别克族</option>
									<option value="俄罗斯族">俄罗斯族</option>
									<option value="鄂温克族">鄂温克族</option>
									<option value="德昂族">德昂族</option>
									<option value="保安族">保安族</option>
									<option value="裕固族">裕固族</option>
									<option value="京族">京族</option>
									<option value="塔塔尔族">塔塔尔族</option>
									<option value="独龙族">独龙族</option>
									<option value="鄂伦春族">鄂伦春族</option>
									<option value="赫哲族">赫哲族</option>
									<option value="门巴族">门巴族</option>
									<option value="珞巴族">珞巴族</option>
									<option value="基诺族">基诺族</option>
								</select> </select>
							</div>
						</div>
					</div>
					<div class="form-group">
						<label for="form-brithplace">出生地</label>

						<div class="row" data-toggle="distpicker" data-autoselect="3"
							data-province="浙江省">
							<div class="col-xs-4">

								<select name="bpProvince" class="form-control"></select>


							</div>
							<div class="col-xs-4">
								<select name="bpCity" class="form-control"></select>


							</div>
							<div class="col-xs-4">
								<select name="bpCounty" class="form-control"></select>

							</div>
						</div>
					</div>
					<div class="form-group">
						<label for="form-hkPlace">户口所在地</label>
						<div class="row" data-toggle="distpicker" data-autoselect="4"
							data-province="安徽省">
							<div class="col-xs-4">

								<select name="hkProvince" class="form-control"></select>


							</div>
							<div class="col-xs-4">
								<select name="hkCity" class="form-control"></select>


							</div>
							<div class="col-xs-4">
								<select name="hkCounty" class="form-control"></select>

							</div>
						</div>
					</div>
					<div class="form-group">

						<label for="form-hkDetails">详细户口所在地</label> <input type="text"
							name="hkDetails" placeholder="请输入您的详细户口所在地"
							class="form-hkDetails form-control" id="form-hkDetails" value="江西南昌"/>
					</div>
					<button type="button" class="btn btn-primary btn-previous pull-left">上一步</button>
					<button type="button" class="btn btn-primary btn-next pull-right">下一步</button>



				</div>
			
			
				
			</fieldset>

			<fieldset>
				<div class="form-top">
					<div class="form-top-left">
						<h3>第二步</h3>
						<p>请按要求输入信息:</p>
					</div>
					<div class="form-top-right">
						<i class="fa fa-key"></i>
					</div>
				</div>
				<div class="form-bottom">
					<div class="form-group">
						<label for="form-idCardNo">身份证号码</label> <input type="text"
							name="idCardNo" placeholder="请输入您的身份证号码"
							class="form-idCardNo form-control" id="form-idCardNo" value="362329199611126651"/>
					</div>
					<div class="form-group">
						<label for="form-brithtime">出生年月</label>
						<div class="row">
							<div class="col-xs-4">
								<select id="sel_year" class="form-year form-control"
									id="form-year" rel="2017" name="year"></select>
							</div>
							<div class="col-xs-4">
								<select id="sel_month" class="form-month form-control col-xs-4"
									id="form-month" rel="12" name="month"></select>
							</div>
							<div class="col-xs-4">
								<select id="sel_day" class="form-day form-control col-xs-4"
									id="form-day" rel="11" name="day"></select>
							</div>
						</div>
					</div>
					<div class="form-group">
						<label for="form-telphone">本人联系号码</label> <input type="text"
							name="telphone" placeholder="请输入您的联系号码"
							class="form-telphone form-control" id="form-telphone" value="15270386232"/>
					</div>
					<div class="form-group">
						<label for="form-uName">紧急联系人</label> <input type="text"
							name="uName" placeholder="请填写紧急联系人"
							class="form-uName form-control" id="form-uName" value="小牧"/>
					</div>
					<div class="form-group">
						<label for="form-uTelphone">紧急联系人手机号码</label> <input type="text"
							name="uTelphone" placeholder="请填写紧急联系人手机号码"
							class="form-uTelphone form-control" id="form-uTelphone" value="15270386232"/>
					</div>


					<button type="button"
						class="btn btn-primary btn-previous pull-left">上一步</button>
					<button type="button" class="btn btn-primary btn-next pull-right">下一步</button>
				</div>
			</fieldset>
			<fieldset>
				<div class="form-top">
					<div class="form-top-left">
						<h3>第三步</h3>
						<p>请输入收件人相关信息:</p>
					</div>
					<div class="form-top-right">
						<i class="fa fa-key"></i>
					</div>
				</div>
				<div class="form-bottom">
					<div class="row">
						<div class="col-xs-6">
							<div class="form-group">
								<label for="form-recipient">收件人</label> <input type="text"
									name="recipient" placeholder="收件人姓名"
									class="form-recipient form-control" id="form-recipient" value="小艾"/>
							</div>
						</div>
						<div class="col-xs-6">
							<div class="form-group">
								<label for="form-postcode">邮编</label> <input type="text"
									name="postcode" placeholder="请填写邮编号"
									class="form-postcode form-control" id="form-postcode" value="333333" />
							</div>
						</div>
					</div>
					<div class="form-group">
						<label for="form-rTelphone">收件人联系号码</label> <input type="text"
							name="rTelphone" placeholder="请输入收件人联系号码"
							class="form-rTelphone form-control" id="form-rTelphone" value="15270386232" />
					</div>
					<div class="form-group">
						<label for="form-rAddress">收件详细地址</label> <input type="text"
							name="rAddress" placeholder="请填写收件人详细地址"
							class="form-rAddress form-control" id="form-rAddress" value="江西警察学院"/>
					</div>
					<div class="form-group">
						<strong>领取地址：</strong>
						<p>(江西省共青城市发展大道和共安大道延伸段交汇处市民服务中心六号楼三楼共青城市公安局出入境)</p>
					</div>
					<button type="button"
						class="btn btn-primary btn-previous pull-left">上一步</button>
					<button type="button"
						class="btn btn-primary btn-next btn-yl pull-right">下一步</button>
				</div>
			</fieldset>
			<fieldset>
				<div class="form-top">
					<div class="form-top-left">
						<h3>第四步</h3>
						<p>请选择签注类型及次数:</p>
					</div>
					<div class="form-top-right">
						<i class="fa fa-twitter"></i>
					</div>
				</div>
				<div class="form-bottom">
					<div class="row form-group">
						<div class="col-xs-3">
							<label for="form-fx">类型</label><br /> <input type="checkbox"
								name="visaType-xg" id="form-xg" value="1" />香港
						</div>
						<div class="col-xs-3">
							<label for="form-cs">次数</label><br /> 
							<select id="select-xg" onchange="change()" disabled name="timeType-xg">
								<option value="" selected disabled></option>
								<option value="1">3月1次</option>
								<option value="2">1年1次</option>
								<option value="3">1年2次</option>

							</select>
						</div>
						<div class="col-xs-3">
							<label>费用</label><br /> <strong id="cost1"></strong>
						</div>
						<div class="col-xs-3">
							<label>总费用</label><br /> <strong id="heji"></strong>
						</div>
					</div>
					<div class="row form-group">
						<div class="col-xs-3">

							<input type="checkbox" name="visaType-am" id="form-am" value="2"/>澳门
						</div>
						<div class="col-xs-3">

							<select id="select-am"onchange="change()" disabled name="timeType-am">
								<option value="" selected disabled></option>
								<option value="4">3月1次</option>
								<option value="5">1年1次</option>


							</select>
						</div>
						<div class="col-xs-3">
							<strong id="cost2"></strong>
						</div>
					</div>
					
					<div class="row">
						<div class="col-xs-12">
							<div class="form-group">
								<label>本人真实照片</label> <!--<input type="file" class="form-control" id="xdaTanFileImg" onchange="xmTanUploadImg(this)" accept="image/*" name="truePhoto" /> <img src="img/bg.png" id="xmTanImg" style="width:100%; height: 200px;" />-->
								<input type="file" id="files" name="truePhoto" >
							</div>
							<div><img src="img/bg.png" id="preview"></div>
						</div>
					</div>
					<div class="form-group">
						<strong>提示:</strong>
						<p>此申请仅团队旅游签注，申请团队旅游签注且每次间隔30天，如果申请了一年两次，那下次申请就要间隔60天。</p>
					</div>
					<button type="button"
						class="btn btn-primary btn-previous pull-left">上一步</button>
					<button type="button" class="btn btn-primary pull-right" onclick="ajax()" id="send" />
					提交
					</button>
					<div id="loading">
					<img src="img/loading.gif" alt="loading">
				</div>
				</div>
			</fieldset>



		</form>
	</div>
	<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
	<script type="text/javascript" src="js/distpicker.js"></script>
	<script type="text/javascript" src="js/main.js"></script>
	<script type="text/javascript" src="bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/birthday.js"></script>
	<script type="text/javascript" src="js/bootstrapValidator.js"></script>
	<script type="text/javascript" src="js/exif.js" ></script>
	<script type="text/javascript" src="js/scripts.js"></script>

</body>
</html>