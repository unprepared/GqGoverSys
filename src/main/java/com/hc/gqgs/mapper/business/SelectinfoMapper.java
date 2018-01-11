package com.hc.gqgs.mapper.business;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hc.gqgs.pojo.business.SecondVisaPojo;

public interface SelectinfoMapper {
	
	List<SecondVisaPojo> selectinfo(@Param("state") Integer state,@Param("start") Date start,@Param("end") Date end);
}
