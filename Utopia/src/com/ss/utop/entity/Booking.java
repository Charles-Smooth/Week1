package com.ss.utop.entity;

public class Booking {
	private Integer id;
	private Integer active;			//tiny int?
	private String confermationCode;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getActive() {
		return active;
	}
	public void setActive(Integer active) {
		this.active = active;
	}
	public String getConfermationCode() {
		return confermationCode;
	}
	public void setConfermationCode(String confermationCode) {
		this.confermationCode = confermationCode;
	}
}
