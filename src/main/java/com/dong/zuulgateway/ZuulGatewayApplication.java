package com.dong.zuulgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.dong.zuulgateway.filter.ErrorFilter;
import com.dong.zuulgateway.filter.PostFilter;
import com.dong.zuulgateway.filter.PreFilter;
import com.dong.zuulgateway.filter.RouteFilter;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ZuulGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulGatewayApplication.class, args);
	}

	@Bean
	public PreFilter preFilter()	{
		return new PreFilter();
	}
	
	@Bean 
	public RouteFilter routerFilter()	{
		return new RouteFilter();
	}
	
	@Bean
	public PostFilter postFilter()	{
		return new PostFilter();
	}
	
	@Bean
	public ErrorFilter errorFilter()	{
		return new ErrorFilter();
	}
}
