package com.thinkifylabs.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.thinkifylabs.Repository.UserRepository;

@Component
public class UserServiceDAOImpl implements UserServiceDAO{

	@Autowired
	UserRepository userDao ;
	
	public void add_user(String user)
	{
		String[] userDetails = user.split(",");
		
		String name = userDetails[0].trim();
		String gender =  userDetails[1].trim();
		
		try
		{
			int age = Integer.parseInt(userDetails[2].trim());
			userDao.add_user(name, gender, age);
		}
		catch(NumberFormatException exe)
		{
			System.out.println("please enter valid age");
		}
		
	}
}
