package com.training;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import com.training.model.Invoice;

public class InvoiceService {

	 public static List<Invoice> getInvoice(){
		 ArrayList<Invoice> invoiceList = new ArrayList();
	      
		 Invoice anand = new Invoice(101, "anand", 55, 800, LocalDate.of(2020, Month.OCTOBER, 13));
		 Invoice dravid = new Invoice(102, "dravid", 100, 900, LocalDate.of(2020, Month.AUGUST, 13));
		 Invoice zahir = new Invoice(103, "zahir", 122, 650, LocalDate.of(2020, Month.FEBRUARY, 13));
		 Invoice chandru = new Invoice(104, "chandru", 39, 1000, LocalDate.of(2020, Month.OCTOBER, 13));
		 Invoice ramesh = new Invoice(105, "ramesh", 80, 760, LocalDate.of(2020, Month.MAY, 13));

	      
		 invoiceList.add(ramesh);
		 invoiceList.add(anand);
		 invoiceList.add(zahir);
		 invoiceList.add(chandru);
		 invoiceList.add(dravid);
	      
	      return invoiceList;
	 }
}
