package com.book;

import java.util.*;
public class main {

	public static void main(String[] args) {    
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Book b = new Book(102, "java", "keerthana", 1500);
		System.out.println(b.getPrice());
		BookService bs = new BookService();
		System.out.println(bs.discount(b));
		System.out.println(bs.discount(b, str));
		
	}

}
