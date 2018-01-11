package com.hc.gqgs.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hc.gqgs.json.WebResponse;
import com.hc.gqgs.mapper.SecondVisaMapper;
import com.hc.gqgs.mapper.business.SelectinfoMapper;
import com.hc.gqgs.pojo.SecondVisa;
import com.hc.gqgs.pojo.SecondVisaExample;
import com.hc.gqgs.pojo.business.SecondVisaPojo;

//二次签注
@Service
public class SecondVisaService {
	@Autowired
	SecondVisaMapper secondVisaMapper;
	@Autowired
	SelectinfoMapper selectinfoMapper;

	// 接收微信公众号端的信息
	public WebResponse cheeApplicationg(String jsonString, Integer xgAndAmMuch, String sCode, String photoPath,String relativePath) {
		WebResponse webResponse = new WebResponse();
		photoPath = "SecondVisa/photo/" + sCode + ".png";
//		photoPath = photoPath.substring(photoPath.indexOf("SecondVisa"), photoPath.length());
		SecondVisa secondVisa = new SecondVisa();
		secondVisa.setsCode(sCode);
		secondVisa.setData(jsonString);
		secondVisa.setPath(relativePath);
		secondVisa.setState(0);
		secondVisa.setPhotopath(photoPath);
		secondVisa.setTime(new Date());
		secondVisa.setXgandammuch(xgAndAmMuch);
		if (secondVisaMapper.insert(secondVisa) < 1) {
			return webResponse.putErrorCode(10, 10001);
		}
		webResponse.putresultData("sCode", sCode);
		return webResponse.putsuccess();
	}

	// 返回数据给政务窗口
	@Transactional
	public List<SecondVisaPojo> transferFile(Integer state,Date start,Date end) {
//		WebResponse webResponse = new WebResponse();
		List<SecondVisaPojo> secondVisaPojos = selectinfoMapper.selectinfo(state, start, end);
//		System.out.println("查询出的数据：" + JSONArray.toJSONString(secondVisaPojos));
//		webResponse.putresultData("data", secondVisaPojos);
//		return webResponse.putsuccess();
		return secondVisaPojos;
	}


	//改变申请状态
	public WebResponse changeState(String remark, String sCode, Integer state){
		WebResponse webResponse = new WebResponse();
		SecondVisa secondVisa = new SecondVisa();
		secondVisa.setState(state);
		secondVisa.setRemark(remark);
		SecondVisaExample secondVisaExample = new SecondVisaExample();
		SecondVisaExample.Criteria criteria = secondVisaExample.createCriteria();
		criteria.andSCodeEqualTo(sCode);
		criteria.andStateEqualTo(0);
		if(secondVisaMapper.updateByExampleSelective(secondVisa, secondVisaExample) < 1)
			return webResponse.putErrorCode(10, 10001);
		return webResponse.putsuccess();
	}
	
	//查询什么记录状态
	public WebResponse queryState(String sCode){
		WebResponse webResponse = new WebResponse();
		SecondVisaExample secondVisaExample = new SecondVisaExample();
		SecondVisaExample.Criteria criteria = secondVisaExample.createCriteria();
		criteria.andSCodeEqualTo(sCode);
		List<SecondVisa> secondVisas = secondVisaMapper.selectByExample(secondVisaExample);
		if(secondVisas==null || secondVisas.size()==0)
			return webResponse.putErrorCode(16, 16002);//查出来的数据为空，记录不存在
		webResponse.putresultData("state", secondVisas.get(0).getState());
		webResponse.putresultData("remark", secondVisas.get(0).getRemark());
		webResponse.putresultData("sCode", secondVisas.get(0).getsCode());
		webResponse.putresultData("xgAndAmMuch", secondVisas.get(0).getXgandammuch());
		return webResponse.putsuccess();
	}
}
