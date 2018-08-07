package com.ownobj.aspect.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.ownobj.aspect.objconverter.ObjConverter;
import com.ownobj.aspect.objinterceptor.ObjInterceptor;

@Configuration
public class ObjAdapter implements WebMvcConfigurer{
	
	private static final String FAVICON_URL = "/favicon.ico";
	
	@Bean
    public ObjInterceptor objInterceptor() {
        return new ObjInterceptor();
    }
	
	@Bean
	public ObjConverter objConverter() {
		return new ObjConverter();
	}
	
	@Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(objInterceptor())
		        .addPathPatterns("/**")
		        .excludePathPatterns(FAVICON_URL);
    }
	
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(objConverter());
	}
	
}
