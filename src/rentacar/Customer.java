package rentacar;

import all.CreditCardPortal;

public class Customer {            
/*
  	There should be full name of the customer
	There should be address information of a customer
	There should be SSN number of customer that contains just 10 digits, no spec chars or chars
	There should be Credit card Information of a customer
	
*/	
	//Here I am writing notes
	//here Not commit8
	String firstName;
	String lastName;
	String address;
	String SSN;
	protected CreditCardPortal creditCard;
	protected Location location;
	
	public CreditCardPortal getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(CreditCardPortal creditCard) {
		this.creditCard = creditCard;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	int expiryDate;
	int cvv;
	
	
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
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	
	public int getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(int expiryDate) {
		this.expiryDate = expiryDate;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	
	
	
	
	
	
}
