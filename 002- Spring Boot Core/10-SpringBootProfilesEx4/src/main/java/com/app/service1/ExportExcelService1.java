package com.app.service1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import lombok.ToString;

@ToString
@Component
@Profile("qa")
public class ExportExcelService1 {
	
	@Value("csv")
	private String extCode;
	
	@Value("#{new java.util.Random().nextInt()}")
	private Integer formatId;
	
	

}
