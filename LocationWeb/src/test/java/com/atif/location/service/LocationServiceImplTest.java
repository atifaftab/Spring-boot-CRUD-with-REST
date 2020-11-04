package com.atif.location.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.atif.location.entities.Location;
import com.atif.location.repos.LocationRepository;

class LocationServiceImplTest {

	@InjectMocks
	LocationServiceImpl service;

	@Mock
	LocationRepository repository;

	Location location;

	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);

//		service = new LocationServiceImpl(repository);

		/*
		 * location = new Location(); location.setId(1); location.setCode("code");
		 * location.setName("name"); location.setType("type");
		 */

	}

	@Test
	final void testFindById() {

		location = new Location();
		location.setId(1);
		location.setCode("code");
		location.setName("name");
		location.setType("type");

		when(repository.findById(1)).thenReturn(Optional.of(location));
		// assertEquals(1, service.findById(1).getId());

		Location location = service.findById(1);
		
		assertNotNull(location);
		assertEquals("code", location.getCode());

	}

}
