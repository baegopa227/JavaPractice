package com.test.javatest.action;

import com.test.javatest.Genesis;
import com.test.javatest.Granbird;
import com.test.javatest.Grandeur;
import com.test.javatest.Morning;
import com.test.javatest.RollsRoyce;
import com.test.javatest.Tico;
import com.test.javatest.type.Car;

/**
 * 세차장
 * @author dev
 * MidSize, SmallSize, LargeSize
 */
public class CarWash {

	public boolean wash(Car car) {
		
		String carName = car.getName();
		String carSize = car.getSize();
	
		System.out.println("carName: " + carName + ", carSize: " + carSize);
		
		return "morning".equals(carName);
	}


}
