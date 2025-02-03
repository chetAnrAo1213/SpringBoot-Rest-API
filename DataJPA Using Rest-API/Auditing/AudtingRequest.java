package com.boot.auditing;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AudtingRequest<T> {
	
	@JsonProperty(value = "userId",required = true)
	private String loggedInUser;
	private String timezone;
	private T employee;
	public String getLoggedInUser() {
		return loggedInUser;
	}
	public void setLoggedInUser(String loggedInUser) {
		this.loggedInUser = loggedInUser;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public T getEmployee() {
		return employee;
	}
	public void setEmployee(T employee) {
		this.employee = employee;
	}
	
	
}
