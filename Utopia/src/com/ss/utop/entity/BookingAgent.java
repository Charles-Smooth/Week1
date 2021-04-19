package com.ss.utop.entity;

public class BookingAgent {
	private Booking bookingAgentId = new Booking();			//booking id is the fk to booking agent
	private Integer agentId;
	
	public Booking getBookingAgentId() {
		return bookingAgentId;
	}
	public void setBookingAgentId(Booking bookingAgentId) {
		this.bookingAgentId = bookingAgentId;
	}
	public Integer getAgentId() {
		return agentId;
	}
	public void setAgentId(Integer agentId) {
		this.agentId = agentId;
	}				
}
