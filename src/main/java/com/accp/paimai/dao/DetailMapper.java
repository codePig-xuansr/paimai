package com.accp.paimai.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.paimai.pojo.Detail;
import com.accp.paimai.vo.DetailsVO;
import com.accp.paimai.vo.OverVO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface DetailMapper extends BaseMapper<Detail>{
    int deleteByPrimaryKey(Integer did);

    int insert(Detail record);

    int insertSelective(Detail record);

    Detail selectByPrimaryKey(Integer did);

    int updateByPrimaryKeySelective(Detail record);

    int updateByPrimaryKey(Detail record);
    
    public List<DetailsVO> queryDetailsBy(@Param("id")Integer id);
    
    public Float queryMax(@Param("id")Integer id);
    
    public List<OverVO> queryOver();
}