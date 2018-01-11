			//表单验证
             $(function () {
		        $('#frm').bootstrapValidator({
		　　　　　　　　message: 'This value is not valid',
		            　feedbackIcons: {
		                　　　　　　　　valid: 'glyphicon glyphicon-ok',
		                　　　　　　　　invalid: 'glyphicon glyphicon-remove',
		                　　　　　　　　validating: 'glyphicon glyphicon-refresh'
		            　　　　　　　　   },
		            fields: {
		                hkPicture1: {
		                    validators: {
		                        notEmpty: {
		                            message: '图片不能为空'
		                        }
		                    }
		                },
		                hkPicture2: {
		                    validators: {
		                        notEmpty: {
		                            message: '图片不能为空'
		                        }
		                    }
		                },
		                hkPicture3: {
		                    validators: {
		                        notEmpty: {
		                            message: '图片不能为空'
		                        }
		                    }
		                },
		                hkPicture4: {
		                    validators: {
		                        notEmpty: {
		                            message: '图片不能为空'
		                        }
		                    }
		                },
		                mcPicture: {
		                    validators: {
		                        notEmpty: {
		                            message: '图片不能为空'
		                        }
		                    }
		                },
		                photo1: {
		                    validators: {
		                        notEmpty: {
		                            message: '图片不能为空'
		                        }
		                    }
		                },
		                photo2: {
		                    validators: {
		                        notEmpty: {
		                            message: '图片不能为空'
		                        }
		                    }
		                },
		                idCardPicture1: {
		                    validators: {
		                        notEmpty: {
		                            message: '图片不能为空'
		                        }
		                    }
		                },
		                idCardPicture2: {
		                    validators: {
		                        notEmpty: {
		                            message: '图片不能为空'
		                        }
		                    }
		                },
		                idCardPicture3: {
		                    validators: {
		                        notEmpty: {
		                            message: '图片不能为空'
		                        }
		                    }
		                },
		                idCardPicture4: {
		                    validators: {
		                        notEmpty: {
		                            message: '图片不能为空'
		                        }
		                    }
		                },
		                
		            }
		        });
		         $('.registration-form fieldset:first-child').fadeIn('slow');

			    var index = 1;
			    // next step
			    $('.registration-form .btn-next').on('click', function () {
			        var parent_fieldset = $(this).parents('fieldset');
			        var next_step = true;
			        var bootstrapValidator = $('#frm').data('bootstrapValidator');
			        bootstrapValidator.validate()
			        next_step = bootstrapValidator.isValid();
			        $("step_3").bootstrapValidator('removeField','roleName');  
			        if (next_step) {
			            index++;
			            parent_fieldset.fadeOut(400, function () {
			                $(this).next().fadeIn();
			                if(index == 2){
			                   console.log("2")
			                }else if(index == 3){
								console.log("3")
			                }
			            });
			        }
			
			    });
			     // previous step
		    $('.registration-form .btn-previous').on('click', function () {
		        index--;
		        $(this).parents('fieldset').fadeOut(400, function () {
		            $(this).prev().fadeIn();
		        });
		    });
		    });
		   
	
	
	
   
 // 控制是否已阅读条例
 $(function(){
			    var regBtn = $("#regBtn");
			    $("#regText").change(function(){
			        var that = $(this);
			        that.prop("checked",that.prop("checked"));
			        if(that.prop("checked")){
			            regBtn.prop("disabled",false)
			        }else{
			            regBtn.prop("disabled",true)
			        }
			    });
			});
// 控制图片预览
function getUrl(fil, id) {
    	   	var showImgId = id+'Press';
            var Cnv = document.getElementById('myCanvas');
            var Cntx = Cnv.getContext('2d');// 获取2d编辑容器
            var imgss =   new Image();
            var agoimg=document.getElementById("ago");
            for (var intI = 0; intI < fil.length; intI++) {
                var tmpFile = fil[intI];
                var reader = new FileReader();
                reader.readAsDataURL(tmpFile);
                reader.onload = function (e) {
                    url = e.target.result;
                    imgss.src = url;
                    agoimg.src=url;
                    
                    agoimg.onload = function () {
                        // 等比缩放
                        var m = imgss.width / imgss.height;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
                         Cnv.height =500*m;// 该值影响缩放后图片的大小
                         Cnv.width= 500*m ;
                        // img放入画布中
                        // 设置起始坐标，结束坐标
                        Cntx.drawImage(agoimg, 0, 0,500*m,500*m);
                       
                       var Pic = document.getElementById("myCanvas").toDataURL("image/png");
            			var imgs =document.getElementById(showImgId);
            			imgs.src =Pic ;
            			// 上传
            			// 去除多余，得到base64编码的图片字节流
            			Pic = Pic.replace(/^data:image\/(png|jpg);base64,/, "");
                    }
             
                }
            }
        
        }
		 
		 
		 function getImgsBase64(){
		 	var arr = [];
		 	for(var i=0;i<12;i++){
 			var ele = document.getElementById('fileId'+i+'Press');// img对象
//		 	var ele =document.getElementById('fileId'+0+'Press');
		 		arr.push(ele.src);// ele.src是base64编码图片
		 	}
		 	return JSON.stringify(arr);// 转json格式
		 }

            // ajax
            function ajax() {
				var bootstrapValidator = $('#frm').data('bootstrapValidator');
				bootstrapValidator.validate();
			     if (bootstrapValidator.isValid()) {
			     	$('#loading').show();
			    	 var info = getImgsBase64();
			     	 $.ajax({    
			    	  url: '/GqGoverSys/coupleAwartController',
			          type: 'POST', 
			          dataType: 'json',  
			          contentType:'application/json;charset=utf-8',
			  		  data : JSON.stringify({data:info}),    
			          success: function (response,status,xhr) {   
			          	console.log(response);
			          	var errcode=response.errcode;
			          	var resultData=response.resultData;
			          	var cCode=resultData.cCode;
			          	var message = response.message;
			          	localStorage.setItem('cCode', cCode);
			          	var info=localStorage.getItem('cCode');
			          	if(errcode==0){
			          		alert("上传成功！");
			          		window.location.href="/GqGoverSys/CoupleSkipJsp";
//			          		window.location.href = "CoupleSkip.jsp";
			          	}else{
			          		alert("出现错误，错误结果码为："+message);
			          		window.location.href="CoupleAwart.jsp";
			          	}
// if(errcode==0){
// alert("提交成功,请带上原件和复印件到政务大厅办理.");
// window.location.href="http://www.kingeid.com/GqGoverSys/CoupleAwartJsp";
// window.location.href="http://192.168.1.109:8080/GqGoverSys/CoupleAwartJsp";
// }
			          },    
			          error: function (response) {    
			             	alert("提交失败,请重试或稍后申请");
			             	window.location.href="/GqGoverSys/CoupleAwartJsp";
			          },
					  complete:function(){
						  $('#loading').hide();
					  }
			     });  
			     }
			      
			}   
			
