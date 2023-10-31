package com.app.service;

import java.util.Random;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Token {
	
	private int code;
	
	

	public Token() {
		code = Math.abs(new Random().nextInt());
	}



	@Override
	public String toString() {
		return "Token [code=" + code + "]";
	}
	
	

}
