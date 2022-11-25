package com.thinkifylabs.Model;

public class Car {

	private String carName;
	private String carNumber;
	
	
	public Car(String carName, String carNumber) {
		super();
		this.carName = carName;
		this.carNumber = carNumber;
	}


	public String getCarName() {
		return carName;
	}


	public void setCarName(String carName) {
		this.carName = carName;
	}


	public String getCarNumber() {
		return carNumber;
	}


	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}


	@Override
	public String toString() {
		return carName+" "+carNumber;
	}
	
	
}
