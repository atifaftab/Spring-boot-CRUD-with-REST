package com.atif.location.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atif.location.entities.Location;
import com.atif.location.repos.LocationRepository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class LocationServiceImpl implements LocationService {

	@Autowired
	LocationRepository repository;

	public LocationRepository getRepository() {
		return repository;
	}

	public void setRepository(LocationRepository repository) {
		this.repository = repository;
	}

	@Override
	public Location save(Location location) {
		return repository.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		return repository.save(location);
	}

	@Override
	public void deleteById(int id) {
		repository.deleteById(id);
	}

	@Override
	public Location findById(int id) {
		return repository.findById(id).get();

	}

	@Override
	public List<Location> findAll() {
		return repository.findAll();
	}

	@Override
	public String greet() {
		return "Hello, World";
	}

}
