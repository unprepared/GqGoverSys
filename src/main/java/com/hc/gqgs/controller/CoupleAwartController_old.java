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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONObject;
import com.deepoove.poi.XWPFTemplate;
import com.deepoove.poi.data.PictureRenderData;
import com.deepoove.poi.render.RenderAPI;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hc.gqgs.json.WebResponse;
import com.hc.gqgs.pojo.business.CoupleAwartPojo;
import com.hc.gqgs.service.CoupleAwartService;
import com.hc.gqgs.tools.Makefile;

/*HttpServletRequest request, HttpServletResponse response,
final */
//夫妻投靠
@Controller
public class CoupleAwartController_old {
	Logger logger = Logger.getLogger(CoupleAwartController_old.class);

	@Autowired
	CoupleAwartService coupleAwartService;

	@RequestMapping("/coupleAwartController_old")
	@ResponseBody
	public Object coupleAwartController(HttpServletRequest request, MultipartFile photo1, MultipartFile photo2,
			MultipartFile hkPicture1, MultipartFile hkPicture2, MultipartFile hkPicture3, MultipartFile hkPicture4,
			MultipartFile idCardPicture1, MultipartFile idCardPicture2, MultipartFile idCardPicture3,
			MultipartFile idCardPicture4, MultipartFile... mcPicture) throws IllegalStateException, IOException {
		// 生成的表存放根目录
		String path = request.getServletContext().getRealPath("WEB-INF");
		// 图片文件夹名，生成的文档名
		String cCode = UUID.randomUUID().toString().replace("-", "");
		// 生成每次存放上传的图片文件
		String photopath = request.getServletContext().getRealPath("WEB-INF/CoupleAwart/photo/");
		photopath = photopath + cCode + "\\";
		if (photo1 == null)
			return new WebResponse(12, 12001).toJsonString();
		if (photo2 == null)
			return new WebResponse(12, 12002).toJsonString();
		if (hkPicture1 == null)
			return new WebResponse(12, 12003).toJsonString();
		if (hkPicture2 == null)
			return new WebResponse(12, 12004).toJsonString();
		if (hkPicture3 == null)
			return new WebResponse(12, 12005).toJsonString();
		if (hkPicture4 == null)
			return new WebResponse(12, 12006).toJsonString();
		if (idCardPicture1 == null)
			return new WebResponse(12, 12007).toJsonString();
		if (idCardPicture2 == null)
			return new WebResponse(12, 12008).toJsonString();
		if (idCardPicture3 == null)
			return new WebResponse(12, 12009).toJsonString();
		if (idCardPicture4 == null)
			return new WebResponse(12, 12010).toJsonString();
		if (mcPicture == null)
			return new WebResponse(12, 12011).toJsonString();
		// 结婚证图片插入的地址和命名
		String[] mm = { "mcPicture1", "mcPicture2" };
		// 结婚证图片名
		String[] r = new String[2];
		for (int i = 0; i < mcPicture.length; i++) {
			r[i] = Makefile.makefile(mcPicture[i], photopath, mm[i]);
		}
		// 图片转存本地，返回图片地址
		String photoPath1 = Makefile.makefile(photo1, photopath, "photo1");
		String photoPath2 = Makefile.makefile(photo2, photopath, "photo2");
		String hkphotoPath1 = Makefile.makefile(hkPicture1, photopath, "hkPicture1");
		String hkphotoPath2 = Makefile.makefile(hkPicture2, photopath, "hkPicture2");
		String hkphotoPath3 = Makefile.makefile(hkPicture3, photopath, "hkPicture3");
		String hkphotoPath4 = Makefile.makefile(hkPicture4, photopath, "hkPicture4");
		String idCardPath1 = Makefile.makefile(idCardPicture1, photopath, "idCardPicture1");
		String idCardPath2 = Makefile.makefile(idCardPicture2, photopath, "idCardPicture2");
		String idCardPath3 = Makefile.makefile(idCardPicture3, photopath, "idCardPicture3");
		String idCardPath4 = Makefile.makefile(idCardPicture4, photopath, "idCardPicture4");

		// 图片路径按模块存入数据库
		// 个人证件照
		String photoPath = makePath(photoPath1) + ";" + makePath(photoPath2);
		// 户口本证件照
		String hkphotoPath = makePath(hkphotoPath1) + ";" + makePath(hkphotoPath2) + ";" + makePath(hkphotoPath3) + ";"
				+ makePath(hkphotoPath4);
		// 身份证证件照
		String idCardPath = makePath(idCardPath1) + ";" + makePath(idCardPath2) + ";" + makePath(idCardPath3) + ";"
				+ makePath(idCardPath4);
		// 结婚照证件照
		String mcPicture3 = "";
		for (String rString : r) {
			mcPicture3 = mcPicture3 + makePath(rString) + ";";
		}
		mcPicture3 = mcPicture3.substring(0, mcPicture3.length() - 1);
		logger.info("图片地址" + (photoPath + hkphotoPath + idCardPath + mcPicture3));

		// map用于插入word文档
		Map<String, Object> datas = new HashMap<String, Object>() {
			{
				put("hkPicture1", new PictureRenderData(Makefile.getwidth(hkphotoPath1),
						Makefile.getheight(hkphotoPath1), hkphotoPath1));
				put("hkPicture2", new PictureRenderData(Makefile.getwidth(hkphotoPath2),
						Makefile.getheight(hkphotoPath2), hkphotoPath2));
				put("hkPicture3", new PictureRenderData(Makefile.getwidth(hkphotoPath3),
						Makefile.getheight(hkphotoPath3), hkphotoPath3));
				put("hkPicture4", new PictureRenderData(Makefile.getwidth(hkphotoPath4),
						Makefile.getheight(hkphotoPath4), hkphotoPath4));
				put("photo1", new PictureRenderData(100, 150, photoPath1));
				put("photo2", new PictureRenderData(100, 150, photoPath2));
				put("idCardPicture1", new PictureRenderData(Makefile.getwidth(idCardPath1),
						Makefile.getheight(idCardPath1), idCardPath1));
				put("idCardPicture2", new PictureRenderData(Makefile.getwidth(idCardPath2),
						Makefile.getheight(idCardPath2), idCardPath2));
				put("idCardPicture3", new PictureRenderData(Makefile.getwidth(idCardPath3),
						Makefile.getheight(idCardPath3), idCardPath3));
				put("idCardPicture4", new PictureRenderData(Makefile.getwidth(idCardPath4),
						Makefile.getheight(idCardPath4), idCardPath4));
				for (int i = 0; i < mcPicture.length; i++) {
					put(mm[i], new PictureRenderData(Makefile.getwidth(r[i]), Makefile.getheight(r[i]), r[i]));
				}
				if (mcPicture.length == 1)
					put("mcPicture2", new PictureRenderData(0, 0, r[0]));
			}
		};
		// word文档相对路径
		String relativePath = "CoupleAwart/" + cCode + ".docx";
		// 生成word文档的绝对路径
		path = path + "\\" + "CoupleAwart" + "\\" + cCode + ".docx";
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
		Object data = coupleAwartService
				.coupleAwartService(cCode, relativePath, photoPath, hkphotoPath, idCardPath, mcPicture3).toJsonString();
		logger.info("返回数据" + data);
		return data;
	}

	// 响应政务服务调取文件
	@RequestMapping("/coupleAwart/transferFile_old")
	@ResponseBody
	public Object transferFileto(String data) {
		if(data == null)
			return new WebResponse(13, 13001).toJsonString();
		JSONObject dataJson = JSONObject.parseObject(data);
		JSONObject pagination = dataJson.getJSONObject("pagination");
		JSONObject filter = dataJson.getJSONObject("filter");
		int pageSize =  pagination.getInteger("pageSize");
		int pageCurrent =  pagination.getInteger("pageCurrent");
		int state = filter.getInteger("filterType");
		Date start = filter.getDate("startDate");
		Date end = filter.getDate("endDate");
		
		WebResponse webResponse = new WebResponse();
		
		JSONObject jsonObject = new JSONObject();
		PageHelper.startPage(pageCurrent, pageSize);
		List<CoupleAwartPojo> coupleAwartPojos = coupleAwartService.transferFileto(state,start,end);
		System.out.println("打印coupleAwartPojos:"+JSONObject.toJSONString(coupleAwartPojos));
		/*Gson gson = new GsonBuilder()
				.setDateFormat("yyyy-MM-dd")
				.create();
		String info = gson.toJson(coupleAwartPojos,new TypeToken<List<CoupleAwartPojo>>() {
		}.getType());
		System.out.println(info);
		JSONArray jsonArray = JSONArray.parseArray(info);*/
		PageInfo<CoupleAwartPojo> pageInfo = new PageInfo<>(coupleAwartPojos);
		jsonObject.put("totalRow", pageInfo.getTotal());
		jsonObject.put("pageCurrent", pageInfo.getPageNum());
		jsonObject.put("pageSize", pageInfo.getPageSize());
		
		webResponse.putresultData("pagination", jsonObject);
		webResponse.putresultData("data",coupleAwartPojos);
		return webResponse.putsuccess().toJsonString();
	}

	private String makePath(String path) {
		path = path.substring(path.indexOf("CoupleAwart"), path.length());
		path = path.replaceAll("\\\\", "/");
		return path;
	}
}
