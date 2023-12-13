package com.example.eclipsmvcdemo.Model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Student {
	
	@NotNull(message = "is requried")
//	@Min(value = 3,message = "minimum 3 char requried")
	@Pattern(regexp = "^[0-9]",message = "no Alpha-Numaric only strings ")
	@Size(min=3,message = "min 3 char is requried")
	private String firstName;
	
	@NotNull(message = "is requried")
	private String lastName;
	
	@NotNull(message = "is requried")
	private String address;
	
	@NotNull(message = "is requried")
	private String country;
	
	@NotNull(message = "is requried")
	private String state;
	
	@NotNull(message = "is requried")
	private String gender;
	
	@NotNull(message = "is requried")
	private String programmingLang;
	
	
	public Student()
	{
		
	}
	

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getProgrammingLang() {
		return programmingLang;
	}

	public void setProgrammingLang(String programmingLang) {
		this.programmingLang = programmingLang;
	}

	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Student(
			@NotNull(message = "is requried") @Min(value = 3, message = "minimum 3 char requried") @Pattern(regexp = "^[a-zA-z]", message = "no Alpha-Numaric only strings ") String firstName,
			@NotNull(message = "is requried") String lastName, @NotNull(message = "is requried") String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + "]";
	}
	
	

}
