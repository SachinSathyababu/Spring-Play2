package com.example.configuration;

import java.util.Date;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import com.example.playground2.model.Bike;
import com.example.playground2.model.Car;
import com.example.playground2.model.Vehicle;

@Configuration
public class Config2 {
	
	@Bean
	@DependsOn(value= {"pulsar","bullet"})
	public Car swift() {
		
		return new Car("Swift", "Dhanush", 799900, new Date());
		
	}
	
	
	/*@Bean
	public Vehicle vehicle(@Qualifier("swift") Car car , @Qualifier("bullet") Bike bike ) {
		
		return new Vehicle(car,bike);
		
	}*/

}
