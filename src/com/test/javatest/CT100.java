package com.test.javatest;

import com.test.javatest.part.Inlet;
import com.test.javatest.type.Motorcycle;
import com.test.javatest.type.Part;

public class CT100 implements Motorcycle {

	/**
	 * 주입구
	 * @return
	 */
	@Override
	public Inlet getInlet() {
		// TODO Auto-generated method stub
		return new Inlet(2); //무연 주입구
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "ct100";
	}
	@Override
	public Part getPart() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
