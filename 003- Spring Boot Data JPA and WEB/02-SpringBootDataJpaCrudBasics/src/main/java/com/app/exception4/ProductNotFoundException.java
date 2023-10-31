package com.app.exception4;

public class ProductNotFoundException  extends RuntimeException {

	private static final long serialVersionUID = -7326311665490135408L;

	public ProductNotFoundException() {
		super();
	}
	
	public ProductNotFoundException(String message) {
		super(message);
	}
    
}
