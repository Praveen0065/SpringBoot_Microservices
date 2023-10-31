package com.app;

public class Token {
	
	private String code;
	
	public Token() {
		
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Token [code=" + code + "]";
	}
	
	

}
