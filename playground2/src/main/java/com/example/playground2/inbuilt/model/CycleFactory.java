package com.example.playground2.inbuilt.model;

import java.util.Date;

import com.example.playground2.model.Booking;

public class CycleFactory {
	
	public Booking getBooking(String name, String owner, int cost, Date dob) {
		
		return new Cycle(name, owner, cost, dob);
	}

}
