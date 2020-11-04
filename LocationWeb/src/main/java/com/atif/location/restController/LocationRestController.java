package com.atif.location.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atif.location.entities.Location;
import com.atif.location.service.LocationServiceImpl;

@RestController
@RequestMapping("/locations")
public class LocationRestController {

	@Autowired
	LocationServiceImpl service;

	@GetMapping("/getLocations")
	// @GetMapping
	public List<Location> getLocations() {
		return service.findAll();
	}

	@PostMapping("/createLocation")
	public Location createLocation(@RequestBody Location location) {
		return service.save(location);
	}

	@PutMapping("/updateLocation")
	// @PutMapping
	public Location updateLocation(@RequestBody Location location) {
		return service.updateLocation(location);
	}

	@DeleteMapping("/delete/{id}")
	// @DeleteMapping("/{id}")
	public void deleteLocation(@PathVariable("id") int id) {
		service.deleteById(id);
	}

	// @GetMapping("/{id}")
	@GetMapping("/getLocationById/{id}")
	public Location getLocation(@PathVariable("id") int id) {
		return service.findById(id);
	}
}
