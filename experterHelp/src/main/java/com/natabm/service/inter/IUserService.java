package com.natabm.service.inter;

import com.natabm.entity.User;
import com.natabm.exception.UserException;

public interface IUserService {
	
	public boolean registUser(User user) throws UserException;
	
	public boolean login(String username,String passwd) throws UserException;

}
