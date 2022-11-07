package com.manuelsenatore.security.security.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

////@Configuration
//public class MyCrossOriginConfig {
//  
//  @SuppressWarnings("deprecation")
//@Bean
//  public WebMvcConfigurer corsConfigurer() {
//      
//      return new WebMvcConfigurerAdapter() {
//          @Override
//          public void addCorsMappings(CorsRegistry registry) {
//              registry.addMapping("/**");
//          }
//      };
//      
//  }
//}
//v2 - control

@Configuration
public class MyCrossOriginConfig {

	@SuppressWarnings("deprecation")
	@Bean
	public WebMvcConfigurer corsConfigurer() {
	  
      return new WebMvcConfigurerAdapter() {
          @Override
          public void addCorsMappings(CorsRegistry registry) {
              registry.addMapping("/app/**")
                  .allowedOrigins("http://127.0.0.1:5500/")
                  .allowedMethods("GET", "POST")
                  .allowedHeaders("h1", "h2")
                  .allowCredentials(false)
                  .maxAge(3600);
	      }
	  
      };
	}
}
