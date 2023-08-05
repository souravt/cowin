package org.pg.cowin;

import java.util.HashSet;
import java.util.Set;

public class CenterReservationScheduler {

	String centerId;
	String date;
	int maxSlots;
	Set<String> bookedCitizens = new HashSet<String>();
	boolean isFull = false;
	
	
	public String getCenterId() {
		return centerId;
	}

	public void setCenterId(String centerId) {
		this.centerId = centerId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getMaxSlots() {
		return maxSlots;
	}

	public void setMaxSlots(int maxSlots) {
		this.maxSlots = maxSlots;
	}

	public Set<String> getBooking() {
		return bookedCitizens;
	}

	public void setBooking(Set<String> booking) {
		this.bookedCitizens = booking;
	}

	public boolean isFull() {
		return isFull;
	}

	public void setFull(boolean isFull) {
		this.isFull = isFull;
	}

	

	public CenterReservationScheduler(String centerId, String date, int maxSlots) {
		this.centerId = centerId;
		this.date = date;
		this.maxSlots = maxSlots;

	}

	public synchronized BookingStatus book(String person) {
		if (this.isFull || bookedCitizens.size() >= this.maxSlots) {
			return BookingStatus.FAILURE;
		}
		this.bookedCitizens.add(person);
		if (this.bookedCitizens.size() == this.maxSlots) {
			this.isFull = true;
		}
		return BookingStatus.SUCCESS;
	}

}
