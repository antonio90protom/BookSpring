package it.books;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
 
@SpringBootApplication
public class App 
{
    public static void main( String[] args ) {
    	SpringApplication.run(App.class, args);
    }
    
    @Bean
	   public ModelMapper modelMapper() {
	      ModelMapper modelMapper = new ModelMapper();
	      return modelMapper;
	   }
    
    @Bean
    public WebMvcConfigurer corsConfigurer() {
       return new WebMvcConfigurer() {
          public void addCorsMappings(CorsRegistry registry) {
             registry.addMapping("/**").allowedMethods("*").allowedOrigins("*");
          }
       };
    }
      
} 