package com.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.app")
@PropertySource("classpath:app.properties")
@EnableWebMvc
public class AppConfig {

	@Autowired
	private Environment env;
	
	@Bean
	public InternalResourceViewResolver irvObj() {
		
		InternalResourceViewResolver irv= new InternalResourceViewResolver();
		
		irv.setPrefix(env.getProperty("spring.mvc.prefix"));
		irv.setSuffix(env.getProperty("spring.mvc.suffix"));
		
		return irv;
	}
}
