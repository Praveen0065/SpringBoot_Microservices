package com.app.service4;

import com.app.entity1.User;

public interface IUserService  {

	public Integer saveUser(User user);
    public User findbyUser(String username);
}
