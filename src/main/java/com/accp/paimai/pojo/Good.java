package com.accp.paimai.pojo;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;

@TableName("goods")
public class Good {
	@TableId(type = IdType.AUTO,value = "goodsId")
    private Integer goodsid;

    private String goodsname;

    private Float goodsprice;

    @JsonFormat(pattern = "yy-MM-dd")
    private Date startdate;

    @JsonFormat(pattern = "yy-MM-dd")
    private Date enddate;

    private Integer statrc;

    private String depict;

    private String goodsimg;

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
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

    public Integer getStatrc() {
        return statrc;
    }

    public void setStatrc(Integer statrc) {
        this.statrc = statrc;
    }

    public String getDepict() {
        return depict;
    }

    public void setDepict(String depict) {
        this.depict = depict == null ? null : depict.trim();
    }

    public String getGoodsimg() {
        return goodsimg;
    }

    public void setGoodsimg(String goodsimg) {
        this.goodsimg = goodsimg;
    }

	public Good(Integer goodsid, String goodsname, Float goodsprice, Date startdate, Date enddate, Integer statrc,
			String depict, String goodsimg) {
		super();
		this.goodsid = goodsid;
		this.goodsname = goodsname;
		this.goodsprice = goodsprice;
		this.startdate = startdate;
		this.enddate = enddate;
		this.statrc = statrc;
		this.depict = depict;
		this.goodsimg = goodsimg;
	}

	public Good() {
		super();
	}
    
    
}