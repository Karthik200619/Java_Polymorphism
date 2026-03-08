package com.karthik;

import com.karthik.service.CargoPlane;
import com.karthik.service.FighterJet;
import com.karthik.service.PassengerPlane;
import com.karthik.service.AeroPlane;

public class Main {

	public static void main(String[] args) {
		AeroPlane plane = new CargoPlane();
		plane.takeOff();
		plane.land();
		System.out.println("====================================");
		AeroPlane plane2 = new FighterJet();
		plane2.takeOff();
		plane2.land();
		System.out.println("====================================");
		AeroPlane plane3 = new PassengerPlane();
		plane3.takeOff();
		plane3.land();
	}

}
