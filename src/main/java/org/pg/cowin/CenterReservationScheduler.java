package org.pg.cowin;

import java.util.ArrayList;
import java.util.List;

public class CenterReservationScheduler {

	String centerId;
	String date;
	int maxSlots;
	List<String> booking = new ArrayList<String>();
	boolean isFull = false;

	public CenterReservationScheduler(String centerId, String date, int maxSlots) {
		this.centerId = centerId;
		this.date = date;
		this.maxSlots = maxSlots;

	}

	public BookingStatus book(String person) {
		if (isFull || booking.size() >= maxSlots) {
			return BookingStatus.FAILURE;
		}
		booking.add(person);
		if (booking.size() == maxSlots) {
			isFull = true;
		}
		return BookingStatus.SUCCESS;
	}

}
