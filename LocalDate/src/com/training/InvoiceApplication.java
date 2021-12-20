package com.training;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.time.LocalDate;

import static java.util.stream.Collectors.*;

import java.time.LocalDate;
import com.training.model.Invoice;

public class InvoiceApplication {
	public static double getMaxQuantity(Collection<Invoice> invoiceList) {
		List<Invoice> list = InvoiceService.getInvoice();
        Optional<Double> maxQuantity = list.stream().map(e->e.getQuantity()).max(Double::compareTo);		
		return maxQuantity.get();
	}

	public static List<Invoice> sortedByRatePerUnitAscending(Collection<Invoice> invoiceList){
		List<Invoice> list = InvoiceService.getInvoice();
		Comparator<Invoice> rateComparator = Comparator.comparing(Invoice::getRatePerUnit);
		List<Invoice> inList = list
		.stream()
		.sorted(rateComparator)
		.collect(toList());
		return inList;
	}
	public static Map<String, LocalDate> mapViewOfList(Collection<Invoice> invoiceList) {
		List<Invoice> list = InvoiceService.getInvoice();
         return list.stream()
        		.collect(Collectors.toMap(Invoice::getCustomerName, Invoice::getInvoiceDate));
        
	}
	public static Set<Invoice> setViewOfList(Collection<Invoice> invoiceList, Predicate<Invoice> predicate){
		
		Set<Invoice> set = invoiceList.stream().filter(predicate).collect(toSet());
		return set;
		
		
	}
	public static void main(String[] args) {
		System.out.println("sort by rate per unit");
		List<Invoice> list = InvoiceService.getInvoice();
		sortedByRatePerUnitAscending(list).forEach(System.out::println);
		System.out.println(getMaxQuantity(list));
	    
        Set<Entry<String, LocalDate>> set = mapViewOfList(list).entrySet();
        for(Entry<String, LocalDate> eachEntry : set) {
        	System.out.println(eachEntry.getKey() + ":" +eachEntry.getValue());
        }
        
        Predicate<Invoice> viewList = e->e.getCustomerName().contains("anand");
        System.out.println(setViewOfList(list, viewList));


	}

}
