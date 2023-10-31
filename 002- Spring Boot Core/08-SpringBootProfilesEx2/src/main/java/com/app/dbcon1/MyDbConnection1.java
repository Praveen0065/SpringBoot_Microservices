package com.app.dbcon1;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties("my.db")
public class MyDbConnection1 {
	
	private String driver;
	private String url;
	private String user;
	private String pwd;
	
	
	

}
