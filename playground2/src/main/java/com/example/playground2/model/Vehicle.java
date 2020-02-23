package com.example.playground2.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component("booking")
@DependsOn(value="pulsar")
public class Vehicle {
	
	@Autowired
	@Qualifier("car")
	private Car car;
	
	@Autowired
	@Qualifier("bike")
	private Booking bike;
	
	@Value("${veh.no}")
	private int noofvehicles;
	
	public Vehicle() {}
	
	public Vehicle(Car car, Booking bike) {
		super();
		this.car = car;
		this.bike = bike;
		
	}
	
	
	
	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Booking getBike() {
		return bike;
	}

	public void setBike(Booking bike) {
		this.bike = bike;
	}

	public void details() {
		
		car.details();
		bike.details();
		
		System.out.println("No of Vehicles "+noofvehicles);
	}

}
