package com.accp.paimai.pojo;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("goodsdetailed")
public class Detail {
	@TableId(type = IdType.AUTO,value = "dId")
    private Integer did;

    private Integer userid;

    private Integer goodsid;

    private Float dprice;

    private Date ddate;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Float getDprice() {
        return dprice;
    }

    public void setDprice(Float dprice) {
        this.dprice = dprice;
    }

    public Date getDdate() {
        return ddate;
    }

    public void setDdate(Date ddate) {
        this.ddate = ddate;
    }
}