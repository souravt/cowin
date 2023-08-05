package org.pg.cowin.service;

import java.util.Date;
import java.util.UUID;

public class ReservationResponse {
	UUID reservationId;	
	ReservationStatus status;	
    Date reservationTS;
    
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
	public Date getReservationTS() {
		return reservationTS;
	}
	public void setReservationTS(Date reservationTS) {
		this.reservationTS = reservationTS;
	}	
	
}
