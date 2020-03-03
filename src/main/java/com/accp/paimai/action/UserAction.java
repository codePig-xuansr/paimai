package com.accp.paimai.action;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.paimai.biz.UserBiz;
import com.accp.paimai.pojo.User;

@Service
@RestController("/api/user")
public class UserAction {

	@Autowired
	private UserBiz biz;
	
	@PostMapping("/add")
	public Map<String, String> regs(@RequestBody User user){
		Map<String, String> msg=new HashMap<String, String>();
		int res=biz.regs(user);
		if(res>0) {
			msg.put("code", "注册成功!");
		}else {
			msg.put("code", "注册出错!");
		}
		return msg;
	}
	
	@GetMapping("/login")
	public Map<String, String> login(@PathVariable String userName,@PathVariable String userPwd){
		Map<String, String> msg=new HashMap<String, String>();
		User user=biz.login(userName, userPwd);
		if(user!=null) {
			msg.put("code", "登录成功!");
		}else {
			msg.put("code", "登陆出错!");
		}
		return msg;
	}
	
}
