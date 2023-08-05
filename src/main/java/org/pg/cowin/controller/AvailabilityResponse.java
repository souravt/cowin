package org.pg.cowin.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import org.pg.cowin.dao.ScheduledSlot;

public class AvailabilityResponse {

	String vaxCenterId;
	Date vaxDate;
	Collection<ScheduledSlot> slots = new ArrayList<ScheduledSlot>();

	public String getVaxCenterId() {
		return vaxCenterId;
	}

	public void setVaxCenterId(String vaxCenterId) {
		this.vaxCenterId = vaxCenterId;
	}

	public Date getVaxDate() {
		return vaxDate;
	}

	public void setVaxDate(Date requestedDate) {
		this.vaxDate = requestedDate;
	}

	public Collection<ScheduledSlot> getSlots() {
		return slots;
	}

	public void setSlots(Collection<ScheduledSlot> slots) {
		this.slots = slots;
	}

}
