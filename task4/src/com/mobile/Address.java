package com.mobile;

public class Address {
  private String street;
  private String city;
  private int pinCode;
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getPinCode() {
	return pinCode;
}
public void setPinCode(int pinCode) {
	this.pinCode = pinCode;
}
public Address(String street, String city, int pinCode) {
	super();
	this.street = street;
	this.city = city;
	this.pinCode = pinCode;
}
public Address() {
	super();
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((city == null) ? 0 : city.hashCode());
	result = prime * result + pinCode;
	result = prime * result + ((street == null) ? 0 : street.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Address other = (Address) obj;
	if (city == null) {
		if (other.city != null)
			return false;
	} else if (!city.equals(other.city))
		return false;
	if (pinCode != other.pinCode)
		return false;
	if (street == null) {
		if (other.street != null)
			return false;
	} else if (!street.equals(other.street))
		return false;
	return true;
}
}
