package com.zwxu.lc.um.model;

import java.util.Date;

public class Account {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_account.id
	 * @mbggenerated  Tue Jan 10 13:16:43 CST 2017
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_account.loginname
	 * @mbggenerated  Tue Jan 10 13:16:43 CST 2017
	 */
	private String loginname;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_account.password
	 * @mbggenerated  Tue Jan 10 13:16:43 CST 2017
	 */
	private String password;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_account.rid
	 * @mbggenerated  Tue Jan 10 13:16:43 CST 2017
	 */
	private Integer rid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_account.create_time
	 * @mbggenerated  Tue Jan 10 13:16:43 CST 2017
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_account.delete_flag
	 * @mbggenerated  Tue Jan 10 13:16:43 CST 2017
	 */
	private String deleteFlag;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_account.source
	 * @mbggenerated  Tue Jan 10 13:16:43 CST 2017
	 */
	private String source;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_account.id
	 * @return  the value of t_account.id
	 * @mbggenerated  Tue Jan 10 13:16:43 CST 2017
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_account.id
	 * @param id  the value for t_account.id
	 * @mbggenerated  Tue Jan 10 13:16:43 CST 2017
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_account.loginname
	 * @return  the value of t_account.loginname
	 * @mbggenerated  Tue Jan 10 13:16:43 CST 2017
	 */
	public String getLoginname() {
		return loginname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_account.loginname
	 * @param loginname  the value for t_account.loginname
	 * @mbggenerated  Tue Jan 10 13:16:43 CST 2017
	 */
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_account.password
	 * @return  the value of t_account.password
	 * @mbggenerated  Tue Jan 10 13:16:43 CST 2017
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_account.password
	 * @param password  the value for t_account.password
	 * @mbggenerated  Tue Jan 10 13:16:43 CST 2017
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_account.rid
	 * @return  the value of t_account.rid
	 * @mbggenerated  Tue Jan 10 13:16:43 CST 2017
	 */
	public Integer getRid() {
		return rid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_account.rid
	 * @param rid  the value for t_account.rid
	 * @mbggenerated  Tue Jan 10 13:16:43 CST 2017
	 */
	public void setRid(Integer rid) {
		this.rid = rid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_account.create_time
	 * @return  the value of t_account.create_time
	 * @mbggenerated  Tue Jan 10 13:16:43 CST 2017
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_account.create_time
	 * @param createTime  the value for t_account.create_time
	 * @mbggenerated  Tue Jan 10 13:16:43 CST 2017
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_account.delete_flag
	 * @return  the value of t_account.delete_flag
	 * @mbggenerated  Tue Jan 10 13:16:43 CST 2017
	 */
	public String getDeleteFlag() {
		return deleteFlag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_account.delete_flag
	 * @param deleteFlag  the value for t_account.delete_flag
	 * @mbggenerated  Tue Jan 10 13:16:43 CST 2017
	 */
	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_account.source
	 * @return  the value of t_account.source
	 * @mbggenerated  Tue Jan 10 13:16:43 CST 2017
	 */
	public String getSource() {
		return source;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_account.source
	 * @param source  the value for t_account.source
	 * @mbggenerated  Tue Jan 10 13:16:43 CST 2017
	 */
	public void setSource(String source) {
		this.source = source;
	}
}