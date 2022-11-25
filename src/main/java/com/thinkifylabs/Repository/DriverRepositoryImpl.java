package com.thinkifylabs.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.thinkifylabs.Model.Car;
import com.thinkifylabs.Model.Driver;

@Component
public class DriverRepositoryImpl implements DriverRepository{

	List<Driver> drivers = new ArrayList<>();
	
	public void add_driver(String name, String gender, int age, String carName, String carNumber, int current_x, int current_y)
	{
		Car car = new Car(carName,carNumber);
		Driver driver = new Driver(name, gender, age, car, current_x, current_y);
		drivers.add(driver);
	}
	
	public List<Driver> get_drivers()
	{
		return drivers;
	}
	
}
