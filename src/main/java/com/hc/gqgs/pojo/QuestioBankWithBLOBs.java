package com.hc.gqgs.pojo;

public class QuestioBankWithBLOBs extends QuestioBank {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column questio_bank.title
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	private String title;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column questio_bank.answer
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	private String answer;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column questio_bank.title
	 * @return  the value of questio_bank.title
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column questio_bank.title
	 * @param title  the value for questio_bank.title
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column questio_bank.answer
	 * @return  the value of questio_bank.answer
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	public String getAnswer() {
		return answer;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column questio_bank.answer
	 * @param answer  the value for questio_bank.answer
	 * @mbg.generated  Wed Jan 10 09:50:14 CST 2018
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}
}