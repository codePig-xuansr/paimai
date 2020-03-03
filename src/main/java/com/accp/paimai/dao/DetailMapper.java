package com.accp.paimai.dao;

import com.accp.paimai.pojo.Detail;

public interface DetailMapper {
    int deleteByPrimaryKey(Integer did);

    int insert(Detail record);

    int insertSelective(Detail record);

    Detail selectByPrimaryKey(Integer did);

    int updateByPrimaryKeySelective(Detail record);

    int updateByPrimaryKey(Detail record);
}