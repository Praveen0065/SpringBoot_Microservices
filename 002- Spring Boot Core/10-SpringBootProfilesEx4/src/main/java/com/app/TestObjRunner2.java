package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.service1.ExportExcelService1;
import com.app.service1.PdfExportService3;

@Component
public class TestObjRunner2 implements CommandLineRunner {
	
	@Autowired
	private ExportExcelService1 exp;
	
	@Autowired
	private PdfExportService3 pdfs;

	@Override
	public void run(String... args) throws Exception {
       
		System.out.println(exp);
		
		System.out.println(pdfs);
		
	}

}
