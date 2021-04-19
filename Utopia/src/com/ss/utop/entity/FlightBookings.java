package com.ss.utop.entity;

public class FlightBookings {
	private Flight flightBookingId = new Flight();
	private Booking bookingId = new Booking();
	
	public Flight getFlightBookingId() {
		return flightBookingId;
	}
	public void setFlightBookingId(Flight flightBookingId) {
		this.flightBookingId = flightBookingId;
	}
	public Booking getBookingId() {
		return bookingId;
	}
	public void setBookingId(Booking bookingId) {
		this.bookingId = bookingId;
	}
}
