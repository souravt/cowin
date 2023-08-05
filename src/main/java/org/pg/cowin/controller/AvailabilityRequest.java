package org.pg.cowin.controller;

import java.util.Date;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonFormat;

public class AvailabilityRequest {

	private UUID id;

	private String vaxCenterId;
	@JsonFormat(pattern = "dd-MM-yyyy hh:mm:ss.SSS")
	private Date requestTs;

	@JsonFormat(pattern = "dd-MM-yyyy")
	Date vaxDate;

	@JsonFormat(pattern = "dd-MM-yyyy hh:mm:ss.SSS")
	Date requestReceivedAt;

	public Date getRequestReceivedAt() {
		return requestReceivedAt;
	}

	public void setRequestReceivedAt(Date requestReceivedAt) {
		this.requestReceivedAt = requestReceivedAt;
	}

	public Date getVaxDate() {
		return vaxDate;
	}

	public void setVaxDate(Date vaxDate) {
		this.vaxDate = vaxDate;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getVaxCenterId() {
		return vaxCenterId;
	}

	public void setVaxCenterId(String vaxCenterId) {
		this.vaxCenterId = vaxCenterId;
	}

	public Date getRequestTs() {
		return requestTs;
	}

	public void setRequestTs(Date requestTs) {
		this.requestTs = requestTs;
	}

}
