package com.niit.frontend.config;

 

import javax.servlet.MultipartConfigElement;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {AppConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}
	
	 

	private MultipartConfigElement getMultipartConfigElement(){
        MultipartConfigElement multipartConfigElement = new MultipartConfigElement("/resources/images", 1024*1024*5, 1024*1024*5*5, 1024*1024);
        return multipartConfigElement;
    }
}
