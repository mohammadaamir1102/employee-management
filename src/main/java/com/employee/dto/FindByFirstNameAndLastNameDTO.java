package com.employee.dto;

public class FindByFirstNameAndLastNameDTO {

	private String firstName;
	private String lastName;

	private FindByFirstNameAndLastNameDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	private FindByFirstNameAndLastNameDTO(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
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

	@Override
	public String toString() {
		return "FindByFirstNameAndLastNameDTO [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
