package com.app.confiq2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.app.service1.PdfExportService3;

@Configuration
public class AppConfig4 {
	
	@Bean
	@Profile({"default","qa"})
	public PdfExportService3 pdf() {
		PdfExportService3 p = new PdfExportService3();
		p.setFileExt(".pdf");
		p.setFtype("Document-NPDF");
		return p;
	}

}
