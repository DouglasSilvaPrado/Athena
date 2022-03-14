package com.squad55.athena.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_registration")
public class Registration {
	
	@EmbeddedId
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
