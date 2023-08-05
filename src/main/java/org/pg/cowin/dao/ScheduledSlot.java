package org.pg.cowin.dao;

import java.util.Date;

public class ScheduledSlot {
	public Date startTime;
	public Date endTime;
	public int totalSlots;
	public int totalBooked;
	public boolean isAvailable;

	public ScheduledSlot() {
	}
}