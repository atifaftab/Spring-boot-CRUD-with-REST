package com.atif.location.service;

import java.util.List;

import com.atif.location.entities.Location;

public interface LocationService {

	Location save(Location location);
	Location updateLocation(Location location);
	Location findById(int id);
	List<Location> findAll();
	public String greet();
	void deleteById(int id);
}
