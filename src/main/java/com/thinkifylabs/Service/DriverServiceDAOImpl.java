package com.thinkifylabs.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.thinkifylabs.Model.Driver;
import com.thinkifylabs.Repository.DriverRepository;

@Component
public class DriverServiceDAOImpl implements DriverServiceDAO{
	
	@Autowired
	DriverRepository driverDao;
	
	@Override
	public void add_driver(String person,String car,int current_x,int current_y)
	{
		String[] personDetails = person.split(",");
		
		String name = personDetails[0].trim();
		String gender =  personDetails[1].trim();
		
		
		String[] carDetails = car.split(",");
		
		String carName = carDetails[0].trim();
		String carNumber = carDetails[1].trim();
		
		try
		{
			int age = Integer.parseInt(personDetails[2].trim());
			driverDao.add_driver(name, gender, age, carName, carNumber, current_x, current_y);
		}
		catch(NumberFormatException exe)
		{
			System.out.println("please enter valid age");
		}
		
	}
	
	@Override
	public List<Driver> get_drivers()
	{
		return driverDao.get_drivers();
	}
}
