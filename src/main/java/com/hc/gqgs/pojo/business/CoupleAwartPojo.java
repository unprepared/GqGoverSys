package com.hc.gqgs.pojo.business;

import java.util.Date;

public class CoupleAwartPojo {
	private String cCode;
	private String path;
	private String hkPhotoPath;
	private String idCardPath;
	private String mcPicture;
	private String photoPath;
	private Date time;
	private Integer state;
	public String getcCode() {
		return cCode;
	}
	public void setcCode(String cCode) {
		this.cCode = cCode;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getHkPhotoPath() {
		return hkPhotoPath;
	}
	public void setHkPhotoPath(String hkPhotoPath) {
		this.hkPhotoPath = hkPhotoPath;
	}
	public String getIdCardPath() {
		return idCardPath;
	}
	public void setIdCardPath(String idCardPath) {
		this.idCardPath = idCardPath;
	}
	public String getMcPicture() {
		return mcPicture;
	}
	public void setMcPicture(String mcPicture) {
		this.mcPicture = mcPicture;
	}
	public String getPhotoPath() {
		return photoPath;
	}
	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}	
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "CoupleAwartPojo [cCode=" + cCode + ", path=" + path + ", hkPhotoPath=" + hkPhotoPath + ", idCardPath="
				+ idCardPath + ", mcPicture=" + mcPicture + ", photoPath=" + photoPath + ", time=" + time + ", state="
				+ state + "]";
	}
	
	
	
}
