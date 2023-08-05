package org.pg.cowin.dao;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Location {
	@Id
	String centerId;

	String pinCode;

	String address;

	String status;

	public Location() {
	}

	public Location(String centerId) {
		this.centerId = centerId;
	}

	public Location(String pinCode, String centerId, String address, String status) {
		this.pinCode = pinCode;
		this.centerId = centerId;
		this.address = address;
		this.status = status;
	}

	public String getCenterId() {
		return centerId;
	}

	public void setCenterId(String centerId) {
		this.centerId = centerId;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		return Objects.hash(centerId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Location other = (Location) obj;
		return Objects.equals(centerId, other.centerId);
	}

}
