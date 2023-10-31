package com.app.gen4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class MyCustomGen implements IdentifierGenerator{

	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) {
		
		String pref ="MY-PRD-";
		int random = new Random().nextInt();
		random = Math.abs(random);
		
		String dte = new SimpleDateFormat("ddMMyy").format(new Date());
		
		return pref+dte+":"+random;
	}

}
