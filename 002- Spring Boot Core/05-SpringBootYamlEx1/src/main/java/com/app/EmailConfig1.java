package com.app;

import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("my.app")
@Component
public class EmailConfig1 {
	
	private String host;
	private String port;
	private String userName;
	private String password;
	
	
	private Set<String> protocols;
	
	private Map<String, String> headers;
	
	private Certificate3 cob;

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<String> getProtocols() {
		return protocols;
	}

	public void setProtocols(Set<String> protocols) {
		this.protocols = protocols;
	}

	public Map<String, String> getHeaders() {
		return headers;
	}

	public void setHeaders(Map<String, String> headers) {
		this.headers = headers;
	}

	public Certificate3 getCob() {
		return cob;
	}

	public void setCob(Certificate3 cob) {
		this.cob = cob;
	}

	@Override
	public String toString() {
		return "EmailConfig1 [host=" + host + ", port=" + port + ", userName=" + userName + ", password=" + password
				+ ", protocols=" + protocols + ", headers=" + headers + ", cob=" + cob + "]";
	}


	
}
