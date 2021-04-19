package com.ss.utop.entity;

public class Passenger {
	private Integer passId;
	private Booking bookingID = new Booking();
	private String fName;
	private String lName;
	private String dob;
	private String gender;
	private String address;
	
	public Integer getPassId() {
		return passId;
	}
	public void setPassId(Integer passsId) {
		this.passId = passsId;
	}
	public Booking getBookingID() {
		return bookingID;
	}
	public void setBookingID(Booking bookingID) {
		this.bookingID = bookingID;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
