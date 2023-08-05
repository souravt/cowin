package org.pg.cowin.service;

import java.util.Date;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ReservationRequest {

	String centerId;
	
	@JsonFormat(pattern="dd-MM-yyyy")
	Date timeSlot;
	
	String personId;
	
	@JsonFormat(pattern="dd-MM-yyyy hh:mm:ss.SSS")
	Date requestedTime;
	
	@JsonFormat(pattern="dd-MM-yyyy hh:mm:ss.SSS")
	Date requestReceivedAt;
	UUID id;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getCenterId() {
		return centerId;
	}

	public void setCenterId(String centerId) {
		this.centerId = centerId;
	}

	public Date getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(Date timeSlot) {
		this.timeSlot = timeSlot;
	}

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public Date getRequestedTime() {
		return requestedTime;
	}

	public void setRequestedTime(Date requestedTime) {
		this.requestedTime = requestedTime;
	}

	public Date getRequestReceivedAt() {
		return requestReceivedAt;
	}

	public void setRequestReceivedAt(Date requestReceivedAt) {
		this.requestReceivedAt = requestReceivedAt;
	}

}
