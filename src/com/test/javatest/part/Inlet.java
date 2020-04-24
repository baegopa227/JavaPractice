package com.test.javatest.part;

public class Inlet {
	
	
	int fuelType;
	
	//0 무연, 1 경유, 2 등유
	public Inlet(int fuelType) {
		this.fuelType = fuelType;
	}
	
	
	//0 무연, 1 경유, 2 등유
	public boolean input(int fuel) {
		return fuel == fuelType;
	}


	public int getFuelType() {
		// TODO Auto-generated method stub
		return fuelType;
	}

}
