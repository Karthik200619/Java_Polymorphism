package com.karthik.service;

public class CargoPlane extends AeroPlane {
	@Override
	public void takeOff() {
		System.out.println("CargoPlane taking Off...");
	}
	@Override
	public void land() {
		System.out.println("CargoPlane Landing...");
	}
	
}
