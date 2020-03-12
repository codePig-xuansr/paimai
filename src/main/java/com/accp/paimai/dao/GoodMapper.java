package com.accp.paimai.dao;

import java.util.List;

import com.accp.paimai.pojo.Good;
import com.accp.paimai.vo.IngVO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface GoodMapper extends BaseMapper<Good>{
//    int deleteByPrimaryKey(Integer goodsid);
//
//    int insert(Good record);
//
//    int insertSelective(Good record);
//
//    Good selectByPrimaryKey(Integer goodsid);
//
//    int updateByPrimaryKeySelective(Good record);
//
//    int updateByPrimaryKeyWithBLOBs(Good record);
//
//    int updateByPrimaryKey(Good record);
	
	public List<IngVO> queryIng();
	
	public List<Good> queryAllIng();
}