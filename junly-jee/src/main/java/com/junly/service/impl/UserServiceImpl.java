package com.junly.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.junly.bean.User;
import com.junly.mapper.UserMapper;
import com.junly.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper userMapper;
	@Override
	public User getUserById(int id) throws Exception {
		return userMapper.selectUserById(id);
	}

}
