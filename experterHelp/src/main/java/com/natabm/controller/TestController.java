package com.natabm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.natabm.dto.BaseDTO;
import com.natabm.service.inter.ITestService;

@RequestMapping("/common")
public class TestController {
	
	protected  ITestService testService;
	
	public void setTestService(ITestService testService) {
		this.testService = testService;
	}



	@RequestMapping("/test.do")
	@ResponseBody
	public BaseDTO test(String key, String value){
		BaseDTO base = new BaseDTO();
		base.setResult(testService.test(key, value));
		return base;
	}

}
