package com.test.javatest;

import com.test.javatest.part.Inlet;
import com.test.javatest.type.Car;
import com.test.javatest.type.Part;

public class Grandeur implements Car {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "grandeur";
	}
	@Override
	public String getSize() {
		// TODO Auto-generated method stub
		return "MidSize";
		
		
	}
	@Override
	public int getType() {
		// TODO Auto-generated method stub
		return 2003;
	}
	@Override
	public Inlet getInlet() {
		// TODO Auto-generated method stub
		return new Inlet(0);
	}
	@Override
	public Part getPart() {
		// TODO Auto-generated method stub
		return null;
	}

}
