package Entities;

import java.time.LocalDate;

public class Customer {
	
 private int id; 
 private String firstName;
 private String lastName;
 private String NationalityId;
 private LocalDate  DateOfBirth ;
 
public Customer(int id, String firstName, String lastName, String nationalityId, LocalDate DateOfBirth) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.NationalityId = nationalityId;
	this.DateOfBirth =DateOfBirth;
}





public LocalDate getDateOfBirth() {
	return DateOfBirth;
}





public void setDateOfBirth(LocalDate dateOfBirth) {
	DateOfBirth = dateOfBirth;
}





public int getId() {
	return id;
}

public void setId(int id) {
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

public String getNationalityId() {
	return NationalityId;
}

public void setNationalityId(String nationalityId) {
	NationalityId = nationalityId;
}
}
