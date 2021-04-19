package com.ss.utop.entity;

public class Airplane {
	private Integer apId;
	private AirplaneType type = new AirplaneType();

	public Integer getAPId() {
		return apId;
	}
	public void setAPId(Integer typeId) {
		this.apId = typeId;
	}
	public AirplaneType getType() {
		return type;
	}
	public void setType(AirplaneType type) {
		this.type = type;
	}	
}
