package com.accp.paimai.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.paimai.biz.DetailBiz;
import com.accp.paimai.pojo.Detail;
import com.accp.paimai.vo.DetailsVO;
import com.accp.paimai.vo.OverVO;

@RestController
@RequestMapping("/api/details")
public class DetailAction {
	
	@Autowired
	private DetailBiz biz;
	
	@GetMapping("{id}")
	public List<DetailsVO> queryDetailsBy(@PathVariable Integer id){
		 return biz.queryDetailsBy(id);
	}
	
	@PostMapping("detail")
	public Integer addDetails(@RequestBody Detail det) {
		return biz.addDetails(det);
	}
	
	@GetMapping("max/{id}")
	public Float queryMax(@PathVariable Integer id) {
		return biz.queryMax(id);
	}
	
	@GetMapping("over")
	public List<OverVO> queryOver(){
		return biz.queryOver();
	}

}
