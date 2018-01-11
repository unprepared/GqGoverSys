package com.hc.gqgs.controller;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.deepoove.poi.XWPFTemplate;
import com.deepoove.poi.data.PictureRenderData;
import com.deepoove.poi.render.RenderAPI;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.hc.gqgs.json.WebResponse;
import com.hc.gqgs.pojo.business.CoupleAwartPojo;
import com.hc.gqgs.service.CoupleAwartService;
import com.hc.gqgs.tools.Base64Image;
import com.hc.gqgs.tools.Makefile;

//夫妻投靠
@Controller
public class CoupleAwartController {
	Logger logger = Logger.getLogger(CoupleAwartController.class);

	@Autowired
	CoupleAwartService coupleAwartService;

	@RequestMapping(value="/coupleAwartController",consumes="application/json;charset=utf-8")
	@ResponseBody
	public Object coupleAwartController(HttpServletRequest request,@RequestBody JSONObject data)
			throws IllegalStateException, IOException {
		if(data == null)
			return new WebResponse(12, 12012).toJsonString();
		logger.info("打印接受的data："+data.toJSONString().length());
		// 生成的表存放根目录
		String path = request.getServletContext().getRealPath("WEB-INF");
		// 图片文件夹名，生成的文档名
		String cCode = UUID.randomUUID().toString().replace("-", "");
		// 生成每次存放上传的图片文件
		String photopath = request.getServletContext().getRealPath("WEB-INF/CoupleAwart/photo/");
		
		photopath = photopath + cCode + "\\";
		File filePath = new File(photopath,cCode);
		if (!filePath.getParentFile().exists()) {
			filePath.getParentFile().mkdirs();
		}
		logger.info("打印图片存储路径photopath："+photopath);
		
		String dataString = data.getString("data");
		logger.info("打印接受的dataString："+dataString.length());
		JSONArray jsonArray = JSONArray.parseArray(dataString);
		if (jsonArray == null)
			return new WebResponse(12, 12013).toJsonString();
		logger.info("打印接受的jsonArray："+jsonArray.toJSONString().length());
		String [] photo= new String[12];
		logger.info("打印jsonArray的大小："+jsonArray.size());
		logger.info("打印photo的大小："+photo.length);
		String newString = null;
		int length = jsonArray.size();
		for (int i = 0; i < length; i++) {
			if (jsonArray.getString(i) == null && i != 5)
				return new WebResponse(12, "1200" + i).toJsonString();
			newString = makeString(jsonArray.getString(i));
//			jsonArray.add(i,newString);
//			jsonArray.remove(i+1);
			if (jsonArray.getString(i) == null) {
				photo[i] = null;
				continue;
			}
			photo[i]  = Base64Image.GenerateImage(newString, photopath + i + ".png");
			logger.info("打印photo[" + i + "]:" +photo[i]);
		}
		
		// 图片路径按模块存入数据库
		// 个人证件照
		String photoPath = "CoupleAwart/photo/" + cCode + "/6.png" + ";" + "CoupleAwart/photo/" + cCode + "/7.png";
		logger.info("打印photoPath："+photoPath);
		// 户口本证件照
		String hkphotoPath = "";
		for (int i = 0; i <= 3; i++) {
			hkphotoPath += "CoupleAwart/photo/" + cCode + "/" + i + ".png" + ";";
		}
		hkphotoPath = hkphotoPath.substring(0, hkphotoPath.length() - 1);
		logger.info("打印hkphotoPath："+hkphotoPath);
		// 身份证证件照
		String idCardPath = "";
		for (int i = 8; i <= 11; i++) {
			idCardPath += "CoupleAwart/photo/" + cCode + "/" + i + ".png" + ";";
		}
		idCardPath = idCardPath.substring(0, idCardPath.length() - 1);
		logger.info("打印idCardPath："+idCardPath);
		// 结婚照证件照
		String mcPicture3 = "CoupleAwart/photo/" + cCode + "/4.png" + ";";
		if (jsonArray.getString(5) != null) {
			mcPicture3 += "CoupleAwart/photo/" + cCode + "/5.png";
		}
		logger.info("打印mcPicture3："+mcPicture3);
		
		jsonArray = null;
		logger.info("打印photo[]：" + photo.toString());
		Map<String, Object> datas = new HashMap<String, Object>() {
			{
				put("hkPicture1",
						new PictureRenderData(Makefile.getwidth(photo[0]), Makefile.getheight(photo[0]), photo[0]));
				put("hkPicture2",
						new PictureRenderData(Makefile.getwidth(photo[1]), Makefile.getheight(photo[1]), photo[1]));
				put("hkPicture3",
						new PictureRenderData(Makefile.getwidth(photo[2]), Makefile.getheight(photo[2]), photo[2]));
				put("hkPicture4",
						new PictureRenderData(Makefile.getwidth(photo[2]), Makefile.getheight(photo[2]), photo[2]));
				put("photo1", new PictureRenderData(100, 150, photo[6]));
				put("photo2", new PictureRenderData(100, 150, photo[7]));
				put("idCardPicture1",
						new PictureRenderData(Makefile.getwidth(photo[8]), Makefile.getheight(photo[8]), photo[8]));
				put("idCardPicture2",
						new PictureRenderData(Makefile.getwidth(photo[9]), Makefile.getheight(photo[9]), photo[9]));
				put("idCardPicture3",
						new PictureRenderData(Makefile.getwidth(photo[10]), Makefile.getheight(photo[10]), photo[10]));
				put("idCardPicture4",
						new PictureRenderData(Makefile.getwidth(photo[11]), Makefile.getheight(photo[11]), photo[11]));
				put("mcPicture1",
						new PictureRenderData(Makefile.getwidth(photo[4]), Makefile.getheight(photo[4]), photo[4]));
				if (photo[5] == null)
					put("mcPicture2", new PictureRenderData(0, 0, photo[4]));
				else
					put("mcPicture2",
							new PictureRenderData(Makefile.getwidth(photo[5]), Makefile.getheight(photo[5]), photo[5]));
			}
		};
		// word文档相对路径
		String relativePath = "CoupleAwart/" + cCode + ".docx";
		logger.info("打印相对路径relativePath："+relativePath);
		// 生成word文档的绝对路径
		path = path + "\\" + "CoupleAwart" + "\\" + cCode + ".docx";
		logger.info("打印绝对路径path："+path);
		// 模板文档的路径
		String realPath = request.getServletContext().getRealPath("WEB-INF/WordTemplate/共青城市商品房夫妻投靠申请表.docx");
		logger.info("模板文档地址" + realPath);
		XWPFTemplate doc = XWPFTemplate.create(realPath);
		RenderAPI.render(doc, datas);
		logger.info("生成文档地址" + path);
		FileOutputStream out = new FileOutputStream(path);
		doc.write(out);
		out.flush();
		out.close();
		Object data1 = coupleAwartService
				.coupleAwartService(cCode, relativePath, photoPath, hkphotoPath, idCardPath, mcPicture3).toJsonString();
		logger.info("返回数据" + data1);
		return data1;
	}

	// 响应政务服务调取文件
	@RequestMapping("/coupleAwart/transferFile")
	@ResponseBody
	public Object transferFileto(String data) {
		if (data.isEmpty())
			return new WebResponse(13, 13001).toJsonString();
		logger.info("接收到的数据data:" + data);
		JSONObject dataJson = JSONObject.parseObject(data);
		JSONObject pagination = dataJson.getJSONObject("pagination");
		JSONObject filter = dataJson.getJSONObject("filter");
		int pageSize = pagination.getInteger("pageSize");
		int pageCurrent = pagination.getInteger("pageCurrent");
		Integer state = filter.getInteger("filterType");
		Date start = filter.getDate("startDate");
		Date end = filter.getDate("endDate");

		WebResponse webResponse = new WebResponse();

		JSONObject jsonObject = new JSONObject();
		PageHelper.startPage(pageCurrent, pageSize);
		List<CoupleAwartPojo> coupleAwartPojos = coupleAwartService.transferFileto(state, start, end);
		System.out.println("打印coupleAwartPojos:" + JSONObject.toJSONString(coupleAwartPojos));
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
		String info = gson.toJson(coupleAwartPojos, new TypeToken<List<CoupleAwartPojo>>() {
		}.getType());
		logger.info("查询到的数据info:" + info);
//		JSONArray jsonArray = JSONArray.parseArray(info);
		PageInfo<CoupleAwartPojo> pageInfo = new PageInfo<>(coupleAwartPojos);
		jsonObject.put("totalRow", pageInfo.getTotal());
		jsonObject.put("pageCurrent", pageInfo.getPageNum());
		jsonObject.put("pageSize", pageInfo.getPageSize());

		webResponse.putresultData("pagination", jsonObject);
		webResponse.putresultData("data", coupleAwartPojos);
		logger.info("返回的数据data:" + webResponse.putsuccess().toJsonString());
		return webResponse.putsuccess().toJsonString();
	}

	private String makeString(String picString) {
		picString = picString.substring(picString.indexOf(",")+1, picString.length());
		return picString;
	}

}
