package com.hotel;

public class Hotel {
 public String getHotelName() {
		return HotelName;
	}
	public void setHotelName(String hotelName) {
		HotelName = hotelName;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
private String HotelName;
 private int roomNumber;
 private double price;
public Hotel(String hotelName, int roomNumber, double price) {
	super();
	HotelName = hotelName;
	this.roomNumber = roomNumber;
	this.price = price;
}
public Hotel() {
	super();
	// TODO Auto-generated constructor stub
}
 
}
