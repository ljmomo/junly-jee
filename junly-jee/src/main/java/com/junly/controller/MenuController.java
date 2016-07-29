package com.junly.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.junly.bean.Menu;
import com.junly.params.MenuParam;
import com.junly.service.impl.MenuService;

@Controller
@RequestMapping("menu")
public class MenuController {
	@Resource
	private MenuService menuService;
	@RequestMapping("/addMenu")
	@ResponseBody
	public Menu addMenu(Model model,MenuParam param) throws Exception
	{
		if(param.getPid()==null)
		{
			param.setPid(Long.valueOf(1));;
		}
		Menu menu = menuService.findOne(param.getPid());
		Long pointId = menu.getRightId();
		menu.setName(param.getName());
		menu.setLeftId(menu.getRightId()+1);
		menu.setRightId(menu.getRightId()+2);
		menu.setLevel(menu.getLevel()+1);
		
		menuService.updateLeft(pointId);
		menuService.updateRight(pointId);
		menuService.save(menu);
		return menu;
	}
}
