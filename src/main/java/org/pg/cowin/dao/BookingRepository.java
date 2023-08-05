package org.pg.cowin.dao;

import java.util.Date;

import org.pg.cowin.service.ReservationStatus;
import org.springframework.stereotype.Service;


public interface BookingRepository {

	public ReservationStatus book(String centerId, Date timeSlot, String personId, Date requestReceivedAt);

}
