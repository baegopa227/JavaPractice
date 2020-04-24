package com.test.javatest;

import java.util.ArrayList;

import com.test.javatest.part.DogList;
import com.test.javatest.type.Dog;
import com.test.javatest.type.DogAbstract;
import com.test.javatest.type.DogColor;

public class Poodle extends DogAbstract{

	@Override
	public ArrayList<DogList> getDogList() {

		ArrayList<DogList> lists = new ArrayList<DogList>();
		DogList dogList = new DogList();
		dogList.setSicked(true);
		dogList.setDogName("dog1");
		DogList poodle2 = new DogList();
		poodle2.setSicked(false);
		poodle2.setDogName("dog2");
		lists.add(dogList);
		lists.add(poodle2);
		
		return lists;
	}

	@Override
	public void printColor() {
		
		System.out.println("푸들은 갈색");
	}



	




}
