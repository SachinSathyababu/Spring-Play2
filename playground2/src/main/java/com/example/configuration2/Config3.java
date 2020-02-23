package com.example.configuration2;

import java.util.Date;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.example.playground2.model.Bike;
import com.example.playground2.model.Car;
import com.example.playground2.model.Vehicle;

@Configuration
public class Config3 {
	
	
	@ConfigurationProperties
	@Bean
	public Properties appProp() {
		return new Properties();
	}
	
	@ConfigurationProperties(prefix="veh")
	@Bean
	public Properties appSpecificProp() {
		return new Properties();
	}
	
	@Bean
	@Scope(value="prototype")
	public Bike pulsar1() {
		
		//System.out.println(appProp().toString());
		
		Bike bike=new Bike();
		bike.setName("Pulsar");
		bike.setOwner("Sachin");
		bike.setCost(99000);
		bike.setDob(new Date());
		
		return bike;
		
	}
	
	
	@Bean
	@Qualifier("car")
	public Car swift1() {
		
		return new Car("Swift", "Dhanush", 799900, new Date());
		
	}
	
	@Bean
	@Qualifier("bike")
	public Bike bullet1() {
		
		System.out.println(appProp().toString());
		System.out.println(appSpecificProp().toString());
		return new Bike("Bullet", "Suraj", 399900, new Date());
		
	}
	
	
	/*@Bean
	public Vehicle vehicle() {
		
		return new Vehicle(swift(), bullet());
		
	}*/

}
