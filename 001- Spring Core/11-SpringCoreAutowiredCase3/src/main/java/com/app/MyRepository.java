package com.app;

public class MyRepository {
	
	private String code;
	
	public MyRepository() {
		
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "MyRepository [code=" + code + "]";
	}
	
	

}
