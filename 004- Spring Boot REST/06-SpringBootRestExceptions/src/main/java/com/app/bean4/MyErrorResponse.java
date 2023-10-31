package com.app.bean4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MyErrorResponse {
	
	private String date;
	private String status;
	private int code;
	private String message;
	

}
