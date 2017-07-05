package com.natabm.service.impl;

import com.natabm.dao.UserMapper;
import com.natabm.entity.User;
import com.natabm.exception.UserException;
import com.natabm.service.inter.IUserService;
import com.natabm.utils.CommonUtils;
import com.natabm.utils.PasswdUtils;
import com.natabm.utils.SeqUtils;


public class UserService implements IUserService{
	
	private UserMapper userMapper;
	

	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	@Override
	public boolean registUser(User user) throws UserException {
		boolean result =false;
		user.setId(SeqUtils.getSeq());
		user.setPassword(PasswdUtils.getMd5(user.getPassword()));
		try {
			userMapper.insertSelective(user);
			result =true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new UserException("注册用户异常");
		}
		return result;
	}

	@Override
	public boolean login(String username, String passwd) throws UserException {
		boolean result =false;
		if(CommonUtils.objectIsNull(username) ){
			throw new UserException("登录的用户名为空");
		}
		if(CommonUtils.objectIsNull(passwd) ){
			throw new UserException("登录的用户名为空");
		}
		User user = new User();
		user.setUsername(username);
		user.setPassword(PasswdUtils.getMd5(passwd));
		user = userMapper.selectByParam(user);
		if(!CommonUtils.objectIsNull(user)){
			result=true;
		}
		return result;
	}

}
