package com.example.playground2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import com.example.playground2.model.Bike;
import com.example.playground2.model.Vehicle;

@SpringBootApplication
@ComponentScan("com.example")
//@ImportResource(value="classpath:spring2.xml")
public class Playground2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Playground2Application.class, args);
		
		/*Bike b= (Bike) ctx.getBean("pulsar");
		b.details();
		
		Bike c=(Bike) ctx.getBean("bullet");
		c.details();*/
		
		Vehicle v= (Vehicle) ctx.getBean("booking");
		v.details();
	}

}
