package Entities.Concrete;

import Entities.Abstract.Entity;

public class User implements Entity {
	
	private int id;
	private String firtsName;
	private String lastName;
	private String identityNumber;
	private int dateOfBirth;
	
	public User() {
		
	}
	
	public User(int id, String firtsName, String lastName, String identityNumber, int dateOfBirth) {
		super();
		this.id = id;
		this.firtsName = firtsName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.dateOfBirth = dateOfBirth;
	}
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getFirtsName() {
		return firtsName;
	}

	public void setFirtsName(String firtsName) {
		this.firtsName = firtsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
}
