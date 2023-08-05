package org.pg.cowin.controller;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class SlotAdditionRequest {

	private String vaxCenterId;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date vaxDate;
	private int slotsAdded;

	public String getVaxCenterId() {
		return vaxCenterId;
	}

	public void setVaxCenterId(String vaxCenterId) {
		this.vaxCenterId = vaxCenterId;
	}

	public Date getVaxDate() {
		return vaxDate;
	}

	public void setVaxDate(Date vaxDate) {
		this.vaxDate = vaxDate;
	}

	public int getSlotsAdded() {
		return slotsAdded;
	}

	public void setSlotsAdded(int slotsAdded) {
		this.slotsAdded = slotsAdded;
	}

}
