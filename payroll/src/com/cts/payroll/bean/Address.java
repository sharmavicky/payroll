package com.cts.payroll.bean;

public class Address {
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [address1=");
		builder.append(address1);
		builder.append(", address2=");
		builder.append(address2);
		builder.append(", locality=");
		builder.append(locality);
		builder.append(", pincode=");
		builder.append(pincode);
		builder.append(", id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}

	private String address1;
	private String address2;
	private String locality;
	private String pincode;
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

}
