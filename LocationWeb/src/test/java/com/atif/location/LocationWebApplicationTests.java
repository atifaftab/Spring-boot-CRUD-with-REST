package com.atif.location;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.atif.location.entities.Location;
import com.atif.location.repos.LocationRepository;
import com.atif.location.restController.LocationRestController;
import com.atif.location.service.LocationService;
import com.atif.location.service.LocationServiceImpl;

@SpringBootTest
class LocationWebApplicationTests {

	@InjectMocks
	private LocationRestController locationRestController;

	@Mock
	private LocationRepository locationRepository;

	@Mock
	private LocationServiceImpl LocationServiceImpl;

	private LocationService locationService;
	private Location location;

	@Test
	void contextLoads() {
	}

	@Test
	public void testGetLocations() {
		assertNotNull(locationRepository);
		assertNotNull(locationService);
		when(locationRepository.findById(1)).thenReturn(Optional.of(location));
		assertEquals(2, locationService.findById(1).getId());

		/*
		 * when() assertEquals(List<location>, locationRestController.getLocations());
		 */

	}
	
	@Test
	public void getLocation() {
		when(LocationServiceImpl.findById(1)).thenReturn(location);
		
		Location location2 = locationRestController.getLocation(1);
		assertNotNull(location2);
		assertEquals(2, location2.getId());
	}
	

	@BeforeEach
	public void testLocation() {
		locationService = new LocationServiceImpl(locationRepository);
		location = new Location();
		location.setId(2);
		location.setCode("code");
		location.setName("name");
		location.setType("type");

	}

}
