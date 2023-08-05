package org.pg.cowin.service;

import org.pg.cowin.controller.ReservationRequest;
import org.pg.cowin.controller.ReservationResponse;
import org.pg.cowin.dao.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

	@Autowired
	BookingRepository booking;

	public ReservationResponse book(ReservationRequest request) {

		ReservationResponse response = new ReservationResponse();
		
		ReservationStatus status = booking.book(request.getVaxCenterId(), request.getVaxDate(), request.getCitizenId(),
				request.getRequestReceivedAt());

		response.setReservationId(request.getId());
		response.setStatus(status);
		response.setReservationTs(request.getRequestReceivedAt());

		return response;
	}

}
