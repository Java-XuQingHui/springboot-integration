package com.xqh.service.impl;

import com.xqh.domain.AjaxResult;
import com.xqh.entity.User;
import com.xqh.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xqh.service.UserService;

/**
 * <p>简单描述该类的作用</p>
 *
 * @author xuqinghui
 * @create 2021/8/26 23:33
 */

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;


	@Override
	public AjaxResult insert(User user) {
		int result = userMapper.insert(user);
		if(result == 1) {
			return AjaxResult.success();
		}
		return AjaxResult.error("插入失败");
	}

	@Override
	public User getUserById(Integer id) {
		return userMapper.getUserById(id);
	}
}
