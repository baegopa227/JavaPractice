package com.test.javatest.type;

import com.test.javatest.part.Inlet;

public interface Car{

	public String getName();

	public String getSize();
	
	public int getType();

	public Inlet getInlet();
	
	public Part getPart();
	
}