package com.accp.paimai.vo;

import java.util.Date;

public class OverVO {
	private Integer goodsId;
	private String goodsName;
	private Date startDate;
	private Date endDate;
	private Float goodsPrice;
	private Float dPrice;
	private Integer userId;
	private String userName;
	public Integer getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Float getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(Float goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public Float getdPrice() {
		return dPrice;
	}
	public void setdPrice(Float dPrice) {
		this.dPrice = dPrice;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public OverVO(Integer goodsId, String goodsName, Date startDate, Date endDate, Float goodsPrice, Float dPrice,
			Integer userId, String userName) {
		super();
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.goodsPrice = goodsPrice;
		this.dPrice = dPrice;
		this.userId = userId;
		this.userName = userName;
	}
	public OverVO() {
		super();
	}
}
