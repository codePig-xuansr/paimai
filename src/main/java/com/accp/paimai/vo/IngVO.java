package com.accp.paimai.vo;

import java.util.Date;
import java.util.List;

import com.accp.paimai.pojo.Good;

public class IngVO extends Good{

	private List<UserVO> ingList;

	public List<UserVO> getIngList() {
		return ingList;
	}

	public void setIngList(List<UserVO> ingList) {
		this.ingList = ingList;
	}

	public IngVO(Integer goodsid, String goodsname, Float goodsprice, Date startdate, Date enddate, Integer statrc,
			String depict, String goodsimg, List<UserVO> ingList) {
		super(goodsid, goodsname, goodsprice, startdate, enddate, statrc, depict, goodsimg);
		this.ingList = ingList;
	}

	public IngVO(Integer goodsid, String goodsname, Float goodsprice, Date startdate, Date enddate, Integer statrc,
			String depict, String goodsimg) {
		super(goodsid, goodsname, goodsprice, startdate, enddate, statrc, depict, goodsimg);
	}
	
	
}
