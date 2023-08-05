package org.pg.cowin.controller;

import java.util.Date;
import java.util.UUID;

import org.pg.cowin.service.AvailabilityService;
import org.pg.cowin.service.ReservationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationController {

	private static final Logger logger = LoggerFactory.getLogger(ReservationController.class);

	@Autowired
	ReservationService reservationService;

	@Autowired
	AvailabilityService availabilityService;

	@PostMapping(path = "/bookmyslot", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ReservationResponse bookSlot(@RequestBody ReservationRequest request) {
		UUID uuid = UUID.randomUUID();
		request.setId(uuid);
		request.setRequestReceivedAt(new Date());
		return reservationService.book(request);
	}

	@PostMapping(path = "/findAvailability", consumes = MediaType.APPLICATION_JSON_VALUE)
	public AvailabilityResponse findSlots(@RequestBody AvailabilityRequest request) {

		UUID uuid = UUID.randomUUID();
		request.setId(uuid);
		request.setRequestReceivedAt(new Date());
		return availabilityService.findAvailability(request);
	}

}
