package com.hc.gqgs.mapper;

import com.hc.gqgs.pojo.CoupleAwart;
import com.hc.gqgs.pojo.CoupleAwartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoupleAwartMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table couple_awart
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	long countByExample(CoupleAwartExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table couple_awart
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	int deleteByExample(CoupleAwartExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table couple_awart
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	int deleteByPrimaryKey(Integer tid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table couple_awart
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	int insert(CoupleAwart record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table couple_awart
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	int insertSelective(CoupleAwart record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table couple_awart
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	List<CoupleAwart> selectByExample(CoupleAwartExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table couple_awart
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	CoupleAwart selectByPrimaryKey(Integer tid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table couple_awart
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	int updateByExampleSelective(@Param("record") CoupleAwart record, @Param("example") CoupleAwartExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table couple_awart
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	int updateByExample(@Param("record") CoupleAwart record, @Param("example") CoupleAwartExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table couple_awart
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	int updateByPrimaryKeySelective(CoupleAwart record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table couple_awart
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	int updateByPrimaryKey(CoupleAwart record);
}