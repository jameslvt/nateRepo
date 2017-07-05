package com.natabm.service.impl;

import com.natabm.dao.TestMapper;
import com.natabm.entity.Test;
import com.natabm.service.inter.ITestService;

public class TestService implements ITestService{
	
	protected TestMapper testMapper;
	
	public void setTestMapper(TestMapper testMapper) {
		this.testMapper = testMapper;
	}



	public boolean test(String key,String value){
		
		Test test = new Test();
		test.setTest1(key);
		test.setTest2(value);
		testMapper.insert(test);
		return true;
	}
	
}
