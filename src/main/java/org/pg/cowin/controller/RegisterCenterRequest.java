package org.pg.cowin.controller;

public class RegisterCenterRequest {
	
	String pinCode;	
	String vaxCenterId;
	String address;
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
	String status;
	
	
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getVaxCenterId() {
		return vaxCenterId;
	}
	public void setVaxCenterId(String centerId) {
		this.vaxCenterId = centerId;
	}

	

}
