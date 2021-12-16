package com.book;

public class BookService {
 public double discount(Book b) {
	 double dis=0;
	 if(b.getPrice() <= 500) {
		  dis = b.getPrice()*0.05;
	 }
	 else if(b.getPrice()>500 && b.getPrice()<=1000){
		  dis = b.getPrice()*0.10;
	 }
	 else if(b.getPrice()>1000) {
		  dis = b.getPrice()*0.12;
	 }	
	 return dis;
 }
 
public double discount(Book b, String customerType) {
	 double dis=0;
	 switch(customerType) {
	 case "retail":
		 if(b.getPrice() <= 500) {
			  dis = b.getPrice()*0.07;
		 }
		 else if(b.getPrice()>500 && b.getPrice()<=1000){
			  dis = b.getPrice()*0.12;
		 }
		 else if(b.getPrice()>1000) {
			  dis = b.getPrice()*0.15;
			  
		 }	
		 break;
	 case "corporate":
		 if(b.getPrice() <= 500) {
			  dis = b.getPrice()*0.05;
		 }
		 else if(b.getPrice()>500 && b.getPrice()<=1000){
			  dis = b.getPrice()*0.10;
		 }
		 else if(b.getPrice()>1000) {
			  dis = b.getPrice()*0.12;
		 }		
		 break;
		 }
	return dis;
	 }
 }

