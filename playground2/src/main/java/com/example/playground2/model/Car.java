package com.example.playground2.model;

import java.util.Date;

public class Car {
	
	private String name, owner;
	private int cost;
	private Date dob;
	
	public Car() {}
	
	
	
	public Car(String name, String owner, int cost, Date dob) {
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
		System.out.println("Car Name is "+name+" , Owner is "+owner+" , Cost is "+cost+" , DOB is "+dob);
	}

}
