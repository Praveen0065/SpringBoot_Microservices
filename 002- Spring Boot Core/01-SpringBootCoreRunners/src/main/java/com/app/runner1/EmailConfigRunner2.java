package com.app.runner1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(10)
public class EmailConfigRunner2 implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("EMAIL CONFIG..");
		
	} 

}
/*
Ex:
ARunner  -- @Order(12)
BRunner  -- @Order(44)
CRunner  -- @Order(-98)
DRunner  -- @Order(-101)
ERunner  --  No External Order value is provided
FRunner  --  No External Order value is provided

Execution Order of Above Runners:-
D  C  A  B  E  F

*/
