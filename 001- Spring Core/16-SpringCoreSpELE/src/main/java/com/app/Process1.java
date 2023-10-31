package com.app;

import java.util.Arrays;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Process1 {
	
	//@Value("#{ 2 + 3 }")
    //@Value("#{ 'Hello ABC'.length()} ")
	//@Value("#{ new java.util.Random().nextInt }")
	//@Value("#{ java.lang.Math.abs(-9)}")
	//@Value("#{'Hello'.length() > 0 ? 55:44}")
	//@Value("#{ modelData4.model.toLowerCase() }")
	  private String code;
	  
	//@Value("#{ false }")
	//@Value(" #{ new java.util.Random().nextInt() > 5 ? true:false}")
	//@Value(" #{ new java.util.Random().nextInt() > 5 }")
	//@Value(" #{ new java.util.Random().nextInt() ge 5 }")
	//@Value(" #{ 5 % 2 > 0 && 2 + 3 le 5  }")	
	  private boolean isPresent;
	  
	  @Value(" #{ modelData4.model.getBytes() }")
	  private byte[] arr;
	  
	  @Value(" #{ modelData4.model.toCharArray() }")
	  private char[] data;

	  @Value("#{modelData4.model.lines()}")
	  private Stream<String> stream;

	@Override
	public String toString() {
		return "Process1 [code=" + code + ", isPresent=" + isPresent + ", arr=" + Arrays.toString(arr) + ", data="
				+ Arrays.toString(data) + ", stream=" + stream + "]";
	}
	  

	

	
	  

	
	
	

}
