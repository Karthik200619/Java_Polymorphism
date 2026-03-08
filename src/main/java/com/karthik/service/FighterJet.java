package com.karthik.service;

public class FighterJet extends AeroPlane {
	@Override
	public void takeOff() {
		System.out.println("FighterJet taking Off...");
	}
	@Override
	public void land() {
		System.out.println("FighterJet Landing...");
	}
	
}
