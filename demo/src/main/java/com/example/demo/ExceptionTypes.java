package com.example.demo;

import java.util.Date;

public class ExceptionTypes {
	
	private Date date;
	private String error;
	private String details;
	

	
	
	
	
	public ExceptionTypes(Date date, String error, String details) {
		super();
		this.date = date;
		this.error = error;
		this.details = details;
		
	}
	public ExceptionTypes() {
		super();
		
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
	
	
	

}
