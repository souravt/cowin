package org.pg.cowin.controller;

import java.util.Date;
import java.util.UUID;

import org.pg.cowin.service.ReservationStatus;

public class ReservationResponse {
	UUID reservationId;			
    Date reservationTs;
    ReservationStatus status;
    
    public UUID getReservationId() {
		return reservationId;
	}
	public void setReservationId(UUID reservationId) {
		this.reservationId = reservationId;
	}
	public ReservationStatus getStatus() {
		return status;
	}
	public void setStatus(ReservationStatus status) {
		this.status = status;
	}
	public Date getReservationTs() {
		return reservationTs;
	}
	public void setReservationTs(Date reservationTS) {
		this.reservationTs = reservationTS;
	}	
	
}
