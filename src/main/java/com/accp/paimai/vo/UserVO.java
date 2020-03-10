package com.accp.paimai.vo;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class UserVO {
	@JSONField(format = "yyyy-MM-dd")
	private Date dDate;
	
	private Float dPrice;
	
	private String userName;

	public Date getdDate() {
		return dDate;
	}

	public void setdDate(Date dDate) {
		this.dDate = dDate;
	}

	public Float getdPrice() {
		return dPrice;
	}

	public void setdPrice(Float dPrice) {
		this.dPrice = dPrice;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public UserVO(Date dDate, Float dPrice, String userName) {
		super();
		this.dDate = dDate;
		this.dPrice = dPrice;
		this.userName = userName;
	}

	public UserVO() {
		super();
	}

}
