package com.thinkifylabs.Driver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.thinkifylabs.Service.DriverServiceDAO;
import com.thinkifylabs.Service.RideService;
import com.thinkifylabs.Service.UserServiceDAO;

public class Driver {

	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		DriverServiceDAO driverServiceDAO = context.getBean("driverServiceDAOImpl",DriverServiceDAO.class);
		
		RideService rideService = context.getBean("rideServiceImpl",RideService.class);
		
		UserServiceDAO userServiceDAO = context.getBean("userServiceDAOImpl",UserServiceDAO.class);
		
		userServiceDAO.add_user("Abhishek, M, 23");
		userServiceDAO.add_user("Rahul, M, 29");
		userServiceDAO.add_user("Nandini, F, 22");
				
		driverServiceDAO.add_driver("driver1,m,22","swift,ap123",10,0);
		driverServiceDAO.add_driver("driver2,m,22","swift,ap123",10,0);
		driverServiceDAO.add_driver("driver3,m,22","swift,ap123",10,0);
		
		System.out.println(driverServiceDAO.get_drivers());
		
		System.out.println(rideService.find_ride("abhishek",7,0,14,0));
		System.out.println(rideService.choose_driver("abhishek","driver1"));
		
		
		System.out.println(rideService.choose_driver("abhishek","driver1"));
		
		System.out.println(rideService.find_ride("abhishek",7,0,14,0));
		context.close();
		
	}
}
