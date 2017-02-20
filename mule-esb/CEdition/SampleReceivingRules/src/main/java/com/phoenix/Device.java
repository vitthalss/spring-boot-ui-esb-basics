package com.phoenix;

public class Device {
	private String imei;
	private Boolean isImeiValid;
	private String rmaNumber;
	private Boolean isRmaNumberValid;
	private Boolean inWarranty;
	private Boolean findMyiPhone;
	private Boolean wipe;
	private Boolean diagnostic;
	private String destination;

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public Boolean getIsImeiValid() {
		return isImeiValid;
	}

	public void setIsImeiValid(Boolean isImeiValid) {
		this.isImeiValid = isImeiValid;
	}

	public String getRmaNumber() {
		return rmaNumber;
	}

	public void setRmaNumber(String rmaNumber) {
		this.rmaNumber = rmaNumber;
	}

	public Boolean getIsRmaNumberValid() {
		return isRmaNumberValid;
	}

	public void setIsRmaNumberValid(Boolean isRmaNumberValid) {
		this.isRmaNumberValid = isRmaNumberValid;
	}

	public Boolean getFindMyiPhone() {
		return findMyiPhone;
	}

	public void setFindMyiPhone(Boolean findMyiPhone) {
		this.findMyiPhone = findMyiPhone;
	}

	public Boolean getWipe() {
		return wipe;
	}

	public void setWipe(Boolean wipe) {
		this.wipe = wipe;
	}

	public Boolean getDiagnostic() {
		return diagnostic;
	}

	public void setDiagnostic(Boolean diagnostic) {
		this.diagnostic = diagnostic;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Boolean getInWarranty() {
		return inWarranty;
	}

	public void setInWarranty(Boolean inWarranty) {
		this.inWarranty = inWarranty;
	}

}