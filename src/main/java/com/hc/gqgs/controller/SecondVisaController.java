package com.hc.gqgs.controller;

import java.io.FileOutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
import com.hc.gqgs.tools.Makefile;
import com.hc.gqgs.json.WebResponse;
import com.hc.gqgs.pojo.business.SecondVisaPojo;
import com.hc.gqgs.service.SecondVisaService;
import com.hc.gqgs.tools.StringUtil;

//二次签注
@Controller
public class SecondVisaController {
	Logger logger = Logger.getLogger(SecondVisaController.class);

	@Autowired
	SecondVisaService secondVisaService;

	// 接收客户端发过来的数据生成相应材料
	@RequestMapping("/secondVisaController")
	@ResponseBody
	public Object secondVisaController(HttpServletRequest request, HttpServletResponse response,
			final MultipartFile truePhoto) throws Exception {
		System.out.println("到这里了！");
		// 生成的表存放地址
		String path = request.getServletContext().getRealPath("WEB-INF");
		// 图片名，生成的文档名
		String sCode = UUID.randomUUID().toString().replace("-", "");
		// 图片存放地址
		String photopath = request.getServletContext().getRealPath("WEB-INF/SecondVisa/photo/");
		// 姓
		final String firstName = request.getParameter("firstName");
		if (StringUtil.isEmptyOrNull(firstName)) {
			return new WebResponse(11, 11001).toJsonString();
		}
		// 名
		final String lastName = request.getParameter("lastName");
		if (StringUtil.isEmptyOrNull(lastName)) {
			return new WebResponse(11, 11002).toJsonString();
		}
		// 拼音姓
		final String surname = request.getParameter("surname");
		if (StringUtil.isEmptyOrNull(surname)) {
			return new WebResponse(11, 11003).toJsonString();
		}
		// 拼音名
		final String spellName = request.getParameter("spellName");
		if (StringUtil.isEmptyOrNull(spellName)) {
			return new WebResponse(11, 11004).toJsonString();
		}
		// 性别
		final String sex = request.getParameter("sex");
		if (StringUtil.isEmptyOrNull(sex)) {
			return new WebResponse(11, 11005).toJsonString();
		}
		// 民族
		final String nation = request.getParameter("nation");
		if (StringUtil.isEmptyOrNull(sex)) {
			return new WebResponse(11, 11006).toJsonString();
		}
		// 出生地
		final String bpProvince = request.getParameter("bpProvince");
		final String bpCity = request.getParameter("bpCity");
		final String bpCounty = request.getParameter("bpCounty");
		if (StringUtil.isEmptyOrNull(bpProvince) || StringUtil.isEmptyOrNull(bpCity)
				|| StringUtil.isEmptyOrNull(bpCounty)) {
			return new WebResponse(11, 11007).toJsonString();
		}
		final String brithplace = bpProvince + bpCity + bpCounty;
		// 户口所在地
		final String hkProvince = request.getParameter("hkProvince");
		final String hkCity = request.getParameter("hkCity");
		final String hkCounty = request.getParameter("hkCounty");
		final String hkDetails = request.getParameter("hkDetails");
		if (StringUtil.isEmptyOrNull(hkProvince) || StringUtil.isEmptyOrNull(hkCity)
				|| StringUtil.isEmptyOrNull(hkCounty) || StringUtil.isEmptyOrNull(hkDetails)) {
			return new WebResponse(11, 11008).toJsonString();
		}
		final String hkPlace = hkProvince + hkCity + hkCounty + hkDetails;
		// 身份证号码
		final String idCardNo = request.getParameter("idCardNo");
		if (StringUtil.isEmptyOrNull(idCardNo)) {
			return new WebResponse(11, 11009).toJsonString();
		}
		// 数据表命名
		final String[] mm = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
				"17", "18" };
		// 身份证号码存入数组
		final String[] r = new String[idCardNo.length()];
		for (int i = 0; i < idCardNo.length(); i++) {
			r[i] = idCardNo.substring(i, i + 1);
		}
		// 出生年月
		final String year = request.getParameter("year");
		final String month = request.getParameter("month");
		final String day = request.getParameter("day");
		if (StringUtil.isEmptyOrNull(year) || StringUtil.isEmptyOrNull(month) || StringUtil.isEmptyOrNull(day)) {
			return new WebResponse(11, 11010).toJsonString();
		}
		final String brithtime = year + "年" + month + "月" + day + "日";
		// 电话号码
		final String telphone = request.getParameter("telphone");
		if (StringUtil.isEmptyOrNull(telphone)) {
			return new WebResponse(11, 11011).toJsonString();
		}
		// 紧急联系人
		final String uName = request.getParameter("uName");
		if (StringUtil.isEmptyOrNull(uName)) {
			return new WebResponse(11, 11012).toJsonString();
		}
		// 紧急联系人号码
		final String uTelphone = request.getParameter("uTelphone");
		if (StringUtil.isEmptyOrNull(uTelphone)) {
			return new WebResponse(11, 11013).toJsonString();
		}
		// 收件人号码
		final String rTelphone = request.getParameter("rTelphone");
		if (StringUtil.isEmptyOrNull(rTelphone)) {
			return new WebResponse(11, 11014).toJsonString();
		}
		// 收件地址
		final String rAddress = request.getParameter("rAddress");
		if (StringUtil.isEmptyOrNull(rAddress)) {
			return new WebResponse(11, 11015).toJsonString();
		}
		// 收件人
		final String recipient = request.getParameter("recipient");
		if (StringUtil.isEmptyOrNull(recipient)) {
			return new WebResponse(11, 11016).toJsonString();
		}
		// 邮编
		final String postcode = request.getParameter("postcode");
		if (StringUtil.isEmptyOrNull(postcode)) {
			return new WebResponse(11, 11017).toJsonString();
		}
		//应收的总金额
		final String xgAndAmMuchStr = request.getParameter("xgAndAmMuch");
		System.out.println("缴费总金额xgAndAmMuch："+xgAndAmMuchStr);
		if (StringUtil.isEmptyOrNull(xgAndAmMuchStr)) {
			return new WebResponse(11, 11019).toJsonString();
		}
		Integer xgAndAmMuch = Integer.parseInt(xgAndAmMuchStr);
		// 签证类型
		final String visaTypeXg = request.getParameter("visaType-xg");
		final String visaTypeAm = request.getParameter("visaType-am");
		final String timeTypeXg = request.getParameter("timeType-xg");
		final String timeTypeAm = request.getParameter("timeType-am");
		JSONObject jsonOType = new JSONObject();
		jsonOType.put("visaTypeXg", visaTypeXg);
		jsonOType.put("visaTypeAm", visaTypeAm);
		jsonOType.put("timeTypeXg", timeTypeXg);
		jsonOType.put("timeTypeAm", timeTypeAm);
		if ((StringUtil.isEmptyOrNull(visaTypeXg) && StringUtil.isEmptyOrNull(visaTypeAm))
				|| (StringUtil.isEmptyOrNull(timeTypeXg) && StringUtil.isEmptyOrNull(timeTypeAm))) {
			return new WebResponse(11, 11018).toJsonString();
		}
		// 空心框
		char a = (char) 9633;
		// 实心框
		char b = (char) 9632;
		final String visaTypeStringXg;
		final String visaTypeStringAm;
		if ((!StringUtil.isEmptyOrNull(visaTypeXg)) && (!StringUtil.isEmptyOrNull(timeTypeXg))) {
			switch (Integer.parseInt(timeTypeXg)) {
			case 1:
				visaTypeStringXg = b + "3月一次" + "\n" + a + "1年一次" + "\n" + a + "1年两次";
				break;
			case 2:
				visaTypeStringXg = a + "3月一次" + "\n" + b + "1年一次" + "\n" + a + "1年两次";
				break;
			default:
				visaTypeStringXg = a + "3月一次" + "\n" + a + "1年一次" + "\n" + b + "1年两次";
				break;
			}
		} else {
			visaTypeStringXg = a + "3月一次" + "\n" + a + "1年一次" + "\n" + a + "1年两次";
		}
		if ((!StringUtil.isEmptyOrNull(visaTypeAm)) && (!StringUtil.isEmptyOrNull(timeTypeAm))) {
			switch (Integer.parseInt(timeTypeAm)) {
			case 4:
				visaTypeStringAm = b + "3月一次" + "\n" + a + "1年一次" + "\n";
				break;
			default:
				visaTypeStringAm = a + "3月一次" + "\n" + b + "1年一次" + "\n";
				break;
			}
		} else {
			visaTypeStringAm = a + "3月一次" + "\n" + a + "1年一次" + "\n";
		}
		// 证件照
		if (truePhoto == null) {
			return new WebResponse(11, 11019).toJsonString();
		}
		final String photoPath = Makefile.makefile(truePhoto, photopath, sCode);
		logger.info("证件照地址photoPath：" + photoPath);
		System.out.println("\n\n\n" + "truePhoto" + photoPath);
		// 生成一个json字段存储数据库
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("firstName", firstName);
		jsonObject.put("lastName", lastName);
		jsonObject.put("surname", surname);
		jsonObject.put("spellName", spellName);
		jsonObject.put("sex", sex);
		jsonObject.put("nation", nation);
		jsonObject.put("brithplace", brithplace);
		jsonObject.put("hkPlace", hkPlace);
		jsonObject.put("idCardNo", idCardNo);
		jsonObject.put("brithtime", brithtime);
		jsonObject.put("telphone", telphone);
		jsonObject.put("uName", uName);
		jsonObject.put("uTelphone", uTelphone);
		jsonObject.put("rTelphone", rTelphone);
		jsonObject.put("rAddress", rAddress);
		jsonObject.put("recipient", recipient);
		jsonObject.put("postcode", postcode);
		jsonObject.put("visaType", jsonOType);
		logger.info("所有数据的json段" + jsonObject.toJSONString());
		Map<String, Object> datas = new HashMap<String, Object>() {
			{
				put("firstName", firstName);
				put("lastName", lastName);
				put("surname", surname);
				put("spellName", spellName);
				put("sex", sex);
				put("nation", nation);
				put("brithplace", brithplace);
				put("hkPlace", hkPlace);
				for (int i = 0; i < 18; i++) {
					put(mm[i], r[i]);
				}
				put("brithtime", brithtime);
				put("telphone", telphone);
				put("uName", uName);
				put("uTelphone", uTelphone);
				put("rTelphone", rTelphone);
				put("rAddress", rAddress);
				put("recipient", recipient);
				put("postcode", postcode);
				put("visaTypeStringAm", visaTypeStringAm);
				put("visaTypeStringXg", visaTypeStringXg);
				put("truePhoto", new PictureRenderData(145, 240, photoPath));
			}
		};
		// word文档相对路径
		String relativePath = "SecondVisa/" + sCode + ".docx";
		logger.info(" Word文档的相对路径relativePath：" + relativePath);
		// 绝对路径
		path = path + "\\" + "SecondVisa" + "\\" + sCode + ".docx";
		String realPath = request.getServletContext().getRealPath("WEB-INF/WordTemplate/中国公民出入境证件申请表.docx");
		logger.info("文档模板地址realPath：" + realPath);
		XWPFTemplate doc = XWPFTemplate.create(realPath);
		RenderAPI.render(doc, datas);
		logger.info("生成文档地址path：" + path);
		FileOutputStream out = new FileOutputStream(path);
		doc.write(out);
		out.flush();
		out.close();
		String jsonString = jsonObject.toJSONString();
		Object data = secondVisaService.cheeApplicationg(jsonString,xgAndAmMuch, sCode, photoPath,relativePath).toJsonString();
		logger.info("返回数据" + data.toString());
		return data;
	}

	// 响应政务服务调取文件
	@RequestMapping("/secondVisa/transferFile")
	@ResponseBody
	public Object transferFile(String data) {
		if (data == null)
			return new WebResponse(14, 14002).toJsonString();
		logger.info("接收到的data："+data);
		JSONObject dataJson = JSONObject.parseObject(data);
		JSONObject pagination = dataJson.getJSONObject("pagination");
		JSONObject filter = dataJson.getJSONObject("filter");
		int pageSize = pagination.getInteger("pageSize");
		int pageCurrent = pagination.getInteger("pageCurrent");
		System.out.println(JSONObject.toJSONString(filter));
		Integer state = filter.getInteger("filterType");
		Date start = filter.getDate("startDate");
		Date end = filter.getDate("endDate");

		WebResponse webResponse = new WebResponse();
		JSONObject jsonObject = new JSONObject();
		PageHelper.startPage(pageCurrent, pageSize);
		List<SecondVisaPojo> secondVisaPojos = secondVisaService.transferFile(state, start, end);
		PageInfo<SecondVisaPojo> pageInfo = new PageInfo<>(secondVisaPojos);
		jsonObject.put("totalRow", pageInfo.getTotal());
		jsonObject.put("pageCurrent", pageInfo.getPageNum());
		jsonObject.put("pageSize", pageInfo.getPageSize());

		webResponse.putresultData("pagination", jsonObject);
		webResponse.putresultData("data", secondVisaPojos);
		return webResponse.putsuccess().toJsonString();
	}

	// 改变申请状态
	@RequestMapping("/secondVisa/changeState")
	@ResponseBody
	public Object changeState(String data) {
		if (data == null)
			return new WebResponse(15, 15001).toJsonString();
		logger.info("接收到的data："+data);
		JSONObject dataJson = JSONObject.parseObject(data);
		if (JSONObject.toJSONString(dataJson) == null)
			return new WebResponse(15, 15002).toJsonString();
		String remark = dataJson.getString("remark");
		String sCode = dataJson.getString("sCode");
		Integer state = dataJson.getInteger("state");
		if(!(state==1||state==2))
			return new WebResponse(15, 15003).toJsonString();
		return secondVisaService.changeState(remark, sCode, state).toJsonString();
	}
	
	//查询记录状态
	@RequestMapping("/secondVisa/queryState")
	@ResponseBody
	public Object queryState(String sCode){
		if(sCode==null || sCode.length() == 0)
			return new WebResponse(16, 16001).toJsonString();
		logger.info("接收到的sCode："+sCode);
		return secondVisaService.queryState(sCode).toJsonString();
	}
}
