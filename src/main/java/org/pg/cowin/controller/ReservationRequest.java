package org.pg.cowin.controller;

import java.util.Date;
import java.util.UUID;

import org.antlr.v4.runtime.misc.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ReservationRequest {

	
	String vaxCenterId;
	
	@JsonFormat(pattern="dd-MM-yyyy")
	
	Date vaxDate;
	
	String citizenId;
	
	@JsonFormat(pattern="dd-MM-yyyy hh:mm:ss.SSS")
	Date requestTs;
	
	@JsonFormat(pattern="dd-MM-yyyy hh:mm:ss.SSS")
	Date requestReceivedAt;
	UUID id;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getVaxCenterId() {
		return vaxCenterId;
	}

	public void setVaxCenterId(String centerId) {
		this.vaxCenterId = centerId;
	}

	public Date getVaxDate() {
		return vaxDate;
	}

	public void setVaxDate(Date timeSlot) {
		this.vaxDate = timeSlot;
	}

	public String getCitizenId() {
		return citizenId;
	}

	public void setCitizenId(String personId) {
		this.citizenId = personId;
	}

	public Date getRequestTs() {
		return requestTs;
	}

	public void setRequestTs(Date requestTs) {
		this.requestTs = requestTs;
	}

	public Date getRequestReceivedAt() {
		return requestReceivedAt;
	}

	public void setRequestReceivedAt(Date requestReceivedAt) {
		this.requestReceivedAt = requestReceivedAt;
	}

}
