package com.test.javatest;

import com.test.javatest.part.Inlet;
import com.test.javatest.type.Motorcycle;
import com.test.javatest.type.Part;

public class CT200 implements Motorcycle {

	@Override
	public Inlet getInlet() {
		// TODO Auto-generated method stub
		return new Inlet(2);
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "ct200";
	}
	@Override
	public Part getPart() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
