package com.app;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


public class passwordEncoder  {
	
	public static void main(String[] args) {
		
		BCryptPasswordEncoder en = new BCryptPasswordEncoder();
		String pwd = en.encode("ram");
		System.out.println(pwd);
	
	}



}
