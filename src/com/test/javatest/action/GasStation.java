package com.test.javatest.action;

import com.test.javatest.CT100;
import com.test.javatest.CT200;
import com.test.javatest.CT3000;
import com.test.javatest.part.Inlet;
import com.test.javatest.type.Car;
import com.test.javatest.type.Motorcycle;
import com.test.javatest.type.Part;


/**주유소
 * @author dev
 * MidSize, SmallSize, LargeSize
 */
public class GasStation {

	Inlet inlet;
	
	public boolean refuel(Part repairedCar) {
		int fuel = 2; //0 무연, 1 경유, 2 등유
		Inlet inlet = repairedCar.getInlet();
		int fuelType = inlet.getFuelType();
		String carName = repairedCar.getName();
		System.out.println("carName : " + carName + " , fuelType: " + fuelType);
		return inlet.input(fuelType);
		
	}


	

	
}
