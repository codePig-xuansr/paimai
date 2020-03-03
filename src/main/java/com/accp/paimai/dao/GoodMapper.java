package com.accp.paimai.dao;

import com.accp.paimai.pojo.Good;

public interface GoodMapper {
    int deleteByPrimaryKey(Integer goodsid);

    int insert(Good record);

    int insertSelective(Good record);

    Good selectByPrimaryKey(Integer goodsid);

    int updateByPrimaryKeySelective(Good record);

    int updateByPrimaryKeyWithBLOBs(Good record);

    int updateByPrimaryKey(Good record);
}