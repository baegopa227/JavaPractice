package com.test.javatest;

import com.test.javatest.part.Inlet;
import com.test.javatest.type.Car;
import com.test.javatest.type.Part;

public class Granbird implements Car {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "granbird";
	}
	@Override
	public String getSize() {
		// TODO Auto-generated method stub
		return "LargeSize";
	}
	@Override
	public int getType() {
		// TODO Auto-generated method stub
		return 2002;
	}
	@Override
	public Inlet getInlet() {
		// TODO Auto-generated method stub
		return new Inlet(1);
	}
	@Override
	public Part getPart() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
