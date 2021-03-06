package com.hc.gqgs.pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class SecondVisaExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table second_visa
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table second_visa
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table second_visa
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table second_visa
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	public SecondVisaExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table second_visa
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table second_visa
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table second_visa
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table second_visa
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table second_visa
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table second_visa
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table second_visa
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table second_visa
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table second_visa
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table second_visa
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table second_visa
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

		public Criteria andSCodeIsNull() {
			addCriterion("s_code is null");
			return (Criteria) this;
		}

		public Criteria andSCodeIsNotNull() {
			addCriterion("s_code is not null");
			return (Criteria) this;
		}

		public Criteria andSCodeEqualTo(String value) {
			addCriterion("s_code =", value, "sCode");
			return (Criteria) this;
		}

		public Criteria andSCodeNotEqualTo(String value) {
			addCriterion("s_code <>", value, "sCode");
			return (Criteria) this;
		}

		public Criteria andSCodeGreaterThan(String value) {
			addCriterion("s_code >", value, "sCode");
			return (Criteria) this;
		}

		public Criteria andSCodeGreaterThanOrEqualTo(String value) {
			addCriterion("s_code >=", value, "sCode");
			return (Criteria) this;
		}

		public Criteria andSCodeLessThan(String value) {
			addCriterion("s_code <", value, "sCode");
			return (Criteria) this;
		}

		public Criteria andSCodeLessThanOrEqualTo(String value) {
			addCriterion("s_code <=", value, "sCode");
			return (Criteria) this;
		}

		public Criteria andSCodeLike(String value) {
			addCriterion("s_code like", value, "sCode");
			return (Criteria) this;
		}

		public Criteria andSCodeNotLike(String value) {
			addCriterion("s_code not like", value, "sCode");
			return (Criteria) this;
		}

		public Criteria andSCodeIn(List<String> values) {
			addCriterion("s_code in", values, "sCode");
			return (Criteria) this;
		}

		public Criteria andSCodeNotIn(List<String> values) {
			addCriterion("s_code not in", values, "sCode");
			return (Criteria) this;
		}

		public Criteria andSCodeBetween(String value1, String value2) {
			addCriterion("s_code between", value1, value2, "sCode");
			return (Criteria) this;
		}

		public Criteria andSCodeNotBetween(String value1, String value2) {
			addCriterion("s_code not between", value1, value2, "sCode");
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

		public Criteria andDataIsNull() {
			addCriterion("data is null");
			return (Criteria) this;
		}

		public Criteria andDataIsNotNull() {
			addCriterion("data is not null");
			return (Criteria) this;
		}

		public Criteria andDataEqualTo(String value) {
			addCriterion("data =", value, "data");
			return (Criteria) this;
		}

		public Criteria andDataNotEqualTo(String value) {
			addCriterion("data <>", value, "data");
			return (Criteria) this;
		}

		public Criteria andDataGreaterThan(String value) {
			addCriterion("data >", value, "data");
			return (Criteria) this;
		}

		public Criteria andDataGreaterThanOrEqualTo(String value) {
			addCriterion("data >=", value, "data");
			return (Criteria) this;
		}

		public Criteria andDataLessThan(String value) {
			addCriterion("data <", value, "data");
			return (Criteria) this;
		}

		public Criteria andDataLessThanOrEqualTo(String value) {
			addCriterion("data <=", value, "data");
			return (Criteria) this;
		}

		public Criteria andDataLike(String value) {
			addCriterion("data like", value, "data");
			return (Criteria) this;
		}

		public Criteria andDataNotLike(String value) {
			addCriterion("data not like", value, "data");
			return (Criteria) this;
		}

		public Criteria andDataIn(List<String> values) {
			addCriterion("data in", values, "data");
			return (Criteria) this;
		}

		public Criteria andDataNotIn(List<String> values) {
			addCriterion("data not in", values, "data");
			return (Criteria) this;
		}

		public Criteria andDataBetween(String value1, String value2) {
			addCriterion("data between", value1, value2, "data");
			return (Criteria) this;
		}

		public Criteria andDataNotBetween(String value1, String value2) {
			addCriterion("data not between", value1, value2, "data");
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

		public Criteria andPhotopathIsNull() {
			addCriterion("photoPath is null");
			return (Criteria) this;
		}

		public Criteria andPhotopathIsNotNull() {
			addCriterion("photoPath is not null");
			return (Criteria) this;
		}

		public Criteria andPhotopathEqualTo(String value) {
			addCriterion("photoPath =", value, "photopath");
			return (Criteria) this;
		}

		public Criteria andPhotopathNotEqualTo(String value) {
			addCriterion("photoPath <>", value, "photopath");
			return (Criteria) this;
		}

		public Criteria andPhotopathGreaterThan(String value) {
			addCriterion("photoPath >", value, "photopath");
			return (Criteria) this;
		}

		public Criteria andPhotopathGreaterThanOrEqualTo(String value) {
			addCriterion("photoPath >=", value, "photopath");
			return (Criteria) this;
		}

		public Criteria andPhotopathLessThan(String value) {
			addCriterion("photoPath <", value, "photopath");
			return (Criteria) this;
		}

		public Criteria andPhotopathLessThanOrEqualTo(String value) {
			addCriterion("photoPath <=", value, "photopath");
			return (Criteria) this;
		}

		public Criteria andPhotopathLike(String value) {
			addCriterion("photoPath like", value, "photopath");
			return (Criteria) this;
		}

		public Criteria andPhotopathNotLike(String value) {
			addCriterion("photoPath not like", value, "photopath");
			return (Criteria) this;
		}

		public Criteria andPhotopathIn(List<String> values) {
			addCriterion("photoPath in", values, "photopath");
			return (Criteria) this;
		}

		public Criteria andPhotopathNotIn(List<String> values) {
			addCriterion("photoPath not in", values, "photopath");
			return (Criteria) this;
		}

		public Criteria andPhotopathBetween(String value1, String value2) {
			addCriterion("photoPath between", value1, value2, "photopath");
			return (Criteria) this;
		}

		public Criteria andPhotopathNotBetween(String value1, String value2) {
			addCriterion("photoPath not between", value1, value2, "photopath");
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

		public Criteria andRemarkIsNull() {
			addCriterion("remark is null");
			return (Criteria) this;
		}

		public Criteria andRemarkIsNotNull() {
			addCriterion("remark is not null");
			return (Criteria) this;
		}

		public Criteria andRemarkEqualTo(String value) {
			addCriterion("remark =", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkNotEqualTo(String value) {
			addCriterion("remark <>", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkGreaterThan(String value) {
			addCriterion("remark >", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkGreaterThanOrEqualTo(String value) {
			addCriterion("remark >=", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkLessThan(String value) {
			addCriterion("remark <", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkLessThanOrEqualTo(String value) {
			addCriterion("remark <=", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkLike(String value) {
			addCriterion("remark like", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkNotLike(String value) {
			addCriterion("remark not like", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkIn(List<String> values) {
			addCriterion("remark in", values, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkNotIn(List<String> values) {
			addCriterion("remark not in", values, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkBetween(String value1, String value2) {
			addCriterion("remark between", value1, value2, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkNotBetween(String value1, String value2) {
			addCriterion("remark not between", value1, value2, "remark");
			return (Criteria) this;
		}

		public Criteria andXgandammuchIsNull() {
			addCriterion("xgAndAmMuch is null");
			return (Criteria) this;
		}

		public Criteria andXgandammuchIsNotNull() {
			addCriterion("xgAndAmMuch is not null");
			return (Criteria) this;
		}

		public Criteria andXgandammuchEqualTo(Integer value) {
			addCriterion("xgAndAmMuch =", value, "xgandammuch");
			return (Criteria) this;
		}

		public Criteria andXgandammuchNotEqualTo(Integer value) {
			addCriterion("xgAndAmMuch <>", value, "xgandammuch");
			return (Criteria) this;
		}

		public Criteria andXgandammuchGreaterThan(Integer value) {
			addCriterion("xgAndAmMuch >", value, "xgandammuch");
			return (Criteria) this;
		}

		public Criteria andXgandammuchGreaterThanOrEqualTo(Integer value) {
			addCriterion("xgAndAmMuch >=", value, "xgandammuch");
			return (Criteria) this;
		}

		public Criteria andXgandammuchLessThan(Integer value) {
			addCriterion("xgAndAmMuch <", value, "xgandammuch");
			return (Criteria) this;
		}

		public Criteria andXgandammuchLessThanOrEqualTo(Integer value) {
			addCriterion("xgAndAmMuch <=", value, "xgandammuch");
			return (Criteria) this;
		}

		public Criteria andXgandammuchIn(List<Integer> values) {
			addCriterion("xgAndAmMuch in", values, "xgandammuch");
			return (Criteria) this;
		}

		public Criteria andXgandammuchNotIn(List<Integer> values) {
			addCriterion("xgAndAmMuch not in", values, "xgandammuch");
			return (Criteria) this;
		}

		public Criteria andXgandammuchBetween(Integer value1, Integer value2) {
			addCriterion("xgAndAmMuch between", value1, value2, "xgandammuch");
			return (Criteria) this;
		}

		public Criteria andXgandammuchNotBetween(Integer value1, Integer value2) {
			addCriterion("xgAndAmMuch not between", value1, value2, "xgandammuch");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table second_visa
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
     * This class corresponds to the database table second_visa
     *
     * @mbg.generated do_not_delete_during_merge Thu Dec 07 16:50:01 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}