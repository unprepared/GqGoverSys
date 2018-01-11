package com.hc.gqgs.pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class CoupleAwartExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table couple_awart
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table couple_awart
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table couple_awart
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table couple_awart
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	public CoupleAwartExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table couple_awart
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table couple_awart
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table couple_awart
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table couple_awart
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table couple_awart
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table couple_awart
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table couple_awart
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table couple_awart
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table couple_awart
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table couple_awart
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table couple_awart
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andTidIsNull() {
			addCriterion("tid is null");
			return (Criteria) this;
		}

		public Criteria andTidIsNotNull() {
			addCriterion("tid is not null");
			return (Criteria) this;
		}

		public Criteria andTidEqualTo(Integer value) {
			addCriterion("tid =", value, "tid");
			return (Criteria) this;
		}

		public Criteria andTidNotEqualTo(Integer value) {
			addCriterion("tid <>", value, "tid");
			return (Criteria) this;
		}

		public Criteria andTidGreaterThan(Integer value) {
			addCriterion("tid >", value, "tid");
			return (Criteria) this;
		}

		public Criteria andTidGreaterThanOrEqualTo(Integer value) {
			addCriterion("tid >=", value, "tid");
			return (Criteria) this;
		}

		public Criteria andTidLessThan(Integer value) {
			addCriterion("tid <", value, "tid");
			return (Criteria) this;
		}

		public Criteria andTidLessThanOrEqualTo(Integer value) {
			addCriterion("tid <=", value, "tid");
			return (Criteria) this;
		}

		public Criteria andTidIn(List<Integer> values) {
			addCriterion("tid in", values, "tid");
			return (Criteria) this;
		}

		public Criteria andTidNotIn(List<Integer> values) {
			addCriterion("tid not in", values, "tid");
			return (Criteria) this;
		}

		public Criteria andTidBetween(Integer value1, Integer value2) {
			addCriterion("tid between", value1, value2, "tid");
			return (Criteria) this;
		}

		public Criteria andTidNotBetween(Integer value1, Integer value2) {
			addCriterion("tid not between", value1, value2, "tid");
			return (Criteria) this;
		}

		public Criteria andCCodeIsNull() {
			addCriterion("c_code is null");
			return (Criteria) this;
		}

		public Criteria andCCodeIsNotNull() {
			addCriterion("c_code is not null");
			return (Criteria) this;
		}

		public Criteria andCCodeEqualTo(String value) {
			addCriterion("c_code =", value, "cCode");
			return (Criteria) this;
		}

		public Criteria andCCodeNotEqualTo(String value) {
			addCriterion("c_code <>", value, "cCode");
			return (Criteria) this;
		}

		public Criteria andCCodeGreaterThan(String value) {
			addCriterion("c_code >", value, "cCode");
			return (Criteria) this;
		}

		public Criteria andCCodeGreaterThanOrEqualTo(String value) {
			addCriterion("c_code >=", value, "cCode");
			return (Criteria) this;
		}

		public Criteria andCCodeLessThan(String value) {
			addCriterion("c_code <", value, "cCode");
			return (Criteria) this;
		}

		public Criteria andCCodeLessThanOrEqualTo(String value) {
			addCriterion("c_code <=", value, "cCode");
			return (Criteria) this;
		}

		public Criteria andCCodeLike(String value) {
			addCriterion("c_code like", value, "cCode");
			return (Criteria) this;
		}

		public Criteria andCCodeNotLike(String value) {
			addCriterion("c_code not like", value, "cCode");
			return (Criteria) this;
		}

		public Criteria andCCodeIn(List<String> values) {
			addCriterion("c_code in", values, "cCode");
			return (Criteria) this;
		}

		public Criteria andCCodeNotIn(List<String> values) {
			addCriterion("c_code not in", values, "cCode");
			return (Criteria) this;
		}

		public Criteria andCCodeBetween(String value1, String value2) {
			addCriterion("c_code between", value1, value2, "cCode");
			return (Criteria) this;
		}

		public Criteria andCCodeNotBetween(String value1, String value2) {
			addCriterion("c_code not between", value1, value2, "cCode");
			return (Criteria) this;
		}

		public Criteria andPathIsNull() {
			addCriterion("path is null");
			return (Criteria) this;
		}

		public Criteria andPathIsNotNull() {
			addCriterion("path is not null");
			return (Criteria) this;
		}

		public Criteria andPathEqualTo(String value) {
			addCriterion("path =", value, "path");
			return (Criteria) this;
		}

		public Criteria andPathNotEqualTo(String value) {
			addCriterion("path <>", value, "path");
			return (Criteria) this;
		}

		public Criteria andPathGreaterThan(String value) {
			addCriterion("path >", value, "path");
			return (Criteria) this;
		}

		public Criteria andPathGreaterThanOrEqualTo(String value) {
			addCriterion("path >=", value, "path");
			return (Criteria) this;
		}

		public Criteria andPathLessThan(String value) {
			addCriterion("path <", value, "path");
			return (Criteria) this;
		}

		public Criteria andPathLessThanOrEqualTo(String value) {
			addCriterion("path <=", value, "path");
			return (Criteria) this;
		}

		public Criteria andPathLike(String value) {
			addCriterion("path like", value, "path");
			return (Criteria) this;
		}

		public Criteria andPathNotLike(String value) {
			addCriterion("path not like", value, "path");
			return (Criteria) this;
		}

		public Criteria andPathIn(List<String> values) {
			addCriterion("path in", values, "path");
			return (Criteria) this;
		}

		public Criteria andPathNotIn(List<String> values) {
			addCriterion("path not in", values, "path");
			return (Criteria) this;
		}

		public Criteria andPathBetween(String value1, String value2) {
			addCriterion("path between", value1, value2, "path");
			return (Criteria) this;
		}

		public Criteria andPathNotBetween(String value1, String value2) {
			addCriterion("path not between", value1, value2, "path");
			return (Criteria) this;
		}

		public Criteria andPhotoPathIsNull() {
			addCriterion("photo_path is null");
			return (Criteria) this;
		}

		public Criteria andPhotoPathIsNotNull() {
			addCriterion("photo_path is not null");
			return (Criteria) this;
		}

		public Criteria andPhotoPathEqualTo(String value) {
			addCriterion("photo_path =", value, "photoPath");
			return (Criteria) this;
		}

		public Criteria andPhotoPathNotEqualTo(String value) {
			addCriterion("photo_path <>", value, "photoPath");
			return (Criteria) this;
		}

		public Criteria andPhotoPathGreaterThan(String value) {
			addCriterion("photo_path >", value, "photoPath");
			return (Criteria) this;
		}

		public Criteria andPhotoPathGreaterThanOrEqualTo(String value) {
			addCriterion("photo_path >=", value, "photoPath");
			return (Criteria) this;
		}

		public Criteria andPhotoPathLessThan(String value) {
			addCriterion("photo_path <", value, "photoPath");
			return (Criteria) this;
		}

		public Criteria andPhotoPathLessThanOrEqualTo(String value) {
			addCriterion("photo_path <=", value, "photoPath");
			return (Criteria) this;
		}

		public Criteria andPhotoPathLike(String value) {
			addCriterion("photo_path like", value, "photoPath");
			return (Criteria) this;
		}

		public Criteria andPhotoPathNotLike(String value) {
			addCriterion("photo_path not like", value, "photoPath");
			return (Criteria) this;
		}

		public Criteria andPhotoPathIn(List<String> values) {
			addCriterion("photo_path in", values, "photoPath");
			return (Criteria) this;
		}

		public Criteria andPhotoPathNotIn(List<String> values) {
			addCriterion("photo_path not in", values, "photoPath");
			return (Criteria) this;
		}

		public Criteria andPhotoPathBetween(String value1, String value2) {
			addCriterion("photo_path between", value1, value2, "photoPath");
			return (Criteria) this;
		}

		public Criteria andPhotoPathNotBetween(String value1, String value2) {
			addCriterion("photo_path not between", value1, value2, "photoPath");
			return (Criteria) this;
		}

		public Criteria andHkPhotoPathIsNull() {
			addCriterion("hk_photo_path is null");
			return (Criteria) this;
		}

		public Criteria andHkPhotoPathIsNotNull() {
			addCriterion("hk_photo_path is not null");
			return (Criteria) this;
		}

		public Criteria andHkPhotoPathEqualTo(String value) {
			addCriterion("hk_photo_path =", value, "hkPhotoPath");
			return (Criteria) this;
		}

		public Criteria andHkPhotoPathNotEqualTo(String value) {
			addCriterion("hk_photo_path <>", value, "hkPhotoPath");
			return (Criteria) this;
		}

		public Criteria andHkPhotoPathGreaterThan(String value) {
			addCriterion("hk_photo_path >", value, "hkPhotoPath");
			return (Criteria) this;
		}

		public Criteria andHkPhotoPathGreaterThanOrEqualTo(String value) {
			addCriterion("hk_photo_path >=", value, "hkPhotoPath");
			return (Criteria) this;
		}

		public Criteria andHkPhotoPathLessThan(String value) {
			addCriterion("hk_photo_path <", value, "hkPhotoPath");
			return (Criteria) this;
		}

		public Criteria andHkPhotoPathLessThanOrEqualTo(String value) {
			addCriterion("hk_photo_path <=", value, "hkPhotoPath");
			return (Criteria) this;
		}

		public Criteria andHkPhotoPathLike(String value) {
			addCriterion("hk_photo_path like", value, "hkPhotoPath");
			return (Criteria) this;
		}

		public Criteria andHkPhotoPathNotLike(String value) {
			addCriterion("hk_photo_path not like", value, "hkPhotoPath");
			return (Criteria) this;
		}

		public Criteria andHkPhotoPathIn(List<String> values) {
			addCriterion("hk_photo_path in", values, "hkPhotoPath");
			return (Criteria) this;
		}

		public Criteria andHkPhotoPathNotIn(List<String> values) {
			addCriterion("hk_photo_path not in", values, "hkPhotoPath");
			return (Criteria) this;
		}

		public Criteria andHkPhotoPathBetween(String value1, String value2) {
			addCriterion("hk_photo_path between", value1, value2, "hkPhotoPath");
			return (Criteria) this;
		}

		public Criteria andHkPhotoPathNotBetween(String value1, String value2) {
			addCriterion("hk_photo_path not between", value1, value2, "hkPhotoPath");
			return (Criteria) this;
		}

		public Criteria andIdcardPathIsNull() {
			addCriterion("idCard_path is null");
			return (Criteria) this;
		}

		public Criteria andIdcardPathIsNotNull() {
			addCriterion("idCard_path is not null");
			return (Criteria) this;
		}

		public Criteria andIdcardPathEqualTo(String value) {
			addCriterion("idCard_path =", value, "idcardPath");
			return (Criteria) this;
		}

		public Criteria andIdcardPathNotEqualTo(String value) {
			addCriterion("idCard_path <>", value, "idcardPath");
			return (Criteria) this;
		}

		public Criteria andIdcardPathGreaterThan(String value) {
			addCriterion("idCard_path >", value, "idcardPath");
			return (Criteria) this;
		}

		public Criteria andIdcardPathGreaterThanOrEqualTo(String value) {
			addCriterion("idCard_path >=", value, "idcardPath");
			return (Criteria) this;
		}

		public Criteria andIdcardPathLessThan(String value) {
			addCriterion("idCard_path <", value, "idcardPath");
			return (Criteria) this;
		}

		public Criteria andIdcardPathLessThanOrEqualTo(String value) {
			addCriterion("idCard_path <=", value, "idcardPath");
			return (Criteria) this;
		}

		public Criteria andIdcardPathLike(String value) {
			addCriterion("idCard_path like", value, "idcardPath");
			return (Criteria) this;
		}

		public Criteria andIdcardPathNotLike(String value) {
			addCriterion("idCard_path not like", value, "idcardPath");
			return (Criteria) this;
		}

		public Criteria andIdcardPathIn(List<String> values) {
			addCriterion("idCard_path in", values, "idcardPath");
			return (Criteria) this;
		}

		public Criteria andIdcardPathNotIn(List<String> values) {
			addCriterion("idCard_path not in", values, "idcardPath");
			return (Criteria) this;
		}

		public Criteria andIdcardPathBetween(String value1, String value2) {
			addCriterion("idCard_path between", value1, value2, "idcardPath");
			return (Criteria) this;
		}

		public Criteria andIdcardPathNotBetween(String value1, String value2) {
			addCriterion("idCard_path not between", value1, value2, "idcardPath");
			return (Criteria) this;
		}

		public Criteria andMcPicture3IsNull() {
			addCriterion("mc_picture3 is null");
			return (Criteria) this;
		}

		public Criteria andMcPicture3IsNotNull() {
			addCriterion("mc_picture3 is not null");
			return (Criteria) this;
		}

		public Criteria andMcPicture3EqualTo(String value) {
			addCriterion("mc_picture3 =", value, "mcPicture3");
			return (Criteria) this;
		}

		public Criteria andMcPicture3NotEqualTo(String value) {
			addCriterion("mc_picture3 <>", value, "mcPicture3");
			return (Criteria) this;
		}

		public Criteria andMcPicture3GreaterThan(String value) {
			addCriterion("mc_picture3 >", value, "mcPicture3");
			return (Criteria) this;
		}

		public Criteria andMcPicture3GreaterThanOrEqualTo(String value) {
			addCriterion("mc_picture3 >=", value, "mcPicture3");
			return (Criteria) this;
		}

		public Criteria andMcPicture3LessThan(String value) {
			addCriterion("mc_picture3 <", value, "mcPicture3");
			return (Criteria) this;
		}

		public Criteria andMcPicture3LessThanOrEqualTo(String value) {
			addCriterion("mc_picture3 <=", value, "mcPicture3");
			return (Criteria) this;
		}

		public Criteria andMcPicture3Like(String value) {
			addCriterion("mc_picture3 like", value, "mcPicture3");
			return (Criteria) this;
		}

		public Criteria andMcPicture3NotLike(String value) {
			addCriterion("mc_picture3 not like", value, "mcPicture3");
			return (Criteria) this;
		}

		public Criteria andMcPicture3In(List<String> values) {
			addCriterion("mc_picture3 in", values, "mcPicture3");
			return (Criteria) this;
		}

		public Criteria andMcPicture3NotIn(List<String> values) {
			addCriterion("mc_picture3 not in", values, "mcPicture3");
			return (Criteria) this;
		}

		public Criteria andMcPicture3Between(String value1, String value2) {
			addCriterion("mc_picture3 between", value1, value2, "mcPicture3");
			return (Criteria) this;
		}

		public Criteria andMcPicture3NotBetween(String value1, String value2) {
			addCriterion("mc_picture3 not between", value1, value2, "mcPicture3");
			return (Criteria) this;
		}

		public Criteria andStateIsNull() {
			addCriterion("state is null");
			return (Criteria) this;
		}

		public Criteria andStateIsNotNull() {
			addCriterion("state is not null");
			return (Criteria) this;
		}

		public Criteria andStateEqualTo(Integer value) {
			addCriterion("state =", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotEqualTo(Integer value) {
			addCriterion("state <>", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateGreaterThan(Integer value) {
			addCriterion("state >", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateGreaterThanOrEqualTo(Integer value) {
			addCriterion("state >=", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateLessThan(Integer value) {
			addCriterion("state <", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateLessThanOrEqualTo(Integer value) {
			addCriterion("state <=", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateIn(List<Integer> values) {
			addCriterion("state in", values, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotIn(List<Integer> values) {
			addCriterion("state not in", values, "state");
			return (Criteria) this;
		}

		public Criteria andStateBetween(Integer value1, Integer value2) {
			addCriterion("state between", value1, value2, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotBetween(Integer value1, Integer value2) {
			addCriterion("state not between", value1, value2, "state");
			return (Criteria) this;
		}

		public Criteria andTimeIsNull() {
			addCriterion("time is null");
			return (Criteria) this;
		}

		public Criteria andTimeIsNotNull() {
			addCriterion("time is not null");
			return (Criteria) this;
		}

		public Criteria andTimeEqualTo(Date value) {
			addCriterion("time =", value, "time");
			return (Criteria) this;
		}

		public Criteria andTimeNotEqualTo(Date value) {
			addCriterion("time <>", value, "time");
			return (Criteria) this;
		}

		public Criteria andTimeGreaterThan(Date value) {
			addCriterion("time >", value, "time");
			return (Criteria) this;
		}

		public Criteria andTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("time >=", value, "time");
			return (Criteria) this;
		}

		public Criteria andTimeLessThan(Date value) {
			addCriterion("time <", value, "time");
			return (Criteria) this;
		}

		public Criteria andTimeLessThanOrEqualTo(Date value) {
			addCriterion("time <=", value, "time");
			return (Criteria) this;
		}

		public Criteria andTimeIn(List<Date> values) {
			addCriterion("time in", values, "time");
			return (Criteria) this;
		}

		public Criteria andTimeNotIn(List<Date> values) {
			addCriterion("time not in", values, "time");
			return (Criteria) this;
		}

		public Criteria andTimeBetween(Date value1, Date value2) {
			addCriterion("time between", value1, value2, "time");
			return (Criteria) this;
		}

		public Criteria andTimeNotBetween(Date value1, Date value2) {
			addCriterion("time not between", value1, value2, "time");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table couple_awart
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table couple_awart
     *
     * @mbg.generated do_not_delete_during_merge Thu Dec 07 16:50:01 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}