package com.bookshop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CharacterEncodingFilter;

import com.cloudinary.Cloudinary;

@SpringBootApplication
public class BookshopApplication {
	
	@Value("${cloundinary.uri}")
	String cloundinaryURI;

	public static void main(String[] args) {
		SpringApplication.run(BookshopApplication.class, args);
	}
	
	@Bean
	public Cloudinary cloudinary() {
		Cloudinary cloudinary = new Cloudinary(cloundinaryURI);
		return cloudinary;
	}
	
	@Bean
	CharacterEncodingFilter characterEncodingFilter() {
		CharacterEncodingFilter filter = new CharacterEncodingFilter();
		filter.setEncoding("UTF-8");
		filter.setForceEncoding(true);
		return filter;
	}

}
