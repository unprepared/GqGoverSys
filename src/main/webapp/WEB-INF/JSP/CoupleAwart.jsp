<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="utf-8" />
		<title>共青政务系统</title>
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<meta name="viewport" content="width=device-width,height=device-height,inital-scale=1.0,maximum-scale=1.0">
		<link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.min.css" />
		<link rel="stylesheet" href="css/fuqi.css" />
	</head>
	<style>
		button[type=button]{
			margin-bottom: 30px;
		}
	</style>
	<body>
	<div class="container">
		<form class="registration-form" id="frm" enctype="multipart/form-data" method="post">
			<fieldset id="step_1">
				<div class="row">
				<div class="col-xs-12">
					<h3 class="text-center"><strong>夫妻投靠商品房申请条例</strong></h3>
				</div>
			</div>
			<div class="row font-main">
				<div class="col-xs-12">
					<p>1.提供一份夫妻投靠申请条例的说明 夫妻投靠类（夫妻一方户籍在共青城商品房小区的居民）可以进行网上户口迁移申请。</p>
					<p>2.婚育证明是否需要提供，如有超生情况是否给与资格 ，不需要提供婚育证明。</p>
					<p>3.是否考虑户口本迁出方先行办理同意迁出？ </p>
					<p>4.所有的迁移都必须先同意迁入，迁入地开具《准予迁入证明》，才能到迁出地办理的，迁出地凭《准予迁入证明》开具《户口迁移证》同时在户口本盖迁出。</p>
				</div>
			</div>
			<div class="row">
				<div class="col-xs-12">
					<div class="form-group">
						<input type="checkbox" id="regText"/>我已阅读以上条例
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-xs-12">
					<div class="form-group">
						<button type="button" class="btn btn-primary pull-right btn-next" id="regBtn" disabled>下一步</button>
					</div>
				</div>
			</div>
			</fieldset>
			<fieldset id="step_2" style="display: none;">
				<div class="row">
					<div class="col-xs-12">
						<h3>男方户口本照片：</h3>
					</div>
				</div>
				<div class="row">
					<div class="col-xs-6">
						<div class="form-group">
			            	<label>户口本第一页</label>
			            	<!--<input type="file" class="form-control" id="xdaTanFileImgOne" onchange="xmTanUploadImgOne(this)" accept="image/*" name="hkPicture1" required/>-->
				            <input type="file" accept="image/*" class="form-control" id="fileId0" name="hkPicture1" value="上传图片" hidefocus="true" onchange="getUrl(this.files,this.id)"/>
				 <canvas id="myCanvas"style="display: none;border:1px solid red;width:100%;height: 200px;" ></canvas>
				 <img src="img/bg.png" alt="old" id="ago" style="display: none;width:100%;height: 200px;"/>
				 
				 <img src="img/bg.png" alt="new" id="fileId0Press"style="width:100%;height: 200px;"/>
			            </div>
					</div>
					<div class="col-xs-6">
						<div class="form-group">
			            	<label>男方所在页</label>
			            	<input type="file" accept="image/*" class="form-control" id="fileId1" name="hkPicture2" value="上传图片" hidefocus="true" onchange="getUrl(this.files,this.id)" />
				 			<img src="img/bg.png" alt="new" id="fileId1Press"style="width:100%;height: 200px;"/>
			            </div>
					</div>
				</div>
				<div class="row">
					<div class="col-xs-12">
						<h3>女方户口本照片：</h3>
					</div>
				</div>
				<div class="row">
					<div class="col-xs-6">
						<div class="form-group">
			            	<label>户口本第一页</label>
			            	<input type="file" accept="image/*" class="form-control" id="fileId2" name="hkPicture3" value="上传图片" hidefocus="true" onchange="getUrl(this.files,this.id)"/>
				 			<img src="img/bg.png" alt="new" id="fileId2Press"style="width:100%;height: 200px;"/>
			            </div>
					</div>
					<div class="col-xs-6">
						<div class="form-group">
			            	<label>女方所在页</label>
			            	<input type="file" accept="image/*" class="form-control" id="fileId3" name="hkPicture4" value="上传图片" hidefocus="true" onchange="getUrl(this.files,this.id)"/>
				 			<img src="img/bg.png" alt="new" id="fileId3Press"style="width:100%;height: 200px;"/>
			            </div>
					</div>
				</div>
				
				<div class="row">
					<div class="col-xs-6">
						<div class="form-group">
							<button type="button" class="btn btn-primary pull-left btn-previous">上一步</button>
						</div>
					</div>
					<div class="col-xs-6">
						<div class="form-group">
							<button type="button" class="btn btn-primary pull-right btn-next">下一步</button>
						</div>
					</div>
				</div>
			</fieldset>
			<fieldset id="step_3" style="display: none; role="adc">
				<!---结婚证正面-->
				<div class="row">
					<div class="col-xs-12">
						<h3>结婚证正面照片：</h3>
					</div>
				</div>
				<div class="row">
					<div class="col-xs-12">
						<div class="form-group">
			            	
			            	<input type="file"accept="image/*" class="form-control" id="fileId4" name="mcPicture" value="上传图片" hidefocus="true" onchange="getUrl(this.files,this.id)"/>
				 			<img src="img/bg.png" alt="new" id="fileId4Press"style="width:100%;height: 200px;"/>
			            </div>
					</div>
				</div>
				<!---结婚证反面-->
				<div class="row">
					<div class="col-xs-12">
						<h3>结婚证反面照片：</h3>
					</div>
				</div>
				<div class="row">
					<div class="col-xs-12">
						<div class="form-group">
			            	
			            	<input type="file"accept="image/*" class="form-control" id="fileId5" name="mcPicture" value="上传图片" hidefocus="true" onchange="getUrl(this.files,this.id)"/>
				 			<img src="img/bg.png" alt="new" id="fileId5Press"style="width:100%;height: 200px;"/>
			            </div>
					</div>
				</div>
				<div class="row">
					<div class="col-xs-6">
						<div class="form-group">
							<button type="button" class="btn btn-primary pull-left btn-previous">上一步</button>
						</div>
					</div>
					<div class="col-xs-6">
						<div class="form-group">
							<button type="button" class="btn btn-primary pull-right btn-next">下一步</button>
						</div>
					</div>
				</div>
			</fieldset>
			<fieldset id="step_3" style="display: none; role="adc">
				<!---证件照正面-->
				<div class="row">
					<div class="col-xs-12">
						<h3>男方证件照照片：</h3>
					</div>
				</div>
				<div class="row">
					<div class="col-xs-12">
						<div class="form-group">
			            	
			            	<input type="file"accept="image/*" class="form-control" id="fileId6" name="photo1" value="上传图片" hidefocus="true" onchange="getUrl(this.files,this.id)"/>
				 			<img src="img/bg.png" alt="new" id="fileId6Press"style="width:100%;height: 200px;"/>
			            </div>
					</div>
				</div>
				<!---证件照反面照片-->
				<div class="row">
					<div class="col-xs-12">
						<h3>女方证件照照片：</h3>
					</div>
				</div>
				<div class="row">
					<div class="col-xs-12">
						<div class="form-group">
			            	
			            	<input type="file"accept="image/*" class="form-control" id="fileId7" name="photo2" value="上传图片" hidefocus="true" onchange="getUrl(this.files,this.id)"/>
				 			<img src="img/bg.png" alt="new" id="fileId7Press"style="width:100%;height: 200px;"/>
			            </div>
					</div>
				</div>
				<div class="row">
					<div class="col-xs-6">
						<div class="form-group">
							<button type="button" class="btn btn-primary pull-left btn-previous">上一步</button>
						</div>
					</div>
					<div class="col-xs-6">
						<div class="form-group">
							<button type="button" class="btn btn-primary pull-right btn-next">下一步</button>
						</div>
					</div>
				</div>
			</fieldset>
			<fieldset id="step_4" style="display: none;">
				<div class="row">
					<div class="col-xs-12">
						<h3>男方身份证照片：</h3>
					</div>
				</div>
				<div class="row">
					<div class="col-xs-6">
						<div class="form-group">
			            	<label>身份证正面</label>
			            	<input type="file"accept="image/*" class="form-control" id="fileId8" name="idCardPicture1" value="上传图片" hidefocus="true" onchange="getUrl(this.files,this.id)"/>
				 			<img src="img/bg.png" alt="new" id="fileId8Press"style="width:100%;height: 200px;"/>
			            </div>
					</div>
					<div class="col-xs-6">
						<div class="form-group">
			            	<label>身份证反面</label>
			            	<input type="file" accept="image/*" class="form-control" id="fileId9" name="idCardPicture2" value="上传图片" hidefocus="true" onchange="getUrl(this.files,this.id)"/>
				 			<img src="img/bg.png" alt="new" id="fileId9Press"style="width:100%;height: 200px;"/>
			            </div>
					</div>
				</div>
				<div class="row">
					<div class="col-xs-12">
						<h3>女方身份证照片：</h3>
					</div>
				</div>
				<div class="row">
					<div class="col-xs-6">
						<div class="form-group">
			            	<label>身份证正面</label>
			            	<input type="file" accept="image/*" class="form-control" id="fileId10" name="idCardPicture3" value="上传图片" hidefocus="true" onchange="getUrl(this.files,this.id)"/>
				 			<img src="img/bg.png" alt="new" id="fileId10Press"style="width:100%;height: 200px;"/>
			            </div>
					</div>
					<div class="col-xs-6">
						<div class="form-group">
			            	<label>身份证反面</label>
			            	<input type="file" accept="image/*" class="form-control" id="fileId11" name="idCardPicture4" value="上传图片" hidefocus="true" onchange="getUrl(this.files,this.id)"/>
				 			<img src="img/bg.png" alt="new" id="fileId11Press"style="width:100%;height: 200px;"/>
			            </div>
					</div>
				</div>
				<div id="loading"><img src="img/loading.gif"/></div>
				<div class="row">
					<div class="col-xs-12">
						<div class="form-group">
							<button type="button" class="btn btn-primary pull-left btn-previous">上一步</button>
							<button type="button" class="btn btn-primary pull-right" onclick="ajax()">提交</button>
						</div>
					</div>
				</div>
				<div id="loading">
					<img src="img/loading.gif" alt="loading">
				</div>
			</fieldset>
		</form>
		
	</div>
	
	
		<script type="text/javascript" src="js/jquery-3.2.1.min.js" ></script>
		<script type="text/javascript" src="js/bootstrapValidator.js" ></script>
		<script type="text/javascript" src="js/fuqi.js" ></script>
	</body>
</html>
