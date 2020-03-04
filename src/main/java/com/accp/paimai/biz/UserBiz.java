package com.accp.paimai.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.paimai.dao.IUserDao;
import com.accp.paimai.pojo.User;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

@Service
@Transactional(propagation =Propagation.SUPPORTS, isolation =Isolation.READ_COMMITTED, readOnly = true)
public class UserBiz {
	
	@Autowired
	private IUserDao dao;
	
	/**
	 * 注册用户
	 * @param user
	 * @return
	 */
	@Transactional(propagation =Propagation.SUPPORTS, isolation =Isolation.READ_COMMITTED, readOnly = false)
	public Integer regs(User user) {
		return dao.insert(user);
	}
	
	/**
	 * 登录
	 * @param userName 用户名
	 * @param userPwd 密码
	 * @return
	 */
	public User login(String userName,String userPwd) {
		QueryWrapper<User> qw=Wrappers.query();
		qw.eq("userName", userName).eq("userPwd", userPwd);
		User user=dao.selectOne(qw);
		return user;
	}

}
