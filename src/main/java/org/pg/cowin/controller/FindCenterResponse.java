package org.pg.cowin.controller;

import java.util.List;

import org.pg.cowin.dao.Location;

public class FindCenterResponse {

	List<Location> locations;

	public List<Location> getLocations() {
		return locations;
	}

	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}

}
