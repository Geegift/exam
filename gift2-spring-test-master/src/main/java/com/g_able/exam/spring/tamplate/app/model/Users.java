package com.g_able.exam.spring.tamplate.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "users")
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@NotNull
	private String username;
	@NotNull
	private String password;
	@NotNull
	private String fullname;
	@NotNull
	private String address;
	@NotNull
	private String email;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return fullname;
	}

	public void setName(String name) {
		this.fullname = name;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", email=" + email + ", name=" + fullname + "]";
	}

	public Users(long id) {
		super();
		this.id = id;
	}

	public Users(String email, String name) {
		super();
		this.email = email;
		this.fullname = name;
	}

	public Users() {
		super();
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public Users(String username, String password, String fullname, String address, String email) {
		super();
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.address = address;
		this.email = email;
	}

}
