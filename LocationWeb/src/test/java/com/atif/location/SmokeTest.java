package com.atif.location;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.atif.location.restController.LocationRestController;

@SpringBootTest
public class SmokeTest {

	@Autowired
	private LocationRestController restController;

	@Test
	public void contextLoad() throws Exception {
		assertThat(restController).isNotNull();
	}

}
