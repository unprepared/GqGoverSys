package com.hc.gqgs.mapper;

import com.hc.gqgs.pojo.SecondVisa;
import com.hc.gqgs.pojo.SecondVisaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecondVisaMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table second_visa
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	long countByExample(SecondVisaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table second_visa
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	int deleteByExample(SecondVisaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table second_visa
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	int deleteByPrimaryKey(Integer tid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table second_visa
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	int insert(SecondVisa record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table second_visa
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	int insertSelective(SecondVisa record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table second_visa
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	List<SecondVisa> selectByExample(SecondVisaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table second_visa
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	SecondVisa selectByPrimaryKey(Integer tid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table second_visa
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	int updateByExampleSelective(@Param("record") SecondVisa record, @Param("example") SecondVisaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table second_visa
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	int updateByExample(@Param("record") SecondVisa record, @Param("example") SecondVisaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table second_visa
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	int updateByPrimaryKeySelective(SecondVisa record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table second_visa
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	int updateByPrimaryKey(SecondVisa record);
}