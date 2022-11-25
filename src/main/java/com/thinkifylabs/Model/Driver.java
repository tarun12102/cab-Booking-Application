package com.thinkifylabs.Model;

public class Driver extends Person{

	private Car car;
	private int current_x;
	private int current_y;
	private boolean isAvailable = true;
	
	
	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public Driver(String name, String gender, int age, Car car, int current_x, int current_y) {
		super(name,gender,age);
		this.car = car;
		this.current_x = current_x;
		this.current_y = current_y;
	}

	public Car getCar() {
		return car;
	}


	public void setCar(Car car) {
		this.car = car;
	}


	public int getCurrent_x() {
		return current_x;
	}


	public void setCurrent_x(int current_x) {
		this.current_x = current_x;
	}


	public int getCurrent_y() {
		return current_y;
	}


	public void setCurrent_y(int current_y) {
		this.current_y = current_y;
	}

	@Override
	public String toString() {
		return getName()+" "+getGender()+" "+getAge()+" "+car+" "+current_x+" "+current_y;
	}
	

}
