package org.pg.cowin.dao;

import java.util.Date;

public class ScheduledSlot {
	public Date startTime;

	public Date endTime;
	public int totalSlots;
	public int totalBooked;

	public boolean available;

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public int getTotalSlots() {
		return totalSlots;
	}

	public void setTotalSlots(int totalSlots) {
		this.totalSlots = totalSlots;
	}

	public int getTotalBooked() {
		return totalBooked;
	}

	public void setTotalBooked(int totalBooked) {
		this.totalBooked = totalBooked;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean isAvailable) {
		this.available = isAvailable;
	}

	public ScheduledSlot() {
	}
}