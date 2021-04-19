package com.ss.utop.entity;

public class Flight {
	private Integer flightId;
	private Route routeId = new Route();
	private Airplane airplaneId = new Airplane();
	private String departTime;
	private Integer resSeats;
	private Float price;
	
	public Integer getFlightId() {
		return flightId;
	}
	public void setFlightId(Integer flightId) {
		this.flightId = flightId;
	}
	public Route getRouteId() {
		return routeId;
	}
	public void setRouteId(Route routeId) {
		this.routeId = routeId;
	}
	public Airplane getAirplaneId() {
		return airplaneId;
	}
	public void setAirplaneId(Airplane airplaneId) {
		this.airplaneId = airplaneId;
	}
	public String getDepartTime() {
		return departTime;
	}
	public void setDepartTime(String departTime) {
		this.departTime = departTime;
	}
	public Integer getResSeats() {
		return resSeats;
	}
	public void setResSeats(Integer resSeats) {
		this.resSeats = resSeats;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
}
