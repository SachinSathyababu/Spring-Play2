package com.example.playground2.inbuilt.model;

import java.util.Date;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import com.example.playground2.model.Booking;

@Component
@ConditionalOnProperty(name="veh.no" , havingValue = "12")
public class Cycle implements Booking{
	
	private String name, owner;
	private int cost;
	private Date dob;
	
	public Cycle() { System.out.println("Creating Cycle");}

	public Cycle(String name, String owner, int cost, Date dob) {
		super();
		this.name = name;
		this.owner = owner;
		this.cost = cost;
		this.dob = dob;
	}



	public void details() {
		System.out.println("Cycle Name is "+name+" , Owner is "+owner+" , Cost is "+cost+" , DOB is "+dob);
	}

}
