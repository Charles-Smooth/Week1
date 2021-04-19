package com.ss.utop.entity;

public class BookingUser {
	private Booking bookingUserId = new Booking();
	private Integer userId;
	
	public Booking getBookingUserId() {
		return bookingUserId;
	}
	public void setBookingUserId(Booking bookingUserId) {
		this.bookingUserId = bookingUserId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
}
