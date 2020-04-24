package com.test.javatest.action;

import java.util.ArrayList;

import com.test.javatest.part.DogList;
import com.test.javatest.type.Dog;
import com.test.javatest.type.DogAbstract;

/**AnimalShop
 * @author dev
 * Poodle, Bulldog
 * Sick, Normal  
 */
public class AnimalShop {

	public ArrayList<DogList> getNotSickDogs(DogAbstract dog) {
		
		ArrayList<DogList> dogLists = dog.getDogList();
		
		
		dog.bark();
		dog.printColor();
		
		for(int i=0; i<dogLists.size(); i++) {
			if(dogLists.get(i).isSicked()) {
				String dogName = dogLists.get(i).getDogName();
				System.out.println("sick dog : " + dogName);
				dogLists.remove(i);
				
			}
			
		
		}
		return dogLists;
	}

	public boolean wash(DogList dogList) {
		
		String dogName = dogList.getDogName();
		System.out.println("dogName : " + dogName + " is washing!!!");
		
		
		return true;
	}

}
