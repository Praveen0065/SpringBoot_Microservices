package com.app.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRouteConfig {
	
	//use lb://ServiceId for multiple instance of MS#
	//use http://IP:PORT for single instance of MS#
	@Bean
	public RouteLocator configRoutes(RouteLocatorBuilder builder) {
		return builder.routes()
				//.route("cartRoutingId", r->r.path("/cart/**").uri("http://172.10.12.36:9696")) //one cart instance only
				.route("cartRoutingId", r->r.path("/cart/**").uri("lb://CART-SERVICE"))
				.route("orderRoutingId", r->r.path("/order/**").uri("lb://ORDER-SERVICE"))
				.build();
		
	}

}
