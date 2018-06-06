package com.hone.BookManager.database;

import java.util.Date;

public class User {
	private Long uid;
	private String loginname;
	private String realname;
	private String password;
	private String cellphone;
	private String email;
	private Integer dbstate;
	private Date createtime;
	private Date lasttime;
	private Long lastuid;


	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getDbstate() {
		return dbstate;
	}

	public void setDbstate(Integer dbstate) {
		this.dbstate = dbstate;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Date getLasttime() {
		return lasttime;
	}

	public void setLasttime(Date lasttime) {
		this.lasttime = lasttime;
	}

	public Long getLastuid() {
		return lastuid;
	}

	public void setLastuid(Long lastuid) {
		this.lastuid = lastuid;
	}

	
}
