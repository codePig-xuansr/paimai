package com.accp.paimai.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class GoodVO {

	private String goodsname;

    private Float goodsprice;

    @JsonFormat(pattern = "yy-MM-dd")
    private Date startdate;

    @JsonFormat(pattern = "yy-MM-dd")
    private Date enddate;

    private String depict;
    
    private Integer num;
    
    private Integer size;

	public String getGoodsname() {
		return goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	public Float getGoodsprice() {
		return goodsprice;
	}

	public void setGoodsprice(Float goodsprice) {
		this.goodsprice = goodsprice;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public String getDepict() {
		return depict;
	}

	public void setDepict(String depict) {
		this.depict = depict;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public GoodVO(String goodsname, Float goodsprice, Date startdate, Date enddate, String depict, Integer num,
			Integer size) {
		super();
		this.goodsname = goodsname;
		this.goodsprice = goodsprice;
		this.startdate = startdate;
		this.enddate = enddate;
		this.depict = depict;
		this.num = num;
		this.size = size;
	}

	public GoodVO() {
		super();
	}
    
    
}
