package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Format {
	
	@Autowired
	private IProcess pob;
	
	//@Autowired(required = false)
	
	
	public void printFormat() {
		pob.getProcesCode();
		System.out.println("FORM FORMAT");
	}

	@Override
	public String toString() {
		return "Format [pob=" + pob + "]";
	}

}
