jQuery(document).ready(function() {

	/*
	 * Fullscreen background
	 */

	/*
	 * Form
	 */
	$('.registration-form fieldset:first-child').fadeIn('slow');

	var index = 1;
	// next step
	$('.registration-form .btn-next').on('click', function() {
		var parent_fieldset = $(this).parents('fieldset');
		var next_step = true;
		var bootstrapValidator = $('#form').data('bootstrapValidator');
		bootstrapValidator.validate()
		next_step = bootstrapValidator.isValid();
		if (next_step) {
			index++;
			parent_fieldset.fadeOut(400, function() {
				$(this).next().fadeIn();
				if (index == 2) {

				} else if (index == 3) {

				}
			});
		}

	});

	// previous step
	$('.registration-form .btn-previous').on('click', function() {
		index--;
		$(this).parents('fieldset').fadeOut(400, function() {
			$(this).prev().fadeIn();
		});
	});

	// submit

	// mingzu

});
/* 中国三级省市区下拉 */

/* 户籍所在地 */

// 生日
$(function() {
	$.ms_DatePicker({
		YearSelector : ".sel_year",
		MonthSelector : ".sel_month",
		DaySelector : ".sel_day"
	});
	$.ms_DatePicker();
});
//// 选择
//		function xgcs(){
//			var a;
//			$("#select-xg").on("change", function() {
//		if ($("option:selected", this).index() == 1) {
//			$(".cost1").html("需缴纳15元");
//			a=15;
//		};
//		if ($("option:selected", this).index() == 2) {
//			$(".cost1").html("需缴纳15元");
//			a=15;
//		};
//		if ($("option:selected", this).index() == 3) {
//			$(".cost1").html("需缴纳30元");
//			a=30;
//			
//		}
//		
//		
//	})
//		}
//	
//	
//		function amcs(){
//			var b;
//			$("#select-am").on("change", function() {
//		if ($("option:selected", this).index() == 1) {
//			$(".cost2").html("需缴纳15元");
//			b=15;
//		};
//		if ($("option:selected", this).index() == 2) {
//			$(".cost2").html("需缴纳15元");
//			b=15;
//		}
//		return b;
//		console.log(b);
//	})
//		}
		//选择
		
		var xgAndAmMuch = 0;
	
	function change(){
		var xgVals=$('#select-xg option:selected').val();
		var xgMuch = 0;
		var amVals=$('#select-am option:selected').val();
		var amMuch = 0;
		switch(xgVals){
			case '1':xgMuch=15;break;
			case '2':xgMuch=15;break;
			case '3':xgMuch=30;break;
			default:xgMuch=0;break
		}
		switch(amVals){
			case '4':amMuch=15;break;
			case '5':amMuch=15;break;
			default:amMuch=0;break
		}
		xgMuch>0?$("#cost1").html("需缴纳"+xgMuch+"元"):$("#cost1").html("");
		amMuch>0?$("#cost2").html("需缴纳"+amMuch+"元"):$("#cost2").html("");
		xgAndAmMuch = xgMuch+amMuch;
		xgAndAmMuch>0?$("#heji").html(xgAndAmMuch+'元'):$("#heji").html("");
	}

		
	
$(function() {
	var ck = document.getElementById("ck");
	var bt = document.getElementById("bt");
	var xg = document.getElementById("form-xg");
	var btxg = document.getElementById("select-xg")
	var btam = document.getElementById("select-am")
	var am = document.getElementById("form-am");
	ck.onclick = function() {
		if (this.checked == true) {
			bt.disabled = false;
		} else {
			bt.disabled = true;
		}
	}
	xg.onclick = function() {
		if (this.checked == true) {
			btxg.disabled = false;
			$("#cost1").show();
		} else {
			btxg.disabled = true;
			//$('#select-xg option:selected').val('0');
			btxg.options[0].selected=true;
			change();
		}
	}
	am.onclick = function() {
		if (this.checked == true) {
			btam.disabled = false;
			$("#cost2").show();
		} else {
			btam.disabled = true;
			//$('#select-am option:selected').val('0');
			btam.options[0].selected=true;
			change();
		}
	}
})

$(function() {
	$('form').bootstrapValidator({
		message : 'This value is not valid',
		feedbackIcons : {
			valid : 'glyphicon glyphicon-ok',
			invalid : 'glyphicon glyphicon-remove',
			validating : 'glyphicon glyphicon-refresh'
		},
		fields : {
			firstName : {
				message : '姓名验证失败',
				validators : {
					notEmpty : {
						message : '姓氏不能为空'
					},
					// stringLength: {
					// min: 6,
					// max: 18,
					// message: '用户名长度必须在6到18位之间'
					// },
					regexp : {
						regexp : /^[\u4E00-\u9FA5]{1,6}$/,
						message : '请输入正确的中文姓氏'
					}
				}
			},
			lastName : {
				message : '姓名验证失败',
				validators : {
					notEmpty : {
						message : '名字不能为空'
					},
					// stringLength: {
					// min: 6,
					// max: 18,
					// message: '用户名长度必须在6到18位之间'
					// },
					regexp : {
						regexp : /^[\u4E00-\u9FA5]{1,6}$/,
						message : '请输入正确的中文，名字'
					}
				}
			},
			surname : {
				validators : {
					notEmpty : {
						message : '拼音姓不能为空'
					},
					regexp : {
						regexp : /^[a-zA-Z]{1,}$/,
						message : '请输入你的姓拼音'
					},
				// emailAddress: {
				// message: '邮箱地址格式有误'
				// }
				}
			},
			spellName : {
				validators : {
					notEmpty : {
						message : '拼音名不能为空'
					},
					regexp : {
						regexp : /^[a-zA-Z]{1,}$/,
						message : '请输入你的名字拼音'
					},
				}
			},
			hkDetails : {
				validators : {
					notEmpty : {
						message : '户口地址不能为空'
					},
				}
			},
			idCardNo : {
				validators : {
					notEmpty : {
						message : '身份证号码不能为空'
					},
					regexp : {
						regexp : /^(\d{18}|\d{17}x)$/,
						message : '身份证号码格式错误'
					},
				}
			},
			telphone : {
				validators : {
					notEmpty : {
						message : '联系电话不能为空'
					},
					regexp : {
						regexp : /^1[34578]\d{9}$/,
						message : '联系电话格式错误'
					},
				}
			},
			uName : {
				validators : {
					notEmpty : {
						message : '紧急联系人姓名不能为空'
					},
					regexp : {
						regexp : /^[\u4E00-\u9FA5]{1,6}$/,
						message : '请输入正确的中文名称'
					}
				}
			},
			uTelphone : {
				validators : {
					notEmpty : {
						message : '紧急联系人电话不能为空'
					},
					regexp : {
						regexp : /^1[34578]\d{9}$/,
						message : '联系电话格式错误'
					},
				}
			},
			recipient : {
				validators : {
					notEmpty : {
						message : '收件人不能为空'
					},
					regexp : {
						regexp : /^[\u4E00-\u9FA5]{1,6}$/,
						message : '请输入正确的中文名称'
					}
				}
			},
			postcode : {
				validators : {
					notEmpty : {
						message : '邮编不能为空'
					},
					regexp : {
						regexp : /^[0-9]{6}$/,
						message : '邮编格式错误'
					}
				}
			},
			rTelphone : {
				validators : {
					notEmpty : {
						message : '收件人联系号码不能为空'
					},
					regexp : {
						regexp : /^1[34578]\d{9}$/,
						message : '联系号码格式错误'
					},
				}
			},
			rAddress : {
				validators : {
					notEmpty : {
						message : '收件人详细地址不能为空'
					},

				}
			},
			truePhoto : {
				validators : {
					notEmpty : {
						message : '图片不能为空'
					}
				}
			},
		}
	});
});
// 判断浏览器是否支持FileReader接口
if (typeof FileReader == 'undefined') {
	document.getElementById("xmTanDivOne").InnerHTML = "<h1>当前浏览器不支持FileReader接口</h1>";
	// 使选择控件不可操作
	document.getElementById("xdaTanFileImgOne").setAttribute("disabled",
			"disabled");
}

// 选择图片，马上预览
//function xmTanUploadImg(obj) {
//	var file = obj.files[0];
//
//	console.log(obj);
//	console.log(file);
//	console.log("file.size = " + file.size); // file.size 单位为byte
//
//	var reader = new FileReader();
//
//	// 读取文件过程方法
//	reader.onloadstart = function(e) {
//		console.log("开始读取....");
//	}
//	reader.onprogress = function(e) {
//		console.log("正在读取中....");
//	}
//	reader.onabort = function(e) {
//		console.log("中断读取....");
//	}
//	reader.onerror = function(e) {
//		console.log("读取异常....");
//	}
//	reader.onload = function(e) {
//		console.log("成功读取....");
//
//		var img = document.getElementById("xmTanImg");
//		img.src = this.result;
//		// 或者 img.src = this.result; //e.target == this
//	}
//
//	reader.readAsDataURL(file)
//
//}
$(function(){
	var ipt = document.getElementById('files'),
    img = document.getElementById('preview'),
    Orientation = null;
ipt.onchange = function () {
    var file = ipt.files[0],
        reader = new FileReader(),
        image = new Image();
        
    if(file){
        EXIF.getData(file, function() {  
            Orientation = EXIF.getTag(this, 'Orientation');
          console.log(Orientation)
        });
        reader.onload = function (ev) {
            image.src = ev.target.result;
            image.onload = function () {
                var imgWidth = this.width,
                    imgHeight = this.height;
                // 控制上传图片的宽高
                if(imgWidth > imgHeight && imgWidth > 750){
                    imgWidth = 750;
                    imgHeight = Math.ceil(750 * this.height / this.width);
                }else if(imgWidth < imgHeight && imgHeight > 1334){
                    imgWidth = Math.ceil(1334 * this.width / this.height);
                    imgHeight = 1334;
                }
                
                var canvas = document.createElement("canvas"),
                ctx = canvas.getContext('2d');
                canvas.width = imgWidth;
                canvas.height = imgHeight;
                if(Orientation && Orientation != 1){
                    switch(Orientation){
                        case 6:     // 旋转90度
                            canvas.width = imgHeight;    
                            canvas.height = imgWidth;    
                            ctx.rotate(Math.PI / 2);
                            // (0,-imgHeight) 从旋转原理图那里获得的起始点
                            ctx.drawImage(this, 0, -imgHeight, imgWidth, imgHeight);
                            break;
                        case 3:     // 旋转180度
                            ctx.rotate(Math.PI);    
                            ctx.drawImage(this, -imgWidth, -imgHeight, imgWidth, imgHeight);
                            break;
                        case 8:     // 旋转-90度
                            canvas.width = imgHeight;    
                            canvas.height = imgWidth;    
                            ctx.rotate(3 * Math.PI / 2);    
                            ctx.drawImage(this, -imgWidth, 0, imgWidth, imgHeight);
                            break;
                    }
                }else{
                    ctx.drawImage(this, 0, 0, imgWidth, imgHeight);
                }
                img.src = canvas.toDataURL("image/jpeg", 0.8);
            }
        }
        reader.readAsDataURL(file);
    }
}
	//提交图片文件（二进制文件 非base64）
//	function dataURItoBlob(dataURI) {
//    var byteString = atob(dataURI.split(',')[1]);
//    var mimeString = dataURI.split(',')[0].split(':')[1].split(';')[0];
//    var ab = new ArrayBuffer(byteString.length);
//    var ia = new Uint8Array(ab);
//    for (var i = 0; i < byteString.length; i++) {
//        ia[i] = byteString.charCodeAt(i);
//    }
//    return new Blob([ab], {type: mimeString});
//}
	
})
// ajax提交
function ajax() {
	var bootstrapValidator = $('#form').data('bootstrapValidator');
	bootstrapValidator.validate();
	if(xgAndAmMuch <= 0){
		alert('请选择签注类型！');
		return ;
	}
	var formData = new FormData($("#form")[0]);
	formData.append('xgAndAmMuch',xgAndAmMuch);
//	//构造formdata填充二进制文件数据
//	var fd = new FormData();
//	var blob = dataURItoBlob(dataURL);
//	fd.append('file', blob);
	//$("#form").data("bootstrapValidator").isValid();
	if (bootstrapValidator.isValid()) {
		$('#loading').show();
		$.ajax({
//			url : 'http://www.kingeid.com/GqGoverSys/secondVisaController', /* 这是处理文件上传的servlet */
			url: '/GqGoverSys/secondVisaController',
			type : 'POST',
			data : formData,
			//async : false,
//			cache : false,
			contentType : false,// 根据表单 input 提交的数据使用其默认的 contentType
			processData : false,// 不会将 data 参数序列化字符串
			
			success : function(response, status, xhr) {
				var errcode = response.errcode;
				var resultData = response.resultData;
				var sCode = resultData.sCode;
				var message = response.message;
				localStorage.setItem('sCode', sCode);
//				var info = localStorage.getItem('sCode');
				console.log(response);
				var errcode = response.errcode;
				if (errcode == 0) {
					alert("提交成功,请等待工作人员审核。");
					window.location.href = "/GqGoverSys/SecondSkipJsp";
					// 成功跳转页面window.location.href="http://www.kingeid.com/GqGoverSys/SecondVisaJsp";
				} else {
					alert("出现错误，错误结果码为："+message);
					window.location.href = "/GqGoverSys/SecondVisaJsp";
				}

			},
			error : function() {
				alert("提交失败,出现网络错误或其他未知错误，请重试或稍后申请！");
				window.location.href = "/GqGoverSys/SecondVisaJsp";
				// 失败跳转页面window.location.href="http://www.kingeid.com/GqGoverSys/SecondVisaJsp";
				// //window.location.href="http://192.168.1.109:8080/GqGoverSys/SecondVisaJsp";
			}
		});
	}
}