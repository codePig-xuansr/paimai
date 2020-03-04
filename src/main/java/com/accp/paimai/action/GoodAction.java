package com.accp.paimai.action;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.paimai.biz.GoodBiz;
import com.accp.paimai.pojo.Good;
import com.accp.paimai.vo.GoodVO;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/goods")
public class GoodAction {

	@Autowired
	private GoodBiz biz;
	
	@PostMapping("/good")
	public Integer addGood(@RequestBody Good good) {
		return biz.addGood(good);
	}
	
	@PostMapping("/admin")
	public PageInfo<Good> queryAllGoods(@RequestBody GoodVO vo){
		return biz.queryBy(vo);
	}
	
	@GetMapping()
	public PageInfo<Good> queryAll(){
		return biz.queryAll(1,5);
	}
}
