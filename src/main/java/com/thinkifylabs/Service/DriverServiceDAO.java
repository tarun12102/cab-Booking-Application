package com.thinkifylabs.Service;

import java.util.List;

import com.thinkifylabs.Model.Driver;

public interface DriverServiceDAO {
	
	public void add_driver(String person,String car,int current_x,int current_y);
	public List<Driver> get_drivers();
	
}
