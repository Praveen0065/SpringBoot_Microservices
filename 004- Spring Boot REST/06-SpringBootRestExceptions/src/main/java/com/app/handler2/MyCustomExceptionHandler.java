package com.app.handler2;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.app.bean4.MyErrorResponse;
import com.app.exception3.ProductNotFoundException;

@RestControllerAdvice
public class MyCustomExceptionHandler {
	
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<MyErrorResponse> showCustomErrorMsg(
			ProductNotFoundException pnfe
			)
	{
		return new ResponseEntity<MyErrorResponse>(
				new MyErrorResponse(new Date().toString(), "Excception in process", 500, pnfe.getMessage()),
				HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
