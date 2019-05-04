package com.capgemini.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TraineeDetails {

	@Id
	private int tId;
	private String tName;
	private String tLocation;
	private String tDomian;
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	public String gettLocation() {
		return tLocation;
	}
	public void settLocation(String tLocation) {
		this.tLocation = tLocation;
	}
	public String gettDomian() {
		return tDomian;
	}
	public void settDomian(String tDomian) {
		this.tDomian = tDomian;
	}
	
}
