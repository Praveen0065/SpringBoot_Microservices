package com.app.config7;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

@Component
public class InvalidUserAuthenticationEntryPoint implements AuthenticationEntryPoint {

	
	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException authException) throws IOException, ServletException {
	      response.sendError(HttpServletResponse.SC_UNAUTHORIZED,"authenticatin failed");
		
	}

}