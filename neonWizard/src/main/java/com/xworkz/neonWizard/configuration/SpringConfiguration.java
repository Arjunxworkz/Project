package com.xworkz.neonWizard.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.xworkz")
public class SpringConfiguration {

	public SpringConfiguration() {
		System.out.println("SpringConfiguration class is running");
	}
	
	@Bean
	public ViewResolver viewResolver() {
		System.out.println("Calling view Resolver");
		return new InternalResourceViewResolver("/",".jsp");

	}

	@Bean
	public MultipartResolver multipartResolver() {
		System.out.println("Created view resolver,,,,");
		return new StandardServletMultipartResolver();
	}
}
