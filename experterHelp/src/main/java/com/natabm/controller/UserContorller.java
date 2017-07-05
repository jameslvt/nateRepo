package com.natabm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.natabm.dto.BaseDTO;
import com.natabm.entity.User;
import com.natabm.exception.UserException;
import com.natabm.service.inter.IUserService;


@RequestMapping("/user")
public class UserContorller {
	
	protected  IUserService userService;

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping("/regist.do")
	@ResponseBody
	public BaseDTO regist(String username, String passwd){
		BaseDTO base = new BaseDTO();
		User user = new User();
		user.setUsername(username);
		user.setPassword(passwd);
		try {
			userService.registUser(user);
			base.setResult(true);
		} catch (UserException e) {
			base.setResult(false);
			e.printStackTrace();
		}
		
		return base;
	}
	
	@RequestMapping("/login.do")
	@ResponseBody
	public BaseDTO login(String username, String passwd){
		BaseDTO base = new BaseDTO();
		try {
			base.setResult(userService.login(username, passwd));
		} catch (UserException e) {
			base.setResult(false);
			e.printStackTrace();
		}
		
		return base;
	}
	
	@RequestMapping("/toRegist.do")
	public ModelAndView toRegister(){
		ModelAndView mv=new ModelAndView();
		mv.setViewName("regist");
		return mv;
	}
	
	@RequestMapping("/toLogin.do")
	public ModelAndView toLogin(){
		ModelAndView mv=new ModelAndView();
		mv.setViewName("login");
		return mv;
	}

}
