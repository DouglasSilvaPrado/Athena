package com.squad55.athena.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name = "tb_user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Email may not be null")
	private String email;
	@NotBlank(message = "Password may not be null")
	private String password;
	
	@NotBlank
	private Boolean loggedIn;
	
	public User() {
	}


	public User(Long id, @NotBlank(message = "Email may not be null") String email,
			@NotBlank(message = "Password may not be null") String password, @NotBlank Boolean loggedIn) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.loggedIn = loggedIn;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public Boolean isLoggedIn() {
		return loggedIn;
	}


	public void setLoggedIn(Boolean loggedIn) {
		this.loggedIn = loggedIn;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id, email, loggedIn, password);
	}


	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(email, user.email) &&
                Objects.equals(password, user.password);
    }


	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", password=" + password + ", loggedIn=" + loggedIn + "]";
	}
	
	
	
	
	
	
	

}
