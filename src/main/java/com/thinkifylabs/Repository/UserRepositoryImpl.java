package com.thinkifylabs.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.thinkifylabs.Model.User;


@Component
public class UserRepositoryImpl implements UserRepository{
	
	List<User> users= new ArrayList<>();
	
	@Override
	public void add_user(String name, String gender, int age)
	{
		User user = new User(name,gender,age);
		users.add(user);
	}

}
