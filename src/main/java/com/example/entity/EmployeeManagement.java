package com.example.entity;

import com.example.constent.RegexConstant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.*;

@Entity
@Table(name = "employee_management")
public class EmployeeManagement {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotBlank(message = "First Name is required & ALPHABETS ONLY !")
	@Pattern(regexp = RegexConstant.ALPHABETS_ONLY)
	private String firstName;
	@NotBlank(message = "Last Name is required & ALPHABETS ONLY !")
	@Pattern(regexp = RegexConstant.ALPHABETS_ONLY)
	private String lastName;
	@Pattern(regexp = RegexConstant.EMAIL, message = "Mail Should be Proper !")
	private String email;
	@NotBlank(message = "City is required & ALPHABETS ONLY !")
	@Pattern(regexp = RegexConstant.ALPHABETS_ONLY)
	private String city;
	@NotBlank(message = "Address is required & ALPHANUMERIC ONLY !")
	@Pattern(regexp = RegexConstant.ALPHANUMERIC_ONLY)
	private String address;
	@NotBlank(message = "Contact is required & NUMBERS ONLY !")
	@Pattern(regexp = RegexConstant.NUMBERS_ONLY)
	private String contact;
	@NotBlank(message = "isActive is required & ALPHABETS ONLY!")
	@Pattern(regexp = RegexConstant.ALPHABETS_ONLY)
	private String isActive;

	public EmployeeManagement() {

	}

	public EmployeeManagement(Long id, String firstName, String lastName, String email, String city, String address,
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
		return "EmployeeManagement [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", city=" + city + ", address=" + address + ", contact=" + contact + ", isActive=" + isActive
				+ "]";
	}

}
