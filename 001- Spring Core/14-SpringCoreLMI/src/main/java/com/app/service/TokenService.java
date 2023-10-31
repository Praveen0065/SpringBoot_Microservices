package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TokenService {
	
	@Autowired
	private Token token;

	
	public Token getToken() {
		
		return token;
	}


	@Override
	public String toString() {
		return "TokenService [token=" + token + "]";
	}





	
	
}
