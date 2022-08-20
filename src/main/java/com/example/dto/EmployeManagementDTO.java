package com.example.dto;

public class EmployeManagementDTO {
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String city;
	private String address;
	private String contact;
	private String isActive;

	public EmployeManagementDTO() {
		super();

	}

	public EmployeManagementDTO(Long id, String firstName, String lastName, String email, String city, String address,
			String contact, String isActive) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.city = city;
		this.address = address;
		this.contact = contact;
		this.isActive = isActive;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "EmployeManagementDTO [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", city=" + city + ", address=" + address + ", contact=" + contact + ", isActive=" + isActive
				+ "]";
	}

}
