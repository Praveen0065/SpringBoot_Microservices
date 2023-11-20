package com.app.service3;

import java.util.Optional;

import com.app.entity1.User;

public interface IUserService {
	
	Integer saveUser(User user);
	Optional<User> getOneUser(Integer id);

}
