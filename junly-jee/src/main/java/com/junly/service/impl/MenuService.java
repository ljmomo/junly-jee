package com.junly.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.junly.bean.Menu;
import com.junly.mapper.MenuMapper;

@Service("menuService")
public class MenuService {
	@Resource
	private MenuMapper menuMapper;
	public void save(Menu menu) throws Exception
	{
		 menuMapper.save(menu);
	}
	
	public Menu findOne(Long id) throws Exception
	{
		return menuMapper.findOne(id);
	}
	
	public void updateLeft(Long right){
		menuMapper.updateLeft(right);
	}
	public void updateRight(Long right){
		menuMapper.updateRight(right);
	}
}
