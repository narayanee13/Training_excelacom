package com.Training;

public class Book {
	private String authorName;
	private int bookId;
	private double price;
	
	public Book(String authorName, int bookId, double price) {
		super();
		// this.authorName refers to the field private String authorName
		// authorName refers to the method argument author
		this.authorName = authorName;
		this.bookId = bookId;
		this.price = price;
	}
	public Book() {
//		super(); Either 'super or 'this' never both => because super/this should be the first line
//		this("keerthana", 103, 450.00);
		super();
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}
