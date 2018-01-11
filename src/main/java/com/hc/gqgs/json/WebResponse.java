package com.hc.gqgs.json;

import com.alibaba.fastjson.JSONObject;

public class WebResponse {

	private JSONObject data;
	private JSONObject resultData = new JSONObject();;

	public WebResponse(Integer errcode, String massage) {
		data = new JSONObject();
		data.put("errcode", errcode);
		data.put("message", massage);
	}

	public WebResponse() {
		data = new JSONObject();
	}

	public WebResponse(int errcode, int massage) {
		data = new JSONObject();
		data.put("errcode", errcode);
		data.put("message", massage);
	}

	public WebResponse putErrorCode(Integer errcode, Integer massage) {
		this.data.put("errcode", errcode);
		this.data.put("message", massage);
		return this;
	}

	public WebResponse putsuccess() {
		data.put("errcode", 0);
		data.put("message", 0);
		return this;
	}

	public Object putresultData(String key, Object value) {
		resultData.put(key, value);
		return this;
	}

	public Object toJsonString() {
		data.put("resultData", resultData);
		return JSONObject.toJSON(data);
	}
}
