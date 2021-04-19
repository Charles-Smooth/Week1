package com.ss.utop.entity;

public class Route {
	private Integer id;
	private Airport orgAirport = new Airport();			//need this for 1 route for 1 airport while
	private Airport desAirport = new Airport();			//airports have 1 airport with many routes
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Airport getOrgAirport() {
		return orgAirport;
	}
	public void setOrgAirport(Airport orgAirport) {
		this.orgAirport = orgAirport;
	}
	public Airport getDesAirport() {
		return desAirport;
	}
	public void setDesAirport(Airport desAirport) {
		this.desAirport = desAirport;
	}
}
