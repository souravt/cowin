package org.pg.cowin.dao.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Booking {
	@Id
	public String Id;

	String centerId;
	Date timeSlot;
	String personId;
	Date requestReceivedAt;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
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

	public Date getRequestReceivedAt() {
		return requestReceivedAt;
	}

	public void setRequestReceivedAt(Date requestReceivedAt) {
		this.requestReceivedAt = requestReceivedAt;
	}

}
