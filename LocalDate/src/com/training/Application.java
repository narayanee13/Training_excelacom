package com.training;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import com.training.model.Invoice;

public class Application {

	public static void main(String[] args) {

     Invoice narayanee = new Invoice (101, "narayanee", 55, 800, LocalDate.of(2020, Month.OCTOBER, 13));
     
     Invoice keerthana = new Invoice (102, "keerthana", 50, 700, LocalDate.of(2020, 9, 23));
     
     Invoice ram = new Invoice (103, "ram", 45, 600, LocalDate.now());
     
     System.out.println(narayanee);
     System.out.println(keerthana);
     System.out.println(ram);

     LocalDate ramDate = ram.getInvoiceDate();
     System.out.println(ramDate.plusYears(2));
     System.out.println(ramDate.plusMonths(5));
     
     LocalDate birthDate = LocalDate.of(1999, Month.OCTOBER, 13);
     LocalDate today = LocalDate.now();
     
     long years = today.getYear()-birthDate.getYear();
     long months = today.getMonthValue()-birthDate.getMonthValue();
     
     System.out.println("age: "+years + "years, Month : "+months);
     
     String date ="2022-01-03";
     LocalDate firstDayOf2022 = LocalDate.parse(date);
     System.out.println(firstDayOf2022.getDayOfWeek());
     String birthDateAsString = birthDate.toString();
     System.out.println(birthDateAsString);
     
     LocalDateTime dateTime = LocalDateTime.now();
     System.out.println(dateTime);
    
	}

}
