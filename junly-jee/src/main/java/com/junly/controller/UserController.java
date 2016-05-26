package com.junly.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.junly.bean.User;
import com.junly.service.UserService;

@Controller
public class UserController {
	@Resource
	private UserService userService;
	@RequestMapping("/helloWorld")
	public String helloWorld(Model model) throws Exception
	{
		User user  = userService.getUserById(3);
		System.out.println(""+user.getUsername());
		model.addAttribute("user", user);
		return "helloworld";
	}
}
