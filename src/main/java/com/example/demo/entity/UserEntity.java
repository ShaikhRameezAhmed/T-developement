package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "UserDetails")
public class UserEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 999861692305194974L;
	
	@Id
	@GeneratedValue
	private long ID;
	
	@Column (nullable = false)
	private String userId;
	
	
	@Column (nullable = false, length = 50)
	private String firstName;
	
	@Column (nullable = false, length = 50)
	private String lastName;
	
	@Column (nullable = false, length = 20)
	private String dob;
	
	@Column (nullable = false, length = 120)
	private String email;
	
	@Column (nullable = false)
	private String password;
	
	@Column (nullable = false)
	private String encryptedPassword;
	
	
	@Column (nullable = false)
	private boolean emailVerificationStatus = false;
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDob() {
		return dob; 
	}
	public void setDob(String dob) {
		this.dob = dob;
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
	public String getEncryptedPassword() {
		return encryptedPassword;
	}
	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}
	public boolean isEmailVerificationStatus() {
		return emailVerificationStatus;
	}
	public void setEmailVerificationStatus(boolean emailVerificationStatus) {
		this.emailVerificationStatus = emailVerificationStatus;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	

}
