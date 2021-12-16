package com.customers;

import com.employee.*;
import com.hotel.*;
public class TestConstructors {

	public static void main(String[] args) {
     Customers cus = new Customers();
     cus.setCustomerName("keerthana");
     cus.setCustomerId(21);
     cus.setBill(7790.67);
     
     System.out.println(cus.getCustomerName()+" " +cus.getCustomerId()+" "+cus.getBill());
     
     Employee emp = new Employee();
     emp.setEmployeeName("narayanee");
     emp.setEmpId(101);
     emp.setSalary(20000);;
     
     System.out.println(emp.getEmployeeName()+" "+ emp.getEmpId()+" "+ emp.getSalary());
     
     Hotel h = new Hotel();
     h.setHotelName("ABC Hotel");
     h.setRoomNumber(222);
     h.setPrice(67000.756);
     
     System.out.println(h.getHotelName()+" "+ h.getRoomNumber()+" "+ h.getPrice());
     
     EmployeeService sal = new EmployeeService();
     System.out.println(sal.calculateBonus(emp));
	}

}
