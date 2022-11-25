package com.thinkifylabs.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.thinkifylabs.Model.Driver;
import com.thinkifylabs.Repository.DriverRepository;

@Component
public class RideServiceImpl implements RideService{
	
	@Autowired
	DriverRepository driverDao;
	
	
	@Override
	public List<String> find_ride(String name,int source_x,int source_y,int destination_x,int destination_y)
	{
		List<Driver> drivers = driverDao.get_drivers();
		List<String> availableDrivers = new ArrayList<>();
		for(Driver driver:drivers)
		{
			if(!driver.isAvailable())
				continue;
			int x1 = source_x;
			int x2 = driver.getCurrent_x();
			int y1 = source_y;
			int y2 = driver.getCurrent_y();
			
			int x = (int) Math.pow(x1-x2, 2);
			int y = (int) Math.pow(y1-y2, 2);
			
			double distance = Math.sqrt(x+y);
			
			if(distance <= 5.0)
			{
				availableDrivers.add(driver.getName());
			}
		}
		return availableDrivers;
	}
	
	@Override
	public String choose_driver(String userName,String driverName)
	{
		List<Driver> drivers = driverDao.get_drivers();
		for(Driver driver:drivers)
		{
			if(driver.isAvailable() && driver.getName().equals(driverName))
			{
				driver.setAvailable(false);
				return "ride is booked with "+driverName;
			}
		}
		return "ride is not booked!";
	}

}
