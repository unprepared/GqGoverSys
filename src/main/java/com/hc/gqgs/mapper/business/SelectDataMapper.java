package com.hc.gqgs.mapper.business;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hc.gqgs.pojo.business.CoupleAwartPojo;

public interface SelectDataMapper {
	List<CoupleAwartPojo> selectData(@Param("state") Integer state,@Param("start") Date start,@Param("end") Date end);

}
