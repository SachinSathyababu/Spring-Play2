package com.example.playground2.model;

import java.util.Date;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

@ConditionalOnProperty(name="veh.no" , havingValue = "120")
public class Bike implements Booking{
	
	private String name, owner;
	private int cost;
	private Date dob;
	
	public Bike() {System.out.println("Creating Bike");}
	
	
	
	public Bike(String name, String owner, int cost, Date dob) {
		super();
		this.name = name;
		this.owner = owner;
		this.cost = cost;
		this.dob = dob;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public void details() {
		System.out.println("Bike Name is "+name+" , Owner is "+owner+" , Cost is "+cost+" , DOB is "+dob);
	}

}
