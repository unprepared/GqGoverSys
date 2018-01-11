package com.hc.gqgs.controller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.deepoove.poi.XWPFTemplate;
import com.deepoove.poi.data.PictureRenderData;
import com.deepoove.poi.data.TableRenderData;
import com.deepoove.poi.render.RenderAPI;
import com.hc.gqgs.tools.Makefile;

public class test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * int c =9633; int d = 9632; char a = (char)9633; char b = (char)9632;
		 * System.out.println(b + "三月一次" + "\n" + a + "一年一次" + "\n" + a +
		 * "一年两次"); System.out.println(b);
		 */
		/*
		 * String idCardNo = "362527199505280514"; String[] idCardarr = new
		 * String[idCardNo.length()]; for(int i = 0; i < idCardNo.length();
		 * i++){ idCardarr[i] = idCardNo.substring(i, i+1);
		 * System.out.println(idCardarr[i]); }
		 */
		/*
		 * //空心框 char a = (char)9633; //实心框 char b = (char)9632; String idCardNo
		 * = "362527199505280514"; final String visaTypeStringXg = a + "三月一次" +
		 * "\n" + a + "一年一次" + "\n" + b + "一年两次"; final String[] r = new
		 * String[idCardNo.length()]; for(int i = 0; i < idCardNo.length();
		 * i++){ r[i] = idCardNo.substring(i, i+1); } Map<String, Object> datas
		 * = new HashMap<String, Object>() { { String
		 * []mm={"1","2","3","4","5","6","7","8","9","10","11","12","13","14",
		 * "15","16","17","18"}; for(int i=0;i<18;i++){ put(mm[i],r[i]); }
		 * put("visaTypeStringXg", visaTypeStringXg); put("truePhoto", new
		 * PictureRenderData(100, 120,
		 * "C:/Users/Administrator/Desktop/12049e17f41549fb867d87ac32895671.jpg"
		 * )); } };
		 * 
		 * XWPFTemplate doc = XWPFTemplate.create(
		 * "src/main/java/com/hc/gqgs/standword/中国公民出入境证件申请表.docx");
		 * RenderAPI.render(doc, datas); FileOutputStream out = new
		 * FileOutputStream("F:/我的/test.docx"); doc.write(out); out.flush();
		 * out.close();
		 */
		
		 BufferedImage image = ImageIO.read(new
		 File("C:/Users/Administrator/Desktop/61c9e06d83e6450191c97bae2e7e637f.png")); 
		 int width = image.getWidth(); int height = image.getHeight();
		  System.out.println("图片的尺寸为：" + width + "*" + height);
		 
	/*	String photoPath = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAASwAAADICAYAAABS39xVAAAgAElEQVR4nGS9Z3hUV7qt+0kE2ziHdiBIFSURjYlCUlWpcklCIEQOEso5Z5FzNMEGYzDYxuCMTTsHwOSck8ggcg529773nrv3Puc9P+aqkvD+MZ8qVa1apaYfvT3GmOObLRu37mDjtp38sX0Xm7bvYsvOXfyxYw9/7NjD5p17+WP3Xrbu3s+OfYfYuf8wO/cfZvfBo+w5dIx9R45r6wT7j6p16HgDh0+e4UjDGY6dPs+x0+c5cfYiDWcbOXnuEsfOX+TExcucvHSFExcvc+rCZRrON3Li7AVOnrvC0bOXOXr6EodPX+LQqYscPnmeg8fPsufoWXYdPs22/SfYvO8Yv+84wi9bD/LPDftY+8M2Vq/bxEdf/sHKzzawdM0vLPrwZ6Ys+pKS6R8xunQxXTz59B5QTu/ESt6KK6V7QgVdfaUYrdmYrHkYYnLQ2w…N5Q3EL28nNxv8hTUbOXawBr9gnSs7V3iKRpUTMPj6ph4+EM1YUdr3HEV5kWua/T5zaZb4jAqm/mPtqnN9jZCL9LZOA1uY7jk5xt3UH7FN3KHR2/yYT42wJQ2qdui1GLAxavxuIg0jm+zspFqWS0VgxvYQmgPFSQN/1wkGo7c1MwJA48HWdv4vg4A6Ozt1jLTVW/4trXsYl1tDEhnz9X9AROUklE18RtdE1StXz31AaOT22gY3ID3WwTmJ4hD1X35F30svLb2muDNCvUbT+/ic6pu+hnrIrabTbRd+Ex0jMPxaaQOi+fsDbmxyx6+6k4u/m7i53eU7ZVtrSD9E+0KczMvUL2Mq+Rp/yrgeJrZIsktudKLEpm/g1ypTfIl99juPQWuYU/hehO4yAVSOR/fo/8tQ8oXCHv1fDiLk5e30fhyp84tbLPhHayLYxc38fI0oFgWyNLezi1tI/T//gPxla+4MyNrxhd/YT/A9P0imbStaJmAAAAAElFTkSuQmCC";
		photoPath = photoPath.substring(22,photoPath.length());
		System.out.println("data:image/png;base64,".length());
		System.out.println(photoPath);*/
		/*String  photo[] = new String[2];
		photo[0]="hfdhsfdhthjhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh";
		photo[1]="hfdhsfdhthjhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh";
		
		System.out.println(photo[0]+photo[1]);*/
		/*JSONArray jsonArray = new JSONArray();
		jsonArray.add(0,"qushi");
		jsonArray.add(1,"hhaha");
		jsonArray.add(0,"你好");
		jsonArray.remove(0+1);
		System.out.println(jsonArray.toJSONString());*/
		/*try{
		String photopath= "C:\\Users\\Administrator\\Desktop\\1";
		String cCode = "2";
		File filePath = new File(photopath,cCode);
		if (!filePath.getParentFile().exists()) {
			filePath.getParentFile().mkdirs();
		}
		System.out.println("好的 ");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("死了");
		}*/
		String aStrings = "15";
		Integer bInteger = Integer.parseInt(aStrings);
		System.out.println(aStrings);
	}

}
