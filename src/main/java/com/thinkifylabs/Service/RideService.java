package com.thinkifylabs.Service;

import java.util.List;

public interface RideService {

	public List<String> find_ride(String name,int source_x,int source_y,int destination_x,int destination_y);
	
	public String choose_driver(String userName,String driverName);
}
