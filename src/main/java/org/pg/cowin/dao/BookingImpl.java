package org.pg.cowin.dao;

import java.util.Date;

import org.pg.cowin.BookingStatus;
import org.pg.cowin.CentralScheduler;
import org.pg.cowin.service.ReservationStatus;
import org.springframework.stereotype.Service;

@Service
public class BookingImpl implements BookingRepository {

	CentralScheduler scheduler = CentralScheduler.getInstance();

	public ReservationStatus book(String centerId, Date timeSlot, String personId, Date requestReceivedAt) {

		BookingStatus status = scheduler.book(centerId, timeSlot, personId);
		if (status.equals(BookingStatus.SUCCESS)) {
			return ReservationStatus.APPROVED;
		}

		return ReservationStatus.REJECTED;
	}

}
