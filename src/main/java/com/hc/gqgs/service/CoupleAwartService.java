package com.hc.gqgs.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hc.gqgs.json.WebResponse;
import com.hc.gqgs.mapper.CoupleAwartMapper;
import com.hc.gqgs.mapper.business.SelectDataMapper;
import com.hc.gqgs.pojo.CoupleAwart;
import com.hc.gqgs.pojo.business.CoupleAwartPojo;

//夫妻投靠
@Service
public class CoupleAwartService {
	@Autowired
	CoupleAwartMapper coupleAwartMapper;
	@Autowired
	SelectDataMapper selectDataMapper;

	public WebResponse coupleAwartService(String cCode, String relativePath, String photoPath, String hkphotoPath,
			String idCardPath, String mcPicture3) {
		WebResponse webResponse = new WebResponse();
		CoupleAwart coupleAwart = new CoupleAwart();
		coupleAwart.setcCode(cCode);
		coupleAwart.setPath(relativePath);
		coupleAwart.setHkPhotoPath(hkphotoPath);
		coupleAwart.setIdcardPath(idCardPath);
		coupleAwart.setMcPicture3(mcPicture3);
		coupleAwart.setPhotoPath(photoPath);
		coupleAwart.setTime(new Date());
		coupleAwart.setState(0);
		if (coupleAwartMapper.insert(coupleAwart) < 1)
			return webResponse.putErrorCode(10, 10001);
		webResponse.putresultData("cCode", cCode);
		return webResponse.putsuccess();
	}

	// 返回数据给政务窗口
	public List<CoupleAwartPojo> transferFileto(Integer state,Date start,Date end) {
		List<CoupleAwartPojo> coupleAwartPojos = selectDataMapper.selectData(state, start, end);
		return coupleAwartPojos;
	}
	 
}
