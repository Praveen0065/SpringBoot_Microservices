package com.app.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.entity.Branches;
import com.app.entity.Collage;
import com.app.repository.BranchesRepository;
import com.app.repository.CollageRepository;

@Component
public class TestDataInsertRunner implements CommandLineRunner {
	
	@Autowired
	private BranchesRepository brepo;
	
	@Autowired
	private CollageRepository crepo;
	

	@Override
	public void run(String... args) throws Exception {
		
		Branches b1 = new Branches(1055,"YTG","JNTU-MANTHANI");
		Branches b2 = new Branches(1056,"TGF","JNTU-SIRICILLA");
		Branches b3 = new Branches(1057,"ABC","JNTU-KONDAGATTU");
		Branches b4 = new Branches(1058,"OSM","OSMANIA-RAMAGUNDAM");
		Branches b5 = new Branches(1059,"OMS","OSMANIA-PEDDAPELLI");
		Branches b6 = new Branches(1060,"MSO","OSMANIA-KARIMNAGAR");
		
		brepo.saveAll(Arrays.asList(b1,b2,b3,b4,b5,b6));
		
		Collage c1 = new Collage(101,"JNTU-HYDERABAD","HYD",Arrays.asList(b1,b2,b3));
		Collage c2 = new Collage(102, "OSMANIA-UNIVERSITY", "HYD", Arrays.asList(b4,b5,b6));
		
		crepo.saveAll(Arrays.asList(c1,c2));
		
		
		
		
		
	}

}
