package com.test.javatest.action;

import com.test.javatest.type.Car;


/**차 수리점
 * @author dev
 * MidSize, SmallSize, LargeSize
 */
public class CarRepair  {

	private Car car;
	
	
	
	public void input(Car car) {
		this.car = car;
	}
	
	public Car output() {
		return this.car;
	}
	
	public boolean repair() {
		
		String carSize = this.car.getSize();
		
		return "SmallSize".equals(carSize);
	}
	
}
