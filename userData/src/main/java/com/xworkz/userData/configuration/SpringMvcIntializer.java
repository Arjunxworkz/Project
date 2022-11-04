package com.xworkz.userData.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringMvcIntializer extends AbstractAnnotationConfigDispatcherServletInitializer
		implements WebMvcConfigurer {

	private String[] servletMappings = {"/"};

	private Class[] servletConfigClasses = {SpringConfiguration.class, DbConfiguration.class};

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println(" calling get root config classes");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println(" calling getServletConfigClasses");
		return servletConfigClasses;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("calling getServletMappings");
		return servletMappings;

	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

	
}
