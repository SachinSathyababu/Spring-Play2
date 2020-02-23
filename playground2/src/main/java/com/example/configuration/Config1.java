package com.example.configuration;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.example.playground2.model.Bike;

@Configuration
public class Config1 {
	
	@Bean
	@Scope(value="prototype")
	public Bike pulsar() {
		
		Bike bike=new Bike();
		bike.setName("Pulsar");
		bike.setOwner("Sachin");
		bike.setCost(99000);
		bike.setDob(new Date());
		
		return bike;
		
	}
	
	
	@Bean
	public Bike bullet() {
		
		Bike bike=new Bike();
		bike.setName("Bullet");
		bike.setOwner("Suraj");
		bike.setCost(399000);
		bike.setDob(new Date());
		
		return bike;
		
	}
	

}
