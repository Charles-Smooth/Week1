package com.ss.utop.entity;

public class BookingPayment {
	private Booking bookingPaymentId = new Booking();
	private String stripe;
	private Integer refund;		//tiny int
	
	public Booking getBookingPaymentId() {
		return bookingPaymentId;
	}
	public void setBookingPaymentId(Booking bookingPaymentId) {
		this.bookingPaymentId = bookingPaymentId;
	}
	public String getStripe() {
		return stripe;
	}
	public void setStripe(String stripe) {
		this.stripe = stripe;
	}
	public Integer getRefund() {
		return refund;
	}
	public void setRefund(Integer refund) {
		this.refund = refund;
	}
}
