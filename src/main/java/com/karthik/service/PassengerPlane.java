package com.karthik.service;
public class PassengerPlane extends AeroPlane {
	@Override
	public void takeOff() {
		System.out.println("PassengerPlane taking Off...");
	}
	@Override
	public void land() {
		System.out.println("PassengerPlane Landing...");
	}
	
}
