package com.tlscontact.frvisa;

import javax.xml.ws.Endpoint;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.tlscontact.frvisa.service.impl.ArticleService;

@SpringBootApplication
public class SoapServiceApplication {
	
	// https://glenmazza.net/blog/entry/switch-soap11-to-soap12
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8081/service", new ArticleService());
	}
}