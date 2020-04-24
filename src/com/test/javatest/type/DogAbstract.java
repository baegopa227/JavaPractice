package com.test.javatest.type;

import java.util.ArrayList;

import com.test.javatest.part.DogList;

public abstract class DogAbstract implements Dog,DogColor {

	public abstract ArrayList<DogList> getDogList();
	
	public void bark() {
		
		System.out.println("왈왈!!!");
	}
}
