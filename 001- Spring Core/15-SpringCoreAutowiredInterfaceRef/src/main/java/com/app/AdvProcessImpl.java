package com.app;

import org.springframework.stereotype.Component;

@Component
public class AdvProcessImpl implements IProcess {

	@Override
	public void getProcesCode() {
		System.out.println("p2");

	}

}
