package org.pg.cowin.service;

import org.pg.cowin.dao.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

	@Autowired
	BookingRepository booking;

	public ReservationResponse book(ReservationRequest request) {

		ReservationResponse response = new ReservationResponse();
		
		System.out.println(request.getCenterId());
		System.out.println(request.getTimeSlot());
		System.out.println(request.getPersonId());
		System.out.println(request.getRequestReceivedAt());

		ReservationStatus status = booking.book(request.getCenterId(), request.getTimeSlot(), request.getPersonId(),
				request.getRequestReceivedAt());

		response.setReservationId(request.getId());
		response.setStatus(status);
		response.setReservationTS(request.getRequestReceivedAt());

		return response;
	}

}
