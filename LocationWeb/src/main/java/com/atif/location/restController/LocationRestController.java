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
import com.atif.location.repos.LocationRepository;

@RestController
@RequestMapping("/locations")
public class LocationRestController {

	@Autowired
	LocationRepository repo;

	@GetMapping("/getLocations")
	//@GetMapping
	public List<Location> getLocations() {
		return repo.findAll();
	}

	@PostMapping("/createLocation")
	public Location createLocation(@RequestBody Location location) {
		return repo.save(location);
	}

	@PutMapping("/updateLocation")
	// @PutMapping
	public Location updateLocation(@RequestBody Location location) {
		return repo.save(location);
	}

	@DeleteMapping("/delete/{id}")
	// @DeleteMapping("/{id}")
	public void deleteLocation(@PathVariable("id") int id) {
		repo.deleteById(id);
	}

	//@GetMapping("/{id}")
	@GetMapping("/getLocationById/{id}")
	public Location getLocation(@PathVariable("id") int id) {
		return repo.findById(id).get();
	}
}
