package com.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ModelData4 {
    
	@Value("TEST")
	private String model;
	
	public ModelData4() {
		
	}
	
	

	public String getModel() {
		return model;
	}



	@Override
	public String toString() {
		return "ModelData4 [model=" + model + "]";
	}
	
	
	
}
