package com.kedu.approval.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		
		  registry.addMapping("/**") // 이 서버에 어떤 url 로 요청을 하든
	         .allowedOrigins("http://10.5.5.11:3000","http://10.5.5.0:3000" ,"http://10.10.55.97:3000")// 모든 출처 //  http://10.5.5.12:3000 만 허가
	         .allowedMethods("*")      // 모든 요청방식
	         .allowedHeaders("*")
	         .allowCredentials(true); // 0930 리액트에서 credentials true 후 여기도 추가
	}
}
