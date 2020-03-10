package com.accp.paimai.biz;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.paimai.dao.DetailMapper;
import com.accp.paimai.pojo.Detail;
import com.accp.paimai.vo.DetailsVO;
import com.accp.paimai.vo.OverVO;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class DetailBiz {

	@Autowired
	private DetailMapper dao;
	
	public List<DetailsVO> queryDetailsBy(Integer id){
		 return dao.queryDetailsBy(id);
	}
	
	public Integer addDetails(Detail det) {
		return dao.insert(det);
	}
	
	public Float queryMax(Integer id) {
		return dao.queryMax(id);
	}
	
	public List<OverVO> queryOver(){
		return dao.queryOver();
	}
}
