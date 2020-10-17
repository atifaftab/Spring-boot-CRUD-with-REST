package com.atif.location.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atif.location.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
