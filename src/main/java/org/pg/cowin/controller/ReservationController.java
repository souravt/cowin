package org.pg.cowin.controller;

import java.util.UUID;

import org.pg.cowin.service.ReservationRequest;
import org.pg.cowin.service.ReservationResponse;
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
	ReservationService service;

	@PostMapping(path = "/reserve", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ReservationResponse send(@RequestBody ReservationRequest request) {

		System.out.println("request:" + request);
		UUID uuid = UUID.randomUUID();
		request.setId(uuid);
		logger.info("Received new request", request.getCenterId());
		return service.book(request);
	}

}
