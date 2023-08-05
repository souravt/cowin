package org.pg.cowin.service;

import java.util.List;

import org.pg.cowin.controller.FindCenterResponse;
import org.pg.cowin.dao.Location;
import org.pg.cowin.dao.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VaxLocationService {
	@Autowired
	LocationRepository repository;

	public FindCenterResponse findAll(String pinCode) {
		List<Location> locations = repository.findByPinCode(pinCode);
		FindCenterResponse response = new FindCenterResponse();
		response.setLocations(locations);

		return response;
	}

	public RegisterCenterResponse registerCenter(Location location) {

		repository.save(location);

		RegisterCenterResponse response = new RegisterCenterResponse();
		response.setStatus("SUCCESS");

		return response;
	}

}
