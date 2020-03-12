package com.accp.paimai.biz;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.paimai.dao.GoodMapper;
import com.accp.paimai.pojo.Good;
import com.accp.paimai.pojo.User;
import com.accp.paimai.vo.GoodVO;
import com.accp.paimai.vo.IngVO;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class GoodBiz {

	@Autowired
	private GoodMapper dao;

	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public Integer addGood(Good good) {
		return dao.insert(good);
	}

	public PageInfo<Good> queryAll(Integer pageNum, Integer size) {
		PageHelper.startPage(pageNum, size);
		List<Good> list = dao.selectList(null);
		PageInfo<Good> info = new PageInfo<Good>(list);
		return info;
	}
	
	public PageInfo<Good> queryAllIng(Integer pageNum, Integer size) {
		PageHelper.startPage(pageNum, size);
		List<Good> list = dao.queryAllIng();
		PageInfo<Good> info = new PageInfo<Good>(list);
		return info;
	}

	public PageInfo<Good> queryBy(GoodVO vo) {
		PageHelper.startPage(vo.getNum(), vo.getSize());
		QueryWrapper<Good> qw = Wrappers.query();
		if (vo.getGoodsname() != null && !"".equals(vo.getGoodsname())) {
			qw.like("goodsname", vo.getGoodsname());
		}
		if (vo.getDepict() != null && !"".equals(vo.getDepict())) {
			qw.like("depict", vo.getDepict());
		}
		if (vo.getStartdate() != null && !"".equals(vo.getStartdate())) {
			qw.gt("startdate", vo.getStartdate());
		}
		if (vo.getEnddate() != null && !"".equals(vo.getEnddate())) {
			qw.lt("enddate", vo.getEnddate());
		}
		if (vo.getGoodsprice() != null) {
			qw.eq("goodsprice", vo.getGoodsprice());
		}
		PageInfo<Good> info = new PageInfo<Good>(dao.selectList(qw));
		return info;
	}
	
	public Integer modifyGoodById(Good good) {
		return dao.updateById(good);
	}
	
	public Integer removeGoodById(Integer id) {
		return dao.deleteById(id);
	}
	
	public PageInfo<IngVO> queryIng(Integer n,Integer s){
		PageHelper.startPage(n, s);
		return new PageInfo<IngVO>(dao.queryIng());
	}
}
