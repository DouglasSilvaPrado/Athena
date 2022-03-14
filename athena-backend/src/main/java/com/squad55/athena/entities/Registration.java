package com.squad55.athena.entities;

public class Registration {
	
	private RegistrationPK id = new RegistrationPK();
	
	private String date;
	
	public Registration() {
		
	}
	
	public void setCourse(Course course) {
		id.setCourse(course);
	}
	
	public void setUser(User user) {
		id.setUser(user);
	}

	public RegistrationPK getId() {
		return id;
	}

	public void setId(RegistrationPK id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	

}
