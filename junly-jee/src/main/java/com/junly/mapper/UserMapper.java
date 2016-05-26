package com.junly.mapper;

import java.util.List;

import com.junly.bean.User;

public interface UserMapper {
	public User selectUserById(int id) throws Exception;

	public List<User> selectUserList() throws Exception;

	public void insertUser(User user) throws Exception;

	public void updateUser(User user) throws Exception;

	public void deleteUser(int id) throws Exception;
}